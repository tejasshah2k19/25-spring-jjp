<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="calc" method="post">
		No.1 <input type="text" name="n1"/><br><br>
		No.2 <input type="text" name="n2"/><br><br>
		<input type="submit" value="Add"/>
	</form>
	${ans}
	
</body>
</html>