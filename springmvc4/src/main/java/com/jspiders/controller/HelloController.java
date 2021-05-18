package com.jspiders.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class HelloController{
	
	@RequestMapping("/studentform")
	public ModelAndView helloworld1()
	{
		ModelAndView modelandview = new ModelAndView("StudentForm");
		//modelandview.addObject("msg", "Good Morning Bangalore");
		return modelandview;
	}
	
	@RequestMapping("/submitStudentForm.html")//PostMapping
	public ModelAndView helloworld2(@RequestParam("studentName") String name,@RequestParam("studentid") String id,@RequestParam("Age") int age,@RequestParam("phone") double phoneno)
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		Student s1=new Student();
		s1.setName(name);
		s1.setId(id);
		s1.setAge(age);
		s1.setPhoneno(phoneno);
		modelandview.addObject("msg","The Application Form has submitted Successfully....Student details are below:");
		modelandview.addObject("name", name);
		modelandview.addObject("id",id);
		modelandview.addObject("age",age);
		modelandview.addObject("phoneno",phoneno);
		//modelandview.addObject(s1);
		
		return modelandview;
	}
	
  
}
