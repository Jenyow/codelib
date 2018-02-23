package com.codelib.web.ui.sample.validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValidateController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testPage() {
        return "/test";
    }
    
    
    @RequestMapping(value = "/formsubmit", method = RequestMethod.POST)
    @ResponseBody
    public String formsubmit(String name, int age) {
        return "true";
    }
    
    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    @ResponseBody
    public String validate(String name) {
        if ("aa".equals(name)) {
            return "false";
        } else {
            return "true";
        }
    }
}
