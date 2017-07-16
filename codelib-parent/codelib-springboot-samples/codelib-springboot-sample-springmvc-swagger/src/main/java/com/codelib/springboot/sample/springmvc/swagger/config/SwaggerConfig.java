package com.codelib.springboot.sample.springmvc.swagger.config;

import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private Logger logger = LoggerFactory.getLogger(SwaggerConfig.class);

	@Bean
	public Docket api() {
		logger.info("swagger api doc starting....");
		return new Docket(DocumentationType.SWAGGER_2).groupName("codelib").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any()).paths(Predicates.not(PathSelectors.regex("/error.*"))).build()
				.pathMapping("/").directModelSubstitute(Date.class, String.class)
				.genericModelSubstitutes(ResponseEntity.class);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Springfox petstore API")
				.description("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum "
						+ "has been the industry's standard dummy text ever since the 1500s, when an unknown printer "
						+ "took a "
						+ "galley of type and scrambled it to make a type specimen book. It has survived not only five "
						+ "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. "
						+ "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum "
						+ "passages, and more recently with desktop publishing software like Aldus PageMaker including "
						+ "versions of Lorem Ipsum.")
				.termsOfServiceUrl("http://springfox.io").contact("springfox").license("Apache License Version 2.0")
				.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("2.0").build();
	}

}
