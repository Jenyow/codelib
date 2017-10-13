package com.codelib.springboot.sample.springmvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class APPController {

	@RequestMapping(value="openOrDownloadApp", method=RequestMethod.GET)
	public String openOrDownloadApp() {
		return "openordownloadapp";
	}
	
}
