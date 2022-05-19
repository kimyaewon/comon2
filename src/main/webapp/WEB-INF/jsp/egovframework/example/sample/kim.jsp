<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="title.sample"/></title>
<link type="text/css" rel="styleheet"
 href="<c:url value='/css/egovframework/sample.css'/>" />
<script type="text/javaScript" lanuguage="javascript" defer="defer">

 </script>
 </head>
<body style="text-align:center; margin:0 auto; display: inline; padding-top: 200px;">


	${name }의 테스트 성공  ${myList }
	<c:choose>
		<c:when test="${fn:length(myList)<0}">
			<c:forEach items="${myList }" var="item">
				${item }
			</c:forEach>
		</c:when>
		<c:otherwise>
				nodata
			</c:otherwise>
	</c:choose>

	<%
		String test = "test";	
	
		out.print(test);
	%>
	</br>
	</br>
	</br>
	${name }
	
	
	
	<p>2개만 가져오기</p>
	
	 <c:forEach items="${myNumber }" var="i"> 
				${i }
			</c:forEach> 
</body>
</html>