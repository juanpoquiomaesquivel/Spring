<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homepage</title>

<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 2) {
			alert("your name should have at least one char")
			return false;
		}
		
		return true;
	}
</script>

</head>
<body>
	<h1>Love Calculator</h1>
	<hr>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your name : </label>
				<form:input id="yn" path="userName" />
			</p>
			<p>
				<label for="cn">Crush name : </label>
				<form:input id="cn" path="crushName" />
			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>