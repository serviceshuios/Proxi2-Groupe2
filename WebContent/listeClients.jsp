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
				<li  class="active"><a href="#">Clients</a></li>
				<li><a href="#">Modification d'un client</a></li>
				<li><a href="#">Comptes d'un client</a></li>
				<li><a href="#">Virement</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="row">
		<form class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
		<legend class="legende">Création d'un nouveau client</legend>
			<div class="form-group row">
				<label for="nom" class="col-xs-4 col-sm-4 col-md-4 col-lg-4 col-form-label">Saisir le
					nom</label>
				<div>
					<input type="text" class="col-xs-4 col-sm-4 col-md-4 col-lg-4 form-control" id="nom" placeholder="nom">
				</div>
			</div>
			<div class="form-group row">
				<label for="prenom" class="col-xs-4 col-form-label">Saisir
					le prénom</label>
				<div>
					<input type="text" class="form-control" id="nom"
						placeholder="prenom">
				</div>
			</div>
			<div class="form-group row">
				<label for="adresse" class="col-xs-4 col-form-label">Saisir
					le numéro et la rue</label>
				<div>
					<input type="text" class="form-control" id="adresse"
						placeholder="numéro et rue">
				</div>
			</div>
			<div class="form-group row">
				<label for="ville" class="col-xs-4 col-form-label">Saisir la
					ville</label>
				<div>
					<input type="text" class="form-control" id="ville"
						placeholder="ville">
				</div>
			</div>
			<div class="form-group row">
				<label for="codepostal" class="col-xs-4 col-form-label">Saisir
					le code postal</label>
				<div>
					<input type="text" class="form-control" id="codepostal"
						placeholder="code postal">
				</div>
			</div>
			<div class="form-group row">
				<label for="telephone" class="col-xs-4 col-form-label">Saisir
					le numéro de téléphone</label>
				<div>
					<input type="text" class="form-control" id="telephone"
						placeholder="0102030406">
				</div>
			</div>
			<div class="form-group row">
				<label for="email" class="col-xs-4 col-form-label">Saisir
					l'e-mail</label>
				<div>
					<input type="text" class="form-control" id="email"
						placeholder="exemple@exemple.com">
				</div>
			</div>
		</form>
		<div class="row col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<a class="btn btn-link"
			href="GestionClients?action=virementCompteACompte" role="button">Virement compte à compte</a>
		</div>
		</div>
		</div>
		<div class="container">
		<div class="row">
			<button type="submit" class="btn btn-primary">Valider</button>
		</div>
		</div>
		<div class="container">
			<table class="table row">
			<legend class="legende">Clients</legend>
			<thead class="thead-inverse">
				<tr>
					<th>Id</th>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Entreprise</th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
			</thead>
				<c:if test="${! empty listeClients}">
				<c:forEach var="c" items="${listeClients}">
					<tbody>
					<tr>
						<td><c:out value="${c.id}"></c:out></td>
						<td><c:out value="${c.nom}"></c:out></td>
						<td><c:out value="${c.prenom}"></c:out></td>
						<td><c:out value="${c.entreprise}"></c:out></td>
						<td><a class="btn btn-link"
							href="ModifierClient?id=<c:out value='${c.id}'></c:out>" role="button">Modifier</a></td>
						<td><a class="btn btn-link"
							href="SupprimerClient?id=<c:out value='${c.id}'></c:out>" role="button">Supprimer</a></td>
						<td><a class="btn btn-link"
							href="ListeComptes?id=<c:out value='${c.id}'></c:out>" role="button">Comptes</a></td>
					</tr>
					</tbody>
				</c:forEach>
				</c:if>
			</table>
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