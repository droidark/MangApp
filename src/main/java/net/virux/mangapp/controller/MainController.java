package net.virux.mangapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import net.virux.mangapp.model.User;
import net.virux.mangapp.service.UserService;
import net.virux.mangapp.service.impl.SendEmailService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SendEmailService sendEmailService;
	
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String indexPage(ModelMap model){
		
		sendEmailService.readySendEmail("octavio.avarezdelcastillo@gmail.com", "crossfozz@gmail.com", "titulo", 
				"cuerpo del mensaje");
		
		model.addAttribute("username", "lord cabula");
		return "index";
	}
	
	@RequestMapping(value = {"/join"}, method = RequestMethod.GET)
	public String joinPage(ModelMap model){
		model.put("command", new User());
		return "join";
	}
	
	@RequestMapping(value = {"/confirm"}, method = RequestMethod.POST)
	public String confirmPage(@ModelAttribute("command") User usr, 
			BindingResult result, ModelMap model){
		userService.addUser(usr);
		model.addAttribute("username", usr.getUsername());
		return "confirm";
	}
	
	public String login(@RequestParam(value = "error", required = false) String error, 
			@RequestParam(value = "logout", required = false) String logout, 
			HttpServletRequest request, ModelMap model){
		
		if(error != null){
			model.addAttribute("error", getErrorMessage(request, 
					"SPRING_SECURITY_LAST_EXCEPTION"));
		}
		if (logout != null) {
			model.addAttribute("msg", "Sesión iniciada correctamente");
		}
		
		return "login";
	}
	
	
	//	ADMIN CONTROLLER
	@RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
	public String adminIndex(ModelMap model){
		model.addAttribute("user", "Spring Security Hello World");
		return "adminIndex";
	}
		
	//	ADMIN CONTROLLER
	@RequestMapping(value = {"/manage"}, method = RequestMethod.GET)
	public String manageIndex(ModelMap model){
		model.addAttribute("user", "Spring Security Hello World");
		return "userAdmin";
	}
	
	
	private String getErrorMessage(HttpServletRequest request, String key){
		Exception exception = (Exception) request.getSession().getAttribute(key);
		String error = "";
		if(exception instanceof BadCredentialsException){
			error = "Nombre de usuario o contraseña no validos";
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else {
			error = "Nombre de usuario o contraseña no validos";
		}
		
		return error;
	}

}
