<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bbsinsert.do">
	아이디 : <input type="text" name="id"><br>
	제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="content"><br>
	작가 : <input type="text" name="writer"><br>
	<input type="submit" value="서버로 전송">
	</form>
	<hr>
	<h1>검색</h1>
	<br>
	<form action="bbsselect.do">
		아이디 : <input type="text" name="id"><br>
		<input type="submit" value="검색">
	</form>
	<br>
	<hr>
	<a href="bbsselectAll.do">전체 검색</a>
	

</body>
</html>