<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homepage</title>
</head>
<body>
	<h1>Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your name : </label>
				<form:input type="text" id="yn" path="userName" />
			</p>
			<p>
				<label for="cn">Crush name : </label>
				<form:input type="text" id="cn" path="crushName" />
			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>