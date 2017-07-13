<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Test</title>
</head>
<body>
<p>
&lt;c:out&gt;：<br>
默认情况下，escapeXml属性值为ture，原样输出字符串：<c:out value="${str}"/><br>
escapeXml属性值设为ture，原样输出字符串：<c:out value="${str}" escapeXml="true" /><br>
escapeXml属性值设为false，不忽略XML特殊字符：<c:out value="${str}" escapeXml="false" /><br>
如果值为null时，可以设置默认值：<c:out value="${nullStr}" default="NULL" /><br>  
如果值为null时，不设置默认值，则输出空：<c:out value="${nullStr}" />
</p>

<p>
&lt;c:if&gt;单判断：<br>
<c:if test="${str == '&lt;Hello World!&gt;'}">
    true
</c:if>
<br>
<c:if test="${str != 'Hello World!'}">
    false
</c:if>
</p>

<p>
&lt;c:choose&gt;多重判断：<br>
<c:choose>
    <c:when test="${str == '&lt;Hello World!&gt;'}">
        true;
    </c:when>
    <c:when test="${str != '&lt;Hello World!&gt;'}">
        false;
    </c:when>
    <c:otherwise>
        ……
    </c:otherwise>
</c:choose>
</p>

<p>
&lt;c:forEach&gt;：<br>
<c:forEach var="l" items="${list}">
   Item：<c:out value="${l}"/><br>
</c:forEach>
</p>

<p>
&lt;c:forTokens&gt;：<br>
<c:forTokens var="l" items="${splitStr}" delims=";">
   Item：<c:out value="${l}"/><br>
</c:forTokens>
</p>

</body>
</html>