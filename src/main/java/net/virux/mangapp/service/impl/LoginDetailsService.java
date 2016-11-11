package net.virux.mangapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.virux.mangapp.dao.UserDao;
import net.virux.mangapp.model.Profile;

@Service("LoginDetailsService")
public class LoginDetailsService implements UserDetailsService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(final String username) 
			throws UsernameNotFoundException {
		net.virux.mangapp.model.User user = userDao.getUser(username);
		if(user == null){
			throw new UsernameNotFoundException("Username not found");
		}
		return new User(user.getUsername(), user.getPassword(), 
				user.getState().equals("Active"), true, true, true, 
				getGrantedAuthority(user));
	}
	
	private List<GrantedAuthority> getGrantedAuthority(net.virux.mangapp.model.User user){
		List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		for(Profile profile : user.getProfiles()){
			auth.add(new SimpleGrantedAuthority("ROLE_" + profile.getProfile()));
		}
		return auth;
	}
}