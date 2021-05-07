<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<td>Mã SV</td>
			<td>Họ tên</td>
			<td>Tên khoa</td>
			<td>Giới tính</td>
			<td>Điểm tín</td>
		</tr>
		<tr>
			<td>${u.id}</td>
			<td>${u.name}</td>
			<td>${u.facultyname}</td>
			<td>${u.sex}</td>
			<td>${u.point}</td>
		</tr>
	</table>
</body>
</html>