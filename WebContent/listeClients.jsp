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
			<h1>Gestion des clients</h1>
		</div>
		<form>
			<div class="form-group row">
				<label for="nom" class="col-xs-4 col-form-label">Saisir le
					nom</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="nom" placeholder="nom">
				</div>
			</div>
			<div class="form-group row">
				<label for="prenom" class="col-xs-4 col-form-label">Saisir le
					prénom</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="nom" placeholder="prenom">
				</div>
			</div>
			<div class="form-group row">
				<label for="adresse" class="col-xs-4 col-form-label">Saisir le
					numéro et la rue</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="adresse"
						placeholder="numéro et rue">
				</div>
			</div>
			<div class="form-group row">
				<label for="ville" class="col-xs-4 col-form-label">Saisir la
					ville</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="ville"
						placeholder="ville">
				</div>
			</div>
			<div class="form-group row">
				<label for="codepostal" class="col-xs-4 col-form-label">Saisir
					le code postal</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="codepostal"
						placeholder="code postal">
				</div>
			</div>
			<div class="form-group row">
				<label for="telephone" class="col-xs-4 col-form-label">Saisir
					le numéro de téléphone</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="telephone"
						placeholder="0102030406">
				</div>
			</div>
			<div class="form-group row">
				<label for="email" class="col-xs-4 col-form-label">Saisir
					l'e-mail</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="email"
						placeholder="exemple@exemple.com">
				</div>
			</div>
		</form>
	</div>
		<c:if test="${! empty listeClients}">
<table class="table row">
	<tr> 
		<th>Id</th>
		<th>Nom</th>
		<th>Prénom</th>
		<th>Modifier</th>
		<th>Supprimer</th>
		<th>Liste des comptes</th>
	</tr>
	<c:forEach var="c" items="${listeClients}">
	<tr>
	<td><c:out value="${c.id}"></c:out></td>
	<td><c:out value="${c.nom}"></c:out></td>
	<td><c:out value="${c.prenom}"></c:out></td>
	<td><a class="btn btn-link" href="GestionClients?action=editionClients" role="button">Modifier</a></td>
	<td><a class="btn btn-link" href="GestionClients?action=supprimerClients" role="button">Supprimer</a></td>
	<td><a class="btn btn-link" href="GestionClients?action=listeComptes" role="button">Comptes</a></td>
	</tr>
	</c:forEach>
</table>
		</c:if>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
</body>
</html>