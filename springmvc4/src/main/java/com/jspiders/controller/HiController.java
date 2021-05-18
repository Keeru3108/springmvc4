package com.jspiders.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiController{
	
	@RequestMapping("welcome2")
	public ModelAndView helloworld1()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Welcome to India");
		return modelandview;
	}
	
	@RequestMapping("ByeBye1")
	public ModelAndView helloworld2()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "I am running out of time.....!!!");
		return modelandview;
	}
	
  
}
