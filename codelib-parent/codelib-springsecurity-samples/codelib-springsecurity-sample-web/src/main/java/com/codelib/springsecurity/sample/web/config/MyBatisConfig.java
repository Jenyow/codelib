package com.codelib.springsecurity.sample.web.config;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;

@Configuration
@EnableTransactionManagement
@MapperScan(value = "com.codelib.springsecurity.sample.web.mapper")
public class MyBatisConfig {

	@Autowired
	private DruidDataSource dataSource;

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		// mybatis分页
		PageInterceptor pageHelper = new PageInterceptor();
		Properties props = new Properties();
		props.setProperty("reasonable", "true");
		props.setProperty("supportMethodsArguments", "true");
		props.setProperty("returnPageInfo", "check");
		props.setProperty("params", "count=countSql");
		pageHelper.setProperties(props); // 添加插件
		Interceptor[] plugins = new Interceptor[] { pageHelper };
		sqlSessionFactoryBean.setPlugins(plugins);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean
				.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
		// 在没有注解的情况下，会使用 Bean 的首字母小写的非限定类名来作为它的别名。
		sqlSessionFactoryBean.setTypeAliasesPackage("com.codelib.springsecurity.sample.web.pojo");
		return sqlSessionFactoryBean.getObject();
	}
}
