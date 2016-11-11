package net.virux.mangapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.virux.mangapp.model.User;
import net.virux.mangapp.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public ModelAndView indexPage(){
		User user = userService.getUser(1);
		System.out.println(user);
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message","This is welcome page!");
		model.setViewName("index");
		return model;
	}

}
