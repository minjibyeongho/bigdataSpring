<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<img alt="" src="resources/14.jpg">
	로그인처리2
	${result }<br>
	${memberDTO.id }, ${memberDTO.pw }, ${memberDTO.name }, ${memberDTO.tel } 
	<br>
	${list }	<!-- list내용을 꺼낼 때는 jstl을 이용하여 -->
</body>
</html>