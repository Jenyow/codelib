package com.codelib.springboot.sample.springmvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String sayHelloWorld() {
        return "/helloworld";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String download() {
        return "/download";
    }
}
