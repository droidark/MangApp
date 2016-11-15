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
import org.springframework.web.servlet.ModelAndView;

import net.virux.mangapp.model.User;
import net.virux.mangapp.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String indexPage(ModelMap model){
		model.addAttribute("username", "lord cabula");
		return "index";
	}
	
//	public ModelAndView indexPage(){
//		User user = userService.getUser(1);
//		System.out.println(user.getProfiles());
//		
//		ModelAndView model = new ModelAndView();
//		model.addObject("title", "Spring Security Hello World");
//		model.addObject("message","This is welcome page!");
//		model.setViewName("index");
//		return model;
//	}
	
	@RequestMapping(value = {"/join"}, method = RequestMethod.GET)
	public String joinPage(ModelMap model){
		model.put("command", new User());
		return "join";
	}
	
//	public ModelAndView joinPage(){
//		return new ModelAndView("join", "command", new User());
//	}
	
	@RequestMapping(value = {"/confirm"}, method = RequestMethod.POST)
	public String confirmPage(@ModelAttribute("command") User usr, 
			BindingResult result, ModelMap model){
		userService.addUser(usr);
		model.addAttribute("username", usr.getUsername());
		return "confirm";
	}
	
//	public ModelAndView confirmPage(@ModelAttribute("command") User usr, 
//			BindingResult result, ModelMap model){
//		userService.addUser(usr);
//		model.addAttribute("username", usr.getUsername());
//		return new ModelAndView("confirm");
//	}
	
	@RequestMapping(value = {"/login"})
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
	
//	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout, 
//			HttpServletRequest request){
//		ModelAndView model = new ModelAndView();
//		
//		if(error != null){
//			model.addObject("error", getErrorMessage(request, 
//					"SPRING_SECURITY_LAST_EXCEPTION"));
//		}
//		if (logout != null) {
//			model.addObject("msg", "Sesión iniciada correctamente");
//		}
//		model.setViewName("login");
//		return model;
//	}
	
	//	ADMIN CONTROLLER
	@RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
	public String adminIndex(ModelMap model){
		model.addAttribute("user", "Spring Security Hello World");
		return "adminIndex";
	}
	
//	public ModelAndView adminIndex(){
//		ModelAndView model = new ModelAndView();
//		model.addObject("user", "Spring Security Hello World");
//		model.setViewName("adminIndex");
//		return model;
//	}
	
	//	ADMIN CONTROLLER
	@RequestMapping(value = {"/manage"}, method = RequestMethod.GET)
	public String manageIndex(ModelMap model){
		model.addAttribute("user", "Spring Security Hello World");
		return "userAdmin";
	}
	
//	public ModelAndView manageIndex(){
//		ModelAndView model = new ModelAndView();
//		model.addObject("user", "Spring Security Hello World");
//		model.setViewName("userAdmin");
//		return model;
//	}
	
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
