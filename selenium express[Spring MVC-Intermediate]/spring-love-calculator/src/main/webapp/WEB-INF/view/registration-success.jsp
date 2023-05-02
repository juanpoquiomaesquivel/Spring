<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Your registration is successful</h1>
	<h2>The details entered by you are :</h2>
	Name: ${userReg.name}
	<br /> User Name: ${userReg.userName}
	<br /> Password: ${userReg.password}
	<br /> Country Name: ${userReg.countryName}
	<br /> Hobbies:
	<c:forEach var="temp" items="${userReg.hobbies}">${temp}</c:forEach>
	<br /> Gender: ${userReg.gender}
	<br />
</body>
</html>