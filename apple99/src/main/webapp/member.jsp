<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
	<form action="meminsert.do">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="text" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		전화번호 : <input type="text" name="tel"><br>
		<input type="submit" value="서버로 전송">
	</form>
	
	<form action="memselect.do">
		검색할 아이디 : <input type="text" name="id"><br>
		<input type="submit" value="검색검색"> 
	</form>

	<form action="memselectAll.do">
		<input type="submit" value="전체조회">
	</form>
</body>
</html>