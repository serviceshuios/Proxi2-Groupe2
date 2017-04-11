<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification d'un client</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<div class="page-header row entete">
			<h1>Modification d'un client</h1>
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
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
</body>
</html>