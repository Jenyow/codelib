package com.codelib.springsecurity.sample.web.service;

import com.codelib.springsecurity.sample.web.pojo.User;

public interface UserService {

	public User loadUserByUsername(String username);

}
