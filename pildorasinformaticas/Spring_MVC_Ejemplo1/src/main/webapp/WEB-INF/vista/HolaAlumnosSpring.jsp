<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario procesado</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/assets/estilos/miestilo.css">
</head>
<body>

Hola ${param.nombreAlumno }, bienvenido al curso de Spring.

<p><br/>

<h2>Atencion a todos</h2>

${mensajeClaro }

</p>

<img alt="peru del 2018" src="${pageContext.request.contextPath }/assets/imgs/peru2018.jpg">

</body>
</html>