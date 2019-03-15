<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Array List</title>
</head>
<body>
	<h1>Test ArrayList</h1>

	<% ArrayList<String> villes = (ArrayList) request.getAttribute("villes");%>
	<p>
		Taille du tableau :
		<% out.println(villes.size()); %>
	</p>

	<p>Villes :</p>
	<% for(int i = 0; i < villes.size(); i++) {
		out.println(villes.get(i) + "<br/>");
	}
	%>
	
	<c:if test="true"><h2>Titre H2 dans test</h2></c:if>

	<c:forEach begin="0" end="6" step="1">
		<p>boucle</p>
	</c:forEach>
	
	<c:forEach begin="0" end="3" step="3">
		<p>Step3</p>
	</c:forEach>
	
	<c:forEach var="i" begin="0" end="5" step="1">
		<c:out value="${ villes.get(i) }"></c:out>
	</c:forEach>
	
	
	
	<ul>
		<c:forEach items="${ villes }" var="ville">
			<li><c:out value="${ ville }"></c:out></li>
		</c:forEach>
	</ul>
	
</body>
</html>