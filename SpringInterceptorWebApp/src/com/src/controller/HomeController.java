package com.src.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.src.util.SessionUtil;


@Controller
public class HomeController {
	
	/* See more at: http://javawebtutor.com/articles/spring/spring-mvc-hibernate-crud-example.php#sthash.fNWv1Y32.dpuf */	
	
	@RequestMapping("/")
	public ModelAndView context(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Welcome To TheProject");
		System.out.println("LOG IN ");
		
		return new ModelAndView("redirect:/login"); 
	}
	
	// -- LOG IN -- 
	@RequestMapping(value="/login", method=RequestMethod.GET )
	public ModelAndView login(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("... login ...");
		
		return new ModelAndView("login");
	}
	
	
	@RequestMapping(value="/loginUser", method=RequestMethod.GET )
	public ModelAndView loginUser(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("... loginUser ...");
		
		SessionUtil.createSession(session, 1, "SpringUser");
		
		return new ModelAndView("redirect:/dashboard");
	}
	
	// -- DASHBOARD -- 
	@RequestMapping(value="/dashboard", method=RequestMethod.GET )
	public ModelAndView dashboard(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("... dashboard ...");
		
		return new ModelAndView("dashboard");
	}
	
	// -- HOME -- 
	@RequestMapping(value="/home", method=RequestMethod.GET )
	public ModelAndView home(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("... home ...");
			
		
			
		return new ModelAndView("home");
	}
	
	// -- LOG OUT -- 
	@RequestMapping(value="/logout", method=RequestMethod.GET )
	public ModelAndView logout(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("... logout ...");
				
		SessionUtil.InvalidateSession(session);	
				
		return new ModelAndView("redirect:/login");
	}
	
	
}
