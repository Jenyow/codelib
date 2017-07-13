# codelib-springboot-sample-springmvc-jsp
整合 Spring Boot、Spring MVC，使用 JSP 模版

## JSTL(JSP 标准标签库)
需要jar：standard.jar、jstl.jar
根据JSTL标签所提供的功能，可以将其分为5个类别。
* 核心标签：核心标签是最常用的JSTL标签。
  引入标签：<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
* 格式化标签：用来格式化并输出文本、日期、时间、数字。
  引入标签：<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
* SQL 标签：提供了与关系型数据库（Oracle，MySQL，SQL Server等等）进行交互的标签。
  引入标签：<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
* XML 标签：提供了创建和操作XML文档的标签。
  jar：XercesImpl.jar、xalan.jar
  引入标签：<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
* JSTL 函数：JSTL包含一系列标准函数，大部分是通用的字符串处理函数。
  引入标签：<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

## 参考
* Spring Boot 官方例子：https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-web-jsp
* JSP教程：http://www.runoob.com/jsp/jsp-jstl.html
