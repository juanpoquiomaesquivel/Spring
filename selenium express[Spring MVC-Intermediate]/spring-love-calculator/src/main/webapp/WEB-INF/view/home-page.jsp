<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homepage</title>

<style>
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 13px;
}
</style>

<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3) {
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
				<form:errors cssClass="error" path="userName" />
			</p>
			<p>
				<label for="cn">Crush name : </label>
				<form:input id="cn" path="crushName" />
				<form:errors cssClass="error" path="crushName" />
			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I am agreeing that this is for fun</label>
				<form:errors path="termAndCondition" cssClass="error" />
			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>

<!-- https://www.youtube.com/watch?v=ot-TI5T7-5M&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=8&pp=iAQB -->