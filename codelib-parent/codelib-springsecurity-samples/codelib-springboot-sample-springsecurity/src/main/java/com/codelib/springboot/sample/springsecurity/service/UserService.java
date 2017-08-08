package com.codelib.springboot.sample.springsecurity.service;

import com.codelib.springboot.sample.springsecurity.pojo.User;

public interface UserService {

	public User loadUserByUsername(String username);

}
