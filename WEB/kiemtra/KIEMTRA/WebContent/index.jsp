<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lí thông tin</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->
		<div class="container">
			<h3 class="text-center">Danh sách</h3>
			<hr>
			<div class="container text-left">

				<a href="them.jsp">Thêm</a>
			</div>
			<br>
			<table class="table table-bordered">

				<tr>
					<th>Mã giảng viên</th>
					<th>Họ tên</th>
					<th>Tên bộ môn</th>
					<th>Hệ số lương</th>
					<th colspan="2" class="text-center">Actions</th>
				</tr>


				<c:forEach items="${listS}" var="x">
					<tr>
						<td>${x.magv}</td>
						<td>${x.hoten}</td>
						<td>${x.tenbomon}</td>
						<td>${x.hesoluong}</td>
						<td><a href="update?id=${x.magv}">Sửa</a></td>
						<td><a href="load" onclick="showMess(${x.magv})">Xóa</a></td>
					</tr>
				</c:forEach>



			</table>
		</div>
	</div>
</body>
<script>
	function showMess(id){
		var option = confirm('Bạn muốn xóa?');
		if(option === true){
			window.location.href = 'delete?id='+id;
		}
	}
</script>
</html>