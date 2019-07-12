<%@page import="com.itbank.mvc06.BbsDTO"%>
<%@page import="com.itbank.mvc06.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	dto.setId("300");
	dto.setTitle("oracle");
	dto.setContent("love oracle");
	dto.setWriter("min");
	
	dao.insert(dto);
	%>

</body>
</html>