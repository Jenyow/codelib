package com.codelib.springboot.sample.mybatis.config;

import java.sql.SQLException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@EnableConfigurationProperties(DruidProperties.class)
@EnableTransactionManagement
public class DruidDataSourceConfig {

	@Autowired
	private DruidProperties druidProperties;

	/**
	 * 注册dataSource
	 * 
	 * @return
	 * @throws SQLException
	 */
	@Bean(initMethod = "init", destroyMethod = "close")
	public DruidDataSource dataSource() throws SQLException {

		String url = druidProperties.getUrl();
		String username = druidProperties.getUsername();
		String password = druidProperties.getPassword();

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setName(druidProperties.getName());
		druidDataSource.setUrl(url);
		druidDataSource.setUsername(username);
		druidDataSource.setPassword(password);
		druidDataSource.setDriverClassName(druidProperties.getDriverClassName());
		druidDataSource.setInitialSize(druidProperties.getInitialSize());
		druidDataSource.setMaxActive(druidProperties.getMaxActive());
		druidDataSource.setMinIdle(druidProperties.getMinIdle());
		druidDataSource.setMaxWait(druidProperties.getMaxWait());
		druidDataSource.setPoolPreparedStatements(druidProperties.isPoolPreparedStatements());
		druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(
				druidProperties.getMaxPoolPreparedStatementPerConnectionSize());
		druidDataSource.setValidationQuery(druidProperties.getValidationQuery());
		druidDataSource.setValidationQueryTimeout(druidProperties.getValidationQueryTimeout());
		druidDataSource.setTestOnBorrow(druidProperties.isTestOnBorrow());
		druidDataSource.setTestOnReturn(druidProperties.isTestOnReturn());
		druidDataSource.setTestWhileIdle(druidProperties.isTestWhileIdle());
		druidDataSource.setKeepAlive(druidProperties.isKeepAlive());
		druidDataSource.setTimeBetweenEvictionRunsMillis(druidProperties.getTimeBetweenEvictionRunsMillis());
		druidDataSource.setMinEvictableIdleTimeMillis(druidProperties.getMinEvictableIdleTimeMillis());
		druidDataSource.setFilters(druidProperties.getFilters());

		boolean useGlobalDataSourceStat = druidProperties.isUseGlobalDataSourceStat();
		druidDataSource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
		if (!useGlobalDataSourceStat) {
			// 当useGlobalDataSourceStat设置为true,不能设置该属性
			druidDataSource.setTimeBetweenLogStatsMillis(druidProperties.getTimeBetweenLogStatsMillis());
		}

		druidDataSource.setRemoveAbandoned(druidProperties.isRemoveAbandoned());
		druidDataSource.setRemoveAbandonedTimeout(druidProperties.getRemoveAbandonedTimeout());
		druidDataSource.setLogAbandoned(druidProperties.isLogAbandoned());

		Properties properties = new Properties();
		properties.setProperty("config.decrypt", druidProperties.getConfig().getDecrypt());
		properties.setProperty("config.decrypt.key", druidProperties.getConfig().getDecryptKey());
		properties.setProperty("druid.stat.mergeSql", druidProperties.getStat().getMergeSql());
		properties.setProperty("druid.stat.logSlowSql", druidProperties.getStat().getLogSlowSql());
		properties.setProperty("druid.stat.slowSqlMillis", druidProperties.getStat().getSlowSqlMillis());
		druidDataSource.setConnectProperties(properties);

		return druidDataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager() throws SQLException {
		return new DataSourceTransactionManager(dataSource());
	}

	/**
	 * 配置druid监控 Servlet
	 * 
	 * @return
	 */
	@Bean
	public ServletRegistrationBean druidStatViewServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),
				"/druid/*");
		servletRegistrationBean.addInitParameter("allow", druidProperties.getServlet().getAllow());
		servletRegistrationBean.addInitParameter("deny", druidProperties.getServlet().getDeny());
		servletRegistrationBean.addInitParameter("loginUsername", druidProperties.getServlet().getLoginUsername());
		servletRegistrationBean.addInitParameter("loginPassword", druidProperties.getServlet().getLoginPassword());
		servletRegistrationBean.addInitParameter("resetEnable", druidProperties.getServlet().getResetEnable());
		return servletRegistrationBean;
	}

	/**
	 * 配置 druid监控 Filter
	 * 
	 * @return
	 */
	@Bean
	public FilterRegistrationBean druidStatFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		// 添加过滤规则.
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", druidProperties.getFilter().getExclusions());
		filterRegistrationBean.addInitParameter("sessionStatMaxCount",
				druidProperties.getFilter().getSessionStatMaxCount());
		filterRegistrationBean.addInitParameter("sessionStatEnable",
				druidProperties.getFilter().getSessionStatEnable());
		filterRegistrationBean.addInitParameter("principalSessionName",
				druidProperties.getFilter().getPrincipalSessionName());
		filterRegistrationBean.addInitParameter("profileEnable", druidProperties.getFilter().getProfileEnable());
		return filterRegistrationBean;

	}
}