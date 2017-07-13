<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Test</title>
</head>
<body>
<c:set var="theString" value="${theString}"/>

<c:if test="${fn:contains(theString, 'runoob')}">
   <p>找到 runoob<p>
</c:if>

<c:if test="${fn:contains(theString, 'RUNOOB')}">
   <p>找到 RUNOOB<p>
</c:if>
</body>
</html>