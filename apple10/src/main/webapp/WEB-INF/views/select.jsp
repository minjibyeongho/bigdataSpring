<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- ajax CDN -->
<head><script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script></head>

<script type="text/javascript">
		$(function(){
			$("#form").submit(function(){
				var d = $(this).serialize();				
				$.ajax({
					url: "replyInsert.do",
					data: d,
					success: function(result){
						console.log("성공!")
						alert("ajax 성공!")
					}
				})	//ajax end
			})	//form submit end
			
			
		})		//jquery end

</script>

</head>
<body>
<h1>select 페이지</h1>
검색한 정보
<hr>
아이디 : ${dto.id }<br>
패스워드 : ${dto.pw }<br>
이름 : ${dto.name }<br>
전화번호 : ${dto.tel }<br>

	<hr color="green">
		<form id="form">
			댓글>>
			<input width="300" type="text" name="content">
			<input type="hidden" name="id" value="${dto.id}">
			<input type="submit" value="댓글달기">
		</form>
	<hr color="green">

</body>
</html>