package com.codelib.web.ui.sample.autocomplete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutoCompleteController {

	@RequestMapping(value = "/default")
	public String defaultPage() {
		return "default";
	}
	
	@RequestMapping(value = "/categories")
	public String categories() {
		return "categories";
	}
	
	@RequestMapping(value = "/combobox")
	public String combobox() {
		return "combobox";
	}
}
