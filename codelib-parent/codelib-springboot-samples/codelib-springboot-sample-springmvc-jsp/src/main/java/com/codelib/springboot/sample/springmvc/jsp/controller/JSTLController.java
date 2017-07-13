package com.codelib.springboot.sample.springmvc.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JSTLController {

	@RequestMapping(value="jstlCoreSample", method=RequestMethod.GET)
	public String jstlCoreSample(ModelMap model) {
		String str = "&lt;Hello World!&gt;";
		String nullStr = null;
		String splitStr = "1;2;3;4;5";
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("!");
		model.addAttribute("str", str);
		model.addAttribute("nullStr", nullStr);
		model.addAttribute("splitStr", splitStr);
		model.addAttribute("list", list);
		return "jstlCoreSample";
	}
	
	@RequestMapping(value="jstlFmtSample", method=RequestMethod.GET)
	public String jstlFmtSample(ModelMap model) {
		model.addAttribute("balance", 120000.2309);
		return "jstlFmtSample";
	}
	
	@RequestMapping(value="jstlFnSample", method=RequestMethod.GET)
	public String jstlFnSample(ModelMap model) {
		String theString = "I am from runoob";
		model.addAttribute("theString", theString);
		return "jstlFnSample";
	}
}
