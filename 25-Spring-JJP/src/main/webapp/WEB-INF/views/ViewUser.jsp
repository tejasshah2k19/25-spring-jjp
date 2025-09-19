<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">

</head>
<body>

	<div class="container mt-3">

		<div class="row">
			<div class="col-md-4">
				<div class="card">

					<div class="card-body">
					<b>FirstName:</b> ${user.firstName }<br><br>
					<b>LastName :</b> ${user.lastName }			<br><br> 
					<b>Email :</b> ${user.email }<br><br> 		

					
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>