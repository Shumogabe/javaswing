<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java register</title>
</head>
<body>
	<form action="register" method="post">
		<table>
			<tr>
				<td>Tên đăng nhập:</td>
				<td><input type="text" name="user" id=""></td>
			</tr>
			<tr>
				<td>Mật khẩu:</td>
				<td><input type="password" name="pass" id=""></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" id=""></td>
			</tr>
			<tr>
				<td>Điện thoại:</td>
				<td><input type="text" name="phone" id=""></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="register"
					name="user" id=""></td>
			</tr>
		</table>
	</form>
</body>
</html>