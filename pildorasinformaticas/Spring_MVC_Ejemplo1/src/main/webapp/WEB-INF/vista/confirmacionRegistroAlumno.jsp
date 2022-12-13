<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de registro</title>
</head>
<body>

El alumno <strong>${elAlumno.nombre } ${elAlumno.apellido }, edad=${elAlumno.edad } e e-mail=${elAlumno.email }</strong> se ha registrado con exito.
La asignatura escogida es: <strong>${elAlumno.optativa }</strong>
La ciudad donde iniciara los estudios el alumno: <strong>${elAlumno.ciudadEstudios }</strong>
Los idiomas que escogio el alumno son: <strong>${elAlumno.idiomasAlumno }</strong>

</body>
</html>