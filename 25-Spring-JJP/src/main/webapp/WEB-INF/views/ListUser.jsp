<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">

<link href="//cdn.muicss.com/mui-0.10.3/css/mui.min.css"
	rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="row mt-3">
		<div class="col-md-3"></div>

		<div class="col-md-6">
			<table border="1" class="table table-bordered table-hover">
				<tr class="table-dark">
					<th>UserId</th>
					<th>FirstName</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${allUsers}" var="u">
					<tr>
						<td>${u.userId }</td>
						<td>${u.firstName }</td>
						<td><a href="deleteuser?userId=${u.userId}">Delete</a></td>
					</tr>
				</c:forEach>



			</table>


		</div>
	</div>



	<%-- <div class="row">
		<div class="col-md-3"></div>

		<div class="col-md-6">
			<table class="mui-table mui-table--bordered">
				<tr class="table-dark">
					<th>UserId</th>
					<th>FirstName</th>
				</tr>
				<c:forEach items="${allUsers}" var="u">
					<tr>
						<td>${u.userId }</td>
						<td>${u.firstName }</td>
					</tr>
				</c:forEach>



			</table>


		</div>
	</div> --%>
</body>
</html>