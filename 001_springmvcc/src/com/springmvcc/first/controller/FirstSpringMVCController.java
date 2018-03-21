package com.springmvcc.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "hello";
	}
	@RequestMapping("/message")
	public String sendMessage(Model m)
	{
		m.addAttribute("mymessage","hello from spring mvc ");
		return "kitchen";
	}
	@RequestMapping("/supermessage")
	
		public ModelAndView sendsupermessage(ModelAndView mv)
		{
		mv.addObject("food", "hello from model and view");
		mv.setViewName("canteen");
		return mv;
		
	}
}
