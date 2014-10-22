package com.margin.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value = "login", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
	public String login(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("");
		return "success";
	}
}
