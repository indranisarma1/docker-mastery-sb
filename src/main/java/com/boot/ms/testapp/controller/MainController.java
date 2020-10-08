package com.boot.ms.testapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	
	@RequestMapping("/")
    public String direct(Authentication authUser, ModelMap model, HttpServletRequest request) {
		
		logger.debug("User logedin :"+authUser.getName()+"/"+authUser.getCredentials());
		request.getSession().setAttribute("userName",authUser.getName());
		return "home";
		//return "redirect:/products";
		
		
	}
	

	@RequestMapping(value ="/logout", method=RequestMethod.GET)
	public String logout(ModelMap model, SessionStatus status,  HttpSession httpsession) {
		model.clear();
	    status.setComplete();
	    httpsession.invalidate();
		return "login";
	}
	
	
	

}
