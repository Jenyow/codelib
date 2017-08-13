package com.codelib.springsecurity.sample.web.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codelib.springsecurity.sample.web.service.RegisterService;

@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@Resource
	private RegisterService registerService;
 
	/**
	 * 跳转到登录页面
	 * @return
	 */
	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerUser(String username, String password) {
		boolean isSuccessRegister = registerService.registerUser(username, password);
		if (isSuccessRegister) {
			return new ModelAndView("/login");
		} else {
			return new ModelAndView("/register");
		}
		
	}
	
}
