<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css "/>
</head>
<body>
Hemos llegado a la lista de futuros cliente

<table>
<tr>
<th>Nombre</th>
<th>Apellido</th>
<th>Email</th>
</tr>
<c:forEach var="clienteTemp" items="${clientes }">
<tr>
<td>${clienteTemp.nombre }</td>
<td>${clienteTemp.apellido }</td>
<td>${clienteTemp.email }</td>
</tr>
</c:forEach>
</table>

<br/>
<input type="button" value="Agregar cliente" onclick="window.location.href='muestraFormularioAgregar'; return false;"/>

</body>
</html>