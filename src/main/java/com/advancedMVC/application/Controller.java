package com.advancedMVC.application;

import com.advancedMVC.application.model.Users;
import com.advancedMVC.application.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Kevin Neag
 */
@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	UserServiceInterface userServiceInterface;

    	@RequestMapping(value={"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@RequestMapping(value={"login"}, method = RequestMethod.GET)
	public ModelAndView register(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}


//	@RequestMapping(value="/registration", method = RequestMethod.GET)
//	public ModelAndView registration(){
//		ModelAndView modelAndView = new ModelAndView();
//		Users user = new Users();
//		modelAndView.addObject("user", user);
//		modelAndView.setViewName("registration");
//		return modelAndView;
//	}
}
