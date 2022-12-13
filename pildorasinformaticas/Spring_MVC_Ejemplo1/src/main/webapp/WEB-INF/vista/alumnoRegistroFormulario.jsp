<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de registro</title>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="elAlumno">

Nombre:
<form:input path="nombre" />
<form:errors path="nombre" style="color:red;"/> <!-- especificamos el mensaje de error -->
		<br />
		<br />
		<br />
Apellido:
<form:input path="apellido" />
		<br />
		<br />
		<br />
Edad:
<form:input path="edad" />
<form:errors path="edad" style="color:red;"/> <!-- especificamos el mensaje de error -->
		<br />
		<br />
		<br />
E-mail:
<form:input path="email" />
<form:errors path="email" style="color:red;"/> <!-- especificamos el mensaje de error -->
		<br />
		<br />
		<br />
		Asignaturas optativas:
		<form:select path="optativa" multiple="true">

			<form:option value="diseno" label="desgin"></form:option>
			<form:option value="karate" label="karate"></form:option>
			<form:option value="comercio" label="commerce"></form:option>
			<form:option value="danza" label="dancing"></form:option>

		</form:select>

		<br />
		<br />
		<br />
		
		Barcelona <form:radiobutton path="ciudadEstudios" value="barza"/>
		Madrid <form:radiobutton path="ciudadEstudios" value="realmadrid"/>
		Valencia <form:radiobutton path="ciudadEstudios" value="valencia"/>
		Bilbao <form:radiobutton path="ciudadEstudios" value="athletic"/>
		
		<br />
		<br />
		<br />
		
		Ingles <form:checkbox path="idiomasAlumno" value="english"/>
		Español <form:checkbox path="idiomasAlumno" value="spanish"/>
		Chino <form:checkbox path="idiomasAlumno" value="chinese"/>
		Aleman <form:checkbox path="idiomasAlumno" value="german"/>
		
		<br />
		<br />
		<br />
		<input type="submit" value="Enviar">

	</form:form>

</body>
</html>