<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des clients</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<div class="page-header row entete">
			<h1>Comptes d'un client</h1>
		</div>
		<c:if test="${! empty listeComptes}">
			<table class="table row">
				<tr>
					<th>Numéro</th>
					<th>Solde</th>
					<th>Date d'ouverture</th>
					<th>Type</th>
				</tr>
				<c:forEach var="c" items="${listeComptes}">
					<tr>
						<td><c:out value="${c.id}"></c:out></td>
						<td><c:out value="${c.solde}"></c:out></td>
						<td><c:out value="${c.dateOuverture}"></c:out></td>
						<td><c:out value="${c.dateOuverture}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>

</body>
</html>