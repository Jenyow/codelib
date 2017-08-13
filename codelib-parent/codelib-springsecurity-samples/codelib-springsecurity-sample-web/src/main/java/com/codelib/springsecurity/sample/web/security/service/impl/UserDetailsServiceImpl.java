package com.codelib.springsecurity.sample.web.security.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codelib.springsecurity.sample.web.pojo.User;
import com.codelib.springsecurity.sample.web.service.UserService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired(required = true)
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final User user = userService.loadUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + " cannot be found");
		}
		final Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("USER"));// 此处设置用户角色为USER,只是为了简单对应起来
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				authorities);
	}

}
