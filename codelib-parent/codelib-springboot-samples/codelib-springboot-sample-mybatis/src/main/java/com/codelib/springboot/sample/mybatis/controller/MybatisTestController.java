package com.codelib.springboot.sample.mybatis.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codelib.springboot.sample.mybatis.service.GroupService;

@RestController
public class MybatisTestController {

	@Resource(name = "groupServiceImpl")
	private GroupService groupService;
	
	@RequestMapping(value = "/getid")
	public String getGroup() {
		String result = groupService.selectByPrimaryKey(1L).toString();
		return result;
	}
	
}
