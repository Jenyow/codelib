package com.codelib.springboot.springmvc.jsp.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSTLTestController {

	@RequestMapping("jstlTest")
	public String jstlModel() {
		return "jstlTest";
	}
	
}
