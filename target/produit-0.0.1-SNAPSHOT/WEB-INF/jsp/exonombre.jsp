<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exo nombre</title>
</head>
<body>
	<h1>Exo Nombre</h1>
	
	<div>
		<form action="exonombre" method="POST">
			<label for="nombre">Nombre</label>
			<input type="text" id="nombre" name="nombre"/>
			
			<label for="modulo">Modulo</label>
			<input type="text" id="modulo" name="modulo"/>
			
			<input type="submit" value="Valider"/>
		
		</form>
	</div>
</body>
</html>