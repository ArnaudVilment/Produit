<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
<link rel="stylesheet" href="ressources/css/produits.css"/>
</head>
<body>
	<h1>Users</h1>
	
	<c:forEach items="${ users }" var="user" varStatus="indice">
		
	
		<div class="block_produit">
        	<div class="prix"><label>${ user.age }</label></div>
       		<a href="user-infos?id=${ indice.index }">
           	<img src="${ user.urlImage }" id="${ indice.index }"/>
      		</a>
        	<div class="description">${ user.nom } ${ user.prenom }</div>
    	</div>
	
	</c:forEach>
</body>
</html>