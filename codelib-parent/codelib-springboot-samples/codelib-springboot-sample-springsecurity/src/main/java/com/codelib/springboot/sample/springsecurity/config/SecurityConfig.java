package com.codelib.springboot.sample.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				// 配置不同角色权限
				.antMatchers("/css/**", "/index").permitAll()// 所有用户的权限
				.antMatchers("/user/**").hasRole("USER")// ROLE_USER的权限
				.anyRequest().authenticated()// 不匹配的所有用户可以访问
				.and().formLogin().loginPage("/login")// 登录页面
				.failureUrl("/login-error");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// auth.userDetailsService(userDetailsService);
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}
}