package com.codelib.springboot.sample.springmvc.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JSTLTestController {

	@RequestMapping(value="jstlTest", method=RequestMethod.GET)
	public String jstlModel() {
		
		return "jstlTest";
	}
	
}
