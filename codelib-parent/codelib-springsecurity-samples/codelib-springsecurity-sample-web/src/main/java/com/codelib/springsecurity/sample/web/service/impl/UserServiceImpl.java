package com.codelib.springsecurity.sample.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codelib.springsecurity.sample.web.mapper.UserMapper;
import com.codelib.springsecurity.sample.web.pojo.User;
import com.codelib.springsecurity.sample.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User loadUserByUsername(String username) {
		User user = userMapper.loadUserByUsername(username);
		return user;
	}

}
