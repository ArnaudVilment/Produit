<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<h1>Accueil</h1>
	
	
	<c:forEach items="${ personnes }" var="mapPersonnes" varStatus="boucle">
	    <%-- Simple test de parité sur l'index de parcours, pour alterner la couleur de fond de chaque ligne du tableau. --%>
	    
        <%-- Affichage des propriétés du bean Client, qui est stocké en tant que valeur de l'entrée courante de la map --%>
        <c:out value="${ mapPersonnes.value.nom }"></c:out>
        <c:out value="${ mapPersonnes.value.prenom }"></c:out>
        <c:out value="${ mapPersonnes.value.age }"></c:out>
        <c:out value="${ mapPersonnes.value.taille }"></c:out>
        <c:out value="${ mapPersonnes.value.poids }"></c:out>
	        
	 </c:forEach>
</body>
</html>