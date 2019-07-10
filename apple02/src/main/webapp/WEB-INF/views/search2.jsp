<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" bordercolor="blue">
		<tr align="center">
			<td width="100">상품id : </td>
			<td width="200">${productDTO.pid }</td>
		</tr>
		<tr align="center">
			<td>상품명 : </td>
			<td>${productDTO.pname }</td>
		</tr>
		<tr align="center">
			<td>상품가격 : </td>
			<td>${productDTO.price }</td>
		</tr>
		<tr align="center">
			<td>마일리지 : </td>
			<td>${productDTO.mileage }</td>
		</tr>
		
	</table>

</body>
</html>