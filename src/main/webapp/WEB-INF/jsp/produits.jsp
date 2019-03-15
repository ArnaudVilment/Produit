<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Voir les produits</title>
    <link rel="stylesheet" href="ressources/css/produits.css"/>
</head>
<body>

<h1>Liste des produits</h1>
<div id="conteneur">

	<c:forEach items="${ produits }" var="mapProduits" varStatus="boucle">
	    
        <%-- Affichage des propriétés du bean Produit --%>       
        <div class="block_produit">
        	<div class="prix"><label>${ mapProduits.prix }&euro;</label></div>
       		<a href="${ mapProduits.lienSiteOff }">
           	<img src="${ mapProduits.lienImage }" id="axe"/>
      		</a>
        	<div class="description">${ mapProduits.nom }</div>
    	</div>
	        
	 </c:forEach>
  
</div>
<body>

</body>
</html>