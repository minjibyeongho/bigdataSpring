<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.DBConnectionMgr"%>
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
	DBConnectionMgr mgr = DBConnectionMgr.getInstance();
	Connection con = mgr.getConnection();
	out.print("오라클 DB연결 성공!!");
	String sql = "insert into member values('win','win','win','win')";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.executeUpdate();
	out.print("오라클 SQL전송 성공!");
	
%>




</body>
</html>