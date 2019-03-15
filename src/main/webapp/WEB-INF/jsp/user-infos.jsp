<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Infos</title>
<link rel="stylesheet" href="ressources/css/produits.css"/>
</head>
<body>
	<h1>${ user.nom } ${ user.prenom }</h1>
	
	<div class="block_produit">
        <img src="${ user.urlImage }" id="${ user.nom }"/>
    </div>
    
   
</body>
</html>