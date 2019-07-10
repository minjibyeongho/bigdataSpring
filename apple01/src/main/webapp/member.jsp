<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login2">	<!-- MVC2에서는 action에 url주소를 작성해주어야함 -->
		아이디 : <input type="text" name="id">
		비밀번호 : <input type="text" name="pw">
		<input type="submit" value="서버로전송">
	</form>
	<br>
	<a href="memberDetail">회원 상세 정보</a><br>
	<a href="memberDelete">회원 삭제 요청</a><br>
</body>
</html>