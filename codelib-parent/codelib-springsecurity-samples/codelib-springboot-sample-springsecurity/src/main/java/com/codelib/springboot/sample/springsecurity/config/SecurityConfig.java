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

	/**
	 * spring security 每一项配置用 **.and()** 连接
	 * 调用该hasRole方法，因此不需要指定“ROLE_”前缀
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// http.authorizeRequests()每个匹配器按照它们被声明的顺序被考虑。
		http.authorizeRequests()
				// 所有用户均可访问的资源
				.antMatchers("/css/**", "/index").permitAll()
				// ROLE_USER的权限才能访问的资源
				.antMatchers("/user/**").hasRole("USER")
				// 任何尚未匹配的URL只需要验证用户即可访问
				.anyRequest().authenticated()
				// 指定登录页面,授予所有用户访问登录页面
				.and()
				.formLogin().loginPage("/login").permitAll()
				.and()
				.logout().permitAll(); 
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// auth.userDetailsService(userDetailsService);
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}
}