<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Quản lí thông tin</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
</head>
<body>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->
		<div class="container">
			<h3 class="text-center">
				<c:if test="${tt != null }">Sửa</c:if>
				<c:if test="${tt == null }">Thêm</c:if>
			</h3>
			<hr />
			<br />
			<form
				action="
				<c:if test="${tt != null }">update</c:if>
				<c:if test="${tt == null }">add</c:if>
							"
				method="post">
				<table class="table table-bordered">
					<tr>
						<th>Mã giảng viên</th>
						<td><input required type="number" name="magv"
							value="${tt.magv}" <c:if test="${tt != null }">readonly</c:if> /></td>
					</tr>
					<tr>
						<th>Họ tên</th>
						<td><input required type="text" name="hoten"
							value="${tt.hoten}" /></td>
					</tr>
					<tr>
						<th>Tên khoa</th>
						<td><input required type="text" name="tenbomon"
							value="${tt.tenbomon}" /></td>
					</tr>
					<tr>
						<th>Hệ số lương</th>
						<td><input required type="number" name="hesoluong"
							value="${tt.hesoluong}" /></td>
					</tr>
					<tr>
						<td colspan="2" class="col text-center">
							<button class="btn btn-primary" type="submit">
								<c:if test="${tt != null }">Sửa</c:if>
								<c:if test="${tt == null }">Thêm</c:if>
							</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
