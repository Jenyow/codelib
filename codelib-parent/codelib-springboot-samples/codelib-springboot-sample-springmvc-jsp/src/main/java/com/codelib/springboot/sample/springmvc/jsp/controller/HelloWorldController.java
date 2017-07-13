package com.codelib.springboot.sample.springmvc.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String sayHelloWorld() {
		return "helloWorld";
	}
}
