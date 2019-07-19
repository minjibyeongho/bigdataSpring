<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- ajax CDN -->
<head><script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script></head>

<script type="text/javascript">
	
	$(function(){
		
		
		var id = document.id.value
		var content = document.content.value
		var writer = document.writer.value
		
		if(id == null || content == null || writer == null){
			return;
		}
		
		$("#btn1").click(function(){
			//ajax 실행
			
			$.ajax({
				url : "bbsselect.do",
				data : {
					"id" : id,
					"content" : content,
					"writer" : writer
				},
				success: function(){
					alert("ajax 실행 완료")
				}
			});	//ajax end
		});	//click end
	});	//Jquery end

</script>
</head>
<body>

	<h1>bbs select 페이지</h1>
	
	<table>
		<tr>
			<th width="100">아이디</th>
			<th width="100">제목</th>
			<th width="100">내용</th>
			<th width="100">작가</th>
		</tr>
		<tr>
			<td>${bdto.id }</td>
			<td>${bdto.title }</td>
			<td>${bdto.content }</td>
			<td>${bdto.writer }</td>
		</tr>
	</table>
	<hr color="green">
			작성자 : <input type="text" id="writer"><br>
			입력  : <input width="300" type="text" id="content">
			<input type="hidden" id="id" value="${bdto.id}"><br>
			<button type="button" id="btn1">댓글달기</button>
		
	<hr color="green">
	<ol>
		<c:forEach var="cdto" items="${clist}">
		<li>${cdto.writer} : ${cdto.content}</li>
		</c:forEach>
		
	</ol>

</body>
</html>