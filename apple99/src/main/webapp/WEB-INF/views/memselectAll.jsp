<%@page import="com.itbank.mvc99.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	${list.get(0).id }

	<%
		List<MemberDTO> list = (List)request.getAttribute("list");
		
		for(int i=0; i<list.size();i++){
			%>
				<hr>
				<%=list.get(i).getId() %><br>
				<%=list.get(i).getPw() %><br>
				<%=list.get(i).getName() %><br>
				<%=list.get(i).getTel() %><br>
				<hr>
			<%			
		}
	%>
	

</body>
</html>