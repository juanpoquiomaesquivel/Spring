<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please register here</h1>
	<div align="center">
		<form:form modelAttribute="userReg" action="registration-success" method="GET">
			<label>User : </label>
			<form:input path="name" />
			<br />
			<label>User Name : </label>
			<form:input path="userName" />
			<br />
			<label>Password : </label>
			<form:password path="password" />
			<br />
			<label>Country Name : </label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="Usa" label="United States"></form:option>
				<form:option value="Pak" label="Pakistan"></form:option>
				<form:option value="Sl" label="Srilanka"></form:option>
			</form:select>
			<br />
			<label>Hobbies : </label>
		Cricket : <form:checkbox path="hobbies" value="cricket" />
		Reading : <form:checkbox path="hobbies" value="reading" />
		Travel : <form:checkbox path="hobbies" value="travel" />
		Programming : <form:checkbox path="hobbies" value="programmin" />
			<br />
			<label>Gender : </label>
		Male<form:radiobutton path="gender" value="male" />
		Female<form:radiobutton path="gender" value="female" />
			<input type="submit" value="register" />
		</form:form>
	</div>
</body>
</html>

<!-- https://www.youtube.com/watch?v=UVdgA4ANaKM&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=7&pp=iAQB -->