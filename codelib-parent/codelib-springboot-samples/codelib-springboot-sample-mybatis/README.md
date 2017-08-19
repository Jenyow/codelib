# codelib-springboot-sample-mybatis
spring boot 整合 mybatis ，使用 druid 作为数据库连接池

## druid
druid 的配置及默认值 可以查看 DruidDataSource 类和 DruidAbstractDataSource 类<br>
druid 支持分库分表和集群<br>
PageUtils是基于Druid SQL Parser实现的分页SQL自动生成类。目前支持MySql、Oracle、DB2、SQL Server四种数据库类型。说明：https://github.com/alibaba/druid/wiki/Use_PageUtils<br>
通常你需要配置：url、username、password、maxActive、maxWait、keepAlive、poolPreparedStatements、maxPoolPreparedStatementPerConnectionSize<br>
druid 监控地址：http://localhost:8080/codelib-springboot-sample-mybatis/druid/login.html

## SQL语言共分为四大类
* 数据查询语言DQL，
* 数据操纵语言DML，
* 数据定义语言DDL，
* 数据控制语言DCL。

## mybatis
通过Maven运行 MyBatis Generator 命令：**mybatis-generator:generate**

## 参考
* druid 教程：https://github.com/alibaba/druid/wiki
* druid 数据库密码设置教程：https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter
* Oracle 驱动选择：https://github.com/alibaba/druid/wiki/Oracle-Driver-Internal-API
* spring boot properties类的教程：http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-typesafe-configuration-properties
* spring boot druid整合例子：http://www.jianshu.com/p/d977ac680103
* DQL、DML、DDL、DCL的概念与区别：http://blog.csdn.net/tomatofly/article/details/5949070
* MyBatis Generator：http://mbg.cndocs.tk/
* Spring Boot整合H2测试DAO：http://blog.csdn.net/mn960mn/article/details/54644908
* h2内存数据库和mysql数据库的区别：http://blog.csdn.net/heymysweetheart/article/details/38526327
* 使用JUnit测试预期异常：http://blog.csdn.net/tayanxunhua/article/details/20570457
* MyBatis关联查询，表字段相同，resultMap映射问题的解决办法：http://blog.csdn.net/zhaofuwu/article/details/52291342
* Mybatis的一对一的关联映射 插入：http://blog.csdn.net/qq_25560423/article/details/73936116