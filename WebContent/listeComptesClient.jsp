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
	<div id="wrap">
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">ProxiBanque</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="#">Accueil</a></li>
				<li><a href="#">Clients</a></li>
				<li><a href="#">Modification d'un client</a></li>
				<li class="active"><a href="#">Comptes d'un client</a></li>
				<li><a href="#">Virement</a></li>
			</ul>
		</div>
	</nav>
	<div>
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
	</div>
	<div id="footer">
      <div class="container">
        <p>ProxiBanque v2</p>
      </div>
     </div>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>

</body>
</html>