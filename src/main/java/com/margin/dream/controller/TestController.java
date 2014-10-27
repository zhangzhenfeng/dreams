package com.margin.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.margin.dream.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "login", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
	public String login(){
		System.out.println("111111111111");
		testService.test();
		
		return "success";
	}
}
