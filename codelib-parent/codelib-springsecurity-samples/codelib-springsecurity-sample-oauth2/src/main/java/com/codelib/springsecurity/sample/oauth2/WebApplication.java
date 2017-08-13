package com.codelib.springsecurity.sample.oauth2;


import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/*
 * @SpringBootApplication same as: 
 * @Configuration、@ComponentScan:是spring框架的语法,在spring 3.x就有了,用于代码方式创建配置信息和扫描包
 * @EnableAutoConfiguration:是spring boot语法，表示将使用自动配置
*/
@SpringBootApplication
// 启用授权服务器
@EnableAuthorizationServer
// 启用资源服务器
@EnableResourceServer
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(WebApplication.class);
		// "console":控制台输出; "log":日志输出; "off":不输出。
		springApplication.setBannerMode(Mode.CONSOLE);
		springApplication.run(args);

	}

}