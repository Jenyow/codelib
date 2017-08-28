package com.codelib.springsecurity.sample.web.security.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codelib.springsecurity.sample.web.pojo.Authority;
import com.codelib.springsecurity.sample.web.pojo.Group;
import com.codelib.springsecurity.sample.web.pojo.User;
import com.codelib.springsecurity.sample.web.service.UserService;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired(required = true)
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final User user = userService.loadUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + " cannot be found");
		}
		// 得到用户权限的集合
		Set<String> authoritiySet = new HashSet<>();
		List<Group> groups = user.getGroups();
		for (Group group : groups) {
			List<Authority> authorities = group.getAuthorities();
			for (Authority authority : authorities) {
				authoritiySet.add(authority.getAuthority());
			}
		}
		final Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		for (String authority : authoritiySet) {
			authorities.add(new SimpleGrantedAuthority(authority));
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				authorities);
	}

}
