package com.codelib.springboot.sample.springmvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PDFContruller {

	@RequestMapping(value="showpdf", method=RequestMethod.GET)
	public String showPDF() {
		return "showpdf";
	}
	
}
