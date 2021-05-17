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
						<th>Mã sinh viên</th>
						<td><input required type="number" name="masv"
							value="${tt.masv}" <c:if test="${tt != null }">readonly</c:if> /></td>
					</tr>
					<tr>
						<th>Họ tên</th>
						<td><input required type="text" name="hoten"
							value="${tt.hoten}" /></td>
					</tr>
					<tr>
						<th>Tên khoa</th>
						<td><input required type="text" name="tenkhoa"
							value="${tt.tenkhoa}" /></td>
					</tr>
					<tr>
						<th>Giới tính</th>
						<td><input type="radio" name="gioitinh" value="1" id="nam"
							${tt.gioitinh == 1?"checked":""} /><label for="nam">Nam</label>
							<br /> <input type="radio" name="gioitinh" value="0" id="nu"
							${tt.gioitinh == 0?"checked":""} /><label for="nu">Nữ</label></td>
					</tr>
					<tr>
						<th>Điểm tín</th>
						<td><input required type="number" name="diemtin"
							value="${tt.diemtin}" /></td>
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
