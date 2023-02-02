<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css "/>
</head>
<body>

<form:form action="insertarCliente" modelAttribute="cliente" method="POST">
<table>
<tr>
<td>Nombre:</td>
<td><form:input path="nombre"/></td>
</tr>
<tr>
<td>Apellido:</td>
<td><form:input path="apellido"/></td>
</tr>
<tr>
<td>Correo:</td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Insertar"/></td>
</tr>
</table>
</form:form>

</body>
</html>