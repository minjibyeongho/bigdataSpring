<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="update">
	아이디 : <input type="text" value=${bbsDTO2.id } name="id"><br>
	제목 : <input type="text" value=${bbsDTO2.title } name="title"><br>
	내용 : <input type="text" value=${bbsDTO2.content } name="content"><br>
	작가 : <input type="text" value=${bbsDTO2.writer } name="writer"><br>
	<input type="submit" value="바로수정">
</form>


</body>
</html>