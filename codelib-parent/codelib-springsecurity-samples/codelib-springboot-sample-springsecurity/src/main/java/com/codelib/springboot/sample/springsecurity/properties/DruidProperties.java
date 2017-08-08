package com.codelib.springboot.sample.springsecurity.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DruidProperties {

	private String name;
	private String url;
	private String username;
	private String password;
	private String driverClassName;
	private int initialSize = DruidDataSource.DEFAULT_INITIAL_SIZE;
	private int maxActive = DruidDataSource.DEFAULT_MAX_ACTIVE_SIZE;
	private int minIdle = DruidDataSource.DEFAULT_MIN_IDLE;
	private long maxWait = DruidDataSource.DEFAULT_MAX_WAIT;
	private boolean poolPreparedStatements = false;
	private int maxPoolPreparedStatementPerConnectionSize = -1;
	
	private String validationQuery = DruidDataSource.DEFAULT_VALIDATION_QUERY;
	private int validationQueryTimeout = -1;
	private boolean testOnBorrow = DruidDataSource.DEFAULT_TEST_ON_BORROW;
	private boolean testOnReturn = DruidDataSource.DEFAULT_TEST_ON_RETURN;
	private boolean testWhileIdle = DruidDataSource.DEFAULT_WHILE_IDLE;
	private boolean keepAlive = false;
	private long timeBetweenEvictionRunsMillis = DruidDataSource.DEFAULT_TIME_BETWEEN_EVICTION_RUNS_MILLIS;
	private long minEvictableIdleTimeMillis = DruidDataSource.DEFAULT_MIN_EVICTABLE_IDLE_TIME_MILLIS;
	private String filters = "stat,wall,slf4j,config";
	private boolean useGlobalDataSourceStat = false;
	private long timeBetweenLogStatsMillis;
	private boolean removeAbandoned = false;
	private int removeAbandonedTimeout = 300 * 1000;;
	private boolean logAbandoned = true;

	private Stat stat = new Stat();
	private Servlet servlet = new Servlet();
	private Filter filter = new Filter();
	private Config config = new Config();

	/**
	 * 配置这个属性的意义在于，如果存在多个数据源，监控的时候 可以通过名字来区分开来。 如果没有配置，将会生成一个名字，
	 * 格式是："DataSource-" + System.identityHashCode(this);
	 * 另外配置此属性需要版本大于1.0.5，强行设置name会出错。
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 连接数据库的url，不同数据库不一样。例如：<br>
	 * mysql : jdbc:mysql://10.20.153.104:3306/druid2<br>
	 * oracle : jdbc:oracle:thin:@10.20.149.85:1521:ocnauto<br>
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 连接数据库的用户名
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 连接数据库的密码。如果你不希望密码直接写在配置文件中，可以使用ConfigFilter。
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 这一项可配可不配，如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName<br>
	 * 各数据库的 driverClassName 可以查看 druid.jar 下 META-INF/druid-driver.properties
	 * 文件
	 * 
	 * @return
	 */
	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	/**
	 * 初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
	 * 
	 * @return
	 */
	public int getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	/**
	 * 最大连接池数量
	 * 
	 * @return
	 */
	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	/**
	 * 最小连接池数量
	 * 
	 * @return
	 */
	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	/**
	 * 获取连接时最大等待时间，单位毫秒。 配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，
	 * 如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
	 * 
	 * @return
	 */
	public long getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(long maxWait) {
		this.maxWait = maxWait;
	}

	/**
	 * 是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
	 * 
	 * @return
	 */
	public boolean isPoolPreparedStatements() {
		return poolPreparedStatements;
	}

	public void setPoolPreparedStatements(boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}

	/**
	 * 要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。
	 * 在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100
	 * 
	 * @return
	 */
	public int getMaxPoolPreparedStatementPerConnectionSize() {
		return maxPoolPreparedStatementPerConnectionSize;
	}

	public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	}

	/**
	 * 用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。
	 * 如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用。
	 * 
	 * @return
	 */
	public String getValidationQuery() {
		return validationQuery;
	}

	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	/**
	 * 单位：秒，检测连接是否有效的超时时间。 <br>
	 * 底层调用jdbc Statement对象的void setQueryTimeout(int seconds)方法
	 * 
	 * @return
	 */
	public int getValidationQueryTimeout() {
		return validationQueryTimeout;
	}

	public void setValidationQueryTimeout(int validationQueryTimeout) {
		this.validationQueryTimeout = validationQueryTimeout;
	}

	/**
	 * 申请连接时执行validationQuery检测连接是否有效， 做了这个配置会降低性能。
	 * 
	 * @return
	 */
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	/**
	 * 归还连接时执行validationQuery检测连接是否有效， 做了这个配置会降低性能。
	 * 
	 * @return
	 */
	public boolean isTestOnReturn() {
		return testOnReturn;
	}

	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	/**
	 * 建议配置为true，不影响性能，并且保证安全性。
	 * 申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
	 * 
	 * @return
	 */
	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}

	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}

	/**
	 * 在Druid-1.0.27之前的版本，DruidDataSource建议使用TestWhileIdle来保证连接的有效性，但仍有很多场景需要对连接进行保活处理。
	 * 在1.0.28版本之后，新加入keepAlive配置，缺省关闭。 打开KeepAlive之后的效果:
	 * 1)初始化连接池时会填充到minIdle数量。
	 * 2)连接池中的minIdle数量以内的连接，空闲时间超过minEvictableIdleTimeMillis，则会执行keepAlive操作。
	 * 3)当网络断开等原因产生的由ExceptionSorter检测出来的死连接被清除后，自动补充连接到minIdle数量。
	 * 
	 * @return
	 */
	public boolean isKeepAlive() {
		return keepAlive;
	}

	public void setKeepAlive(boolean keepAlive) {
		this.keepAlive = keepAlive;
	}

	/**
	 * 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒。 有两个含义：<br>
	 * 1) Destroy线程会检测连接的间隔时间，如果连接空闲时间大于等于minEvictableIdleTimeMillis则关闭物理连接。<br>
	 * 2) testWhileIdle的判断依据，
	 * 
	 * @return
	 */
	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	/**
	 * 连接保持空闲而不被驱逐的最长时间，单位是毫秒
	 * 
	 * @return
	 */
	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	/**
	 * 配置监控统计拦截的filters，去掉后监控界面sql无法统计，<br>
	 * filters的别名映射配置信息保存在druid-xxx.jar!/META-INF/druid-filter.properties<br>
	 * 属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有：<br>
	 * 监控统计用的filter:stat<br>
	 * 日志用的filter:log4j<br>
	 * 防御sql注入的filter:wall<br>
	 * 密码加密的filter:config<br>
	 * 注意filters的顺序: <br>
	 * "wall,stat"这样，拦截检测的时间不在StatFilter统计的SQL执行时间内。<br>
	 * "stat,wall"这样，拦截检测的时间在StatFilter统计的SQL执行时间内<br>
	 * 
	 * @return
	 */
	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	/**
	 * 合并多个DruidDataSource的监控数据
	 * 
	 * @return
	 */
	public boolean isUseGlobalDataSourceStat() {
		return useGlobalDataSourceStat;
	}

	public void setUseGlobalDataSourceStat(boolean useGlobalDataSourceStat) {
		this.useGlobalDataSourceStat = useGlobalDataSourceStat;
	}

	/**
	 * 配置了timeBetweenLogStatsMillis属性（大于0）之后，就会定时输出统计信息到日志中。
	 * 每次输出日志会导致清零（reset）连接池相关的计数器。
	 * 
	 * @return
	 */
	public long getTimeBetweenLogStatsMillis() {
		return timeBetweenLogStatsMillis;
	}

	public void setTimeBetweenLogStatsMillis(long timeBetweenLogStatsMillis) {
		this.timeBetweenLogStatsMillis = timeBetweenLogStatsMillis;
	}

	/**
	 * 配置removeAbandoned对性能会有一些影响，建议怀疑存在泄漏之后再打开<br>
	 * 当removeAbandoned=true之后，可以在内置监控界面datasource.html中的查看ActiveConnection
	 * StackTrace属性的，可以看到未关闭连接的具体堆栈信息，<br>
	 * 从而方便查出哪些连接泄漏了。<br>
	 * 
	 * @return
	 */
	public boolean isRemoveAbandoned() {
		return removeAbandoned;
	}

	public void setRemoveAbandoned(boolean removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}

	/**
	 * 单位:秒
	 * 
	 * @return
	 */
	public int getRemoveAbandonedTimeout() {
		return removeAbandonedTimeout;
	}

	public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
		this.removeAbandonedTimeout = removeAbandonedTimeout;
	}

	/**
	 * 关闭abanded连接时输出错误日志
	 * 
	 * @return
	 */
	public boolean isLogAbandoned() {
		return logAbandoned;
	}

	public void setLogAbandoned(boolean logAbandoned) {
		this.logAbandoned = logAbandoned;
	}

	public Stat getStat() {
		return stat;
	}

	public void setStat(Stat stat) {
		this.stat = stat;
	}

	public Servlet getServlet() {
		return servlet;
	}

	public void setServlet(Servlet servlet) {
		this.servlet = servlet;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public static class Stat {

		private String mergeSql = "true";
		private String logSlowSql = "true";
		private String slowSqlMillis = "5000";

		/**
		 * 合并SQL
		 * 
		 * @return
		 */
		public String getMergeSql() {
			return mergeSql;
		}

		public void setMergeSql(String mergeSql) {
			this.mergeSql = mergeSql;
		}

		/**
		 * 慢SQL记录
		 * 
		 * @return
		 */
		public String getLogSlowSql() {
			return logSlowSql;
		}

		public void setLogSlowSql(String logSlowSql) {
			this.logSlowSql = logSlowSql;
		}

		public String getSlowSqlMillis() {
			return slowSqlMillis;
		}

		public void setSlowSqlMillis(String slowSqlMillis) {
			this.slowSqlMillis = slowSqlMillis;
		}

		@Override
		public String toString() {
			return "Stat [mergeSql=" + mergeSql + ", logSlowSql=" + logSlowSql + ", slowSqlMillis=" + slowSqlMillis
					+ "]";
		}

	}

	public static class Servlet {

		private String allow = "";
		private String deny = "";
		private String loginUsername = "admin";
		private String loginPassword = "admin1234";
		private String resetEnable = "false";

		/**
		 * IP白名单 (没有配置或者为空，则允许所有访问)
		 * 
		 * @return
		 */
		public String getAllow() {
			return allow;
		}

		public void setAllow(String allow) {
			this.allow = allow;
		}

		/**
		 * IP黑名单 (存在共同时，deny优先于allow)
		 * 
		 * @return
		 */
		public String getDeny() {
			return deny;
		}

		public void setDeny(String deny) {
			this.deny = deny;
		}

		/**
		 * 登录监控界面用户名
		 * 
		 * @return
		 */
		public String getLoginUsername() {
			return loginUsername;
		}

		public void setLoginUsername(String loginUsername) {
			this.loginUsername = loginUsername;
		}

		/**
		 * 登录监控界面密码
		 * 
		 * @return
		 */
		public String getLoginPassword() {
			return loginPassword;
		}

		public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
		}

		/**
		 * 是否能够重置数据<br>
		 * 在StatViewSerlvet输出的html页面中，有一个功能是Reset All，执行这个操作之后，会导致所有计数器清零，重新计数。
		 * 
		 * @return
		 */
		public String getResetEnable() {
			return resetEnable;
		}

		public void setResetEnable(String resetEnable) {
			this.resetEnable = resetEnable;
		}

		@Override
		public String toString() {
			return "Servlet [allow=" + allow + ", deny=" + deny + ", loginUsername=" + loginUsername
					+ ", loginPassword=" + loginPassword + ", resetEnable=" + resetEnable + "]";
		}

	}

	public static class Filter {

		private String exclusions = "'*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*'";
		private String sessionStatMaxCount = "1000";
		private String sessionStatEnable = "true";
		private String principalSessionName = "user.username";
		private String profileEnable = "true";

		/**
		 * 忽略资源
		 * 
		 * @return
		 */
		public String getExclusions() {
			return exclusions;
		}

		public void setExclusions(String exclusions) {
			this.exclusions = exclusions;
		}

		public String getSessionStatMaxCount() {
			return sessionStatMaxCount;
		}

		public void setSessionStatMaxCount(String sessionStatMaxCount) {
			this.sessionStatMaxCount = sessionStatMaxCount;
		}

		/**
		 * session统计开关
		 * 
		 * @return
		 */
		public String getSessionStatEnable() {
			return sessionStatEnable;
		}

		public void setSessionStatEnable(String sessionStatEnable) {
			this.sessionStatEnable = sessionStatEnable;
		}

		/**
		 * 配置principalSessionName，使得druid能够知道当前的session的用户是谁
		 * 
		 * @return
		 */
		public String getPrincipalSessionName() {
			return principalSessionName;
		}

		public void setPrincipalSessionName(String principalSessionName) {
			this.principalSessionName = principalSessionName;
		}

		/**
		 * 配置profileEnable能够监控单个url调用的sql列表
		 * 
		 * @return
		 */
		public String getProfileEnable() {
			return profileEnable;
		}

		public void setProfileEnable(String profileEnable) {
			this.profileEnable = profileEnable;
		}

		@Override
		public String toString() {
			return "Filter [exclusions=" + exclusions + ", sessionStatMaxCount=" + sessionStatMaxCount
					+ ", sessionStatEnable=" + sessionStatEnable + ", principalSessionName=" + principalSessionName
					+ ", profileEnable=" + profileEnable + "]";
		}

	}

	public static class Config {

		private String decrypt = "false";
		private String decryptKey = "";

		/**
		 * Properties属性配置请查看:com.alibaba.druid.filter.config.ConfigFilter<br>
		 * 设置密码加密
		 * 
		 * @return
		 */
		public String getDecrypt() {
			return decrypt;
		}

		public void setDecrypt(String decrypt) {
			this.decrypt = decrypt;
		}

		public String getDecryptKey() {
			return decryptKey;
		}

		public void setDecryptKey(String decryptKey) {
			this.decryptKey = decryptKey;
		}

		@Override
		public String toString() {
			return "Config [decrypt=" + decrypt + ", decryptKey=" + decryptKey + "]";
		}

	}

	@Override
	public String toString() {
		return "DruidProperties [name=" + name + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", driverClassName=" + driverClassName + ", initialSize=" + initialSize + ", maxActive=" + maxActive
				+ ", minIdle=" + minIdle + ", maxWait=" + maxWait + ", poolPreparedStatements=" + poolPreparedStatements
				+ ", maxPoolPreparedStatementPerConnectionSize=" + maxPoolPreparedStatementPerConnectionSize
				+ ", validationQuery=" + validationQuery + ", validationQueryTimeout=" + validationQueryTimeout
				+ ", testOnBorrow=" + testOnBorrow + ", testOnReturn=" + testOnReturn + ", testWhileIdle="
				+ testWhileIdle + ", keepAlive=" + keepAlive + ", timeBetweenEvictionRunsMillis="
				+ timeBetweenEvictionRunsMillis + ", minEvictableIdleTimeMillis=" + minEvictableIdleTimeMillis
				+ ", filters=" + filters + ", useGlobalDataSourceStat=" + useGlobalDataSourceStat
				+ ", timeBetweenLogStatsMillis=" + timeBetweenLogStatsMillis + ", removeAbandoned=" + removeAbandoned
				+ ", removeAbandonedTimeout=" + removeAbandonedTimeout + ", logAbandoned=" + logAbandoned + ", stat="
				+ stat + ", servlet=" + servlet + ", filter=" + filter + ", config=" + config + "]";
	}

}
