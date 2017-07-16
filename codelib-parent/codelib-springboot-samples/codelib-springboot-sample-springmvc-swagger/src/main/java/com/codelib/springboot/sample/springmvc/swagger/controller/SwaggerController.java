package com.codelib.springboot.sample.springmvc.swagger.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/swagger", produces = { APPLICATION_JSON_UTF8_VALUE })
public class SwaggerController {

	@RequestMapping(value = "test1", method = RequestMethod.GET)
	@ApiOperation(value = "test2", httpMethod = "GET", response = String.class, notes = "test3")
	public ResponseEntity<String> test1() {
		HttpHeaders headers = new HttpHeaders();  
        headers.setContentType(MediaType.TEXT_PLAIN);  
		String string = "test1";
		return new ResponseEntity<String>(string, headers, HttpStatus.OK);
	}

}
