package net.virux.mangapp.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse, Authentication authentication)
			throws IOException, ServletException {
		
		HttpSession httpSession = httpServletRequest.getSession();
		User authUser = (User) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		httpSession.setAttribute("username", authUser.getUsername());
		httpSession.setAttribute("authorities", authentication.getAuthorities());
		
		httpServletResponse.setStatus(HttpServletResponse.SC_OK);
		
		String targetUrl = determineTargetUrl(authentication);
		
		httpServletResponse.sendRedirect(targetUrl);
	}
	
	protected String determineTargetUrl(Authentication authentication){
		String url = "";
		
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		List<String> roles = new ArrayList<String>();
		
		for(GrantedAuthority a : authorities){
			roles.add(a.getAuthority());
		}
		
		if (isUser(roles)) {
			url = "manage";
		} else if (isAdmin(roles)) {
			url = "admin";
		}
		
		return url;
	}
	
	private boolean isUser(List<String> roles){
		if (roles.contains("ROLE_USER")) {
			return true;
		}
		return false;
	}
	
	private boolean isAdmin(List<String> roles){
		if (roles.contains("ROLE_ADMIN")) {
			return true;
		}
		return false;
	}

}
