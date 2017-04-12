<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Virement compte à compte</title>
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
				<li><a href="#">Comptes d'un client</a></li>
				<li class="active"><a href="#">Virement</a></li>
			</ul>
		</div>
		</nav>
		<div class="container">
		<form>
		<legend class="legende">Virement compte à compte</legend>
			<div class="form-group row">
				<label for="nom" class="col-xs-4 col-form-label">Saisir le
					nom</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="nom" placeholder="nom">
				</div>
			</div>
			<div class="form-group row">
				<label for="clientCompteEmetteur" class="col-xs-4 col-form-label">Saisir l'identifiant du
					client du compte à débiter</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="idClientCompteADebiter" placeholder="identifiant">
				</div>
			</div>
			<div class="form-group row">
				<label for="compteEmetteur" class="col-xs-4 col-form-label">Saisir le type de compte à débiter</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="compteEmetteur" placeholder="courant ou epargne">
				</div>
			</div>
			<div class="form-group row">
				<label for="clientCompteRecepteur" class="col-xs-4 col-form-label">Saisir l'identifiant du
					client du compte à créditer</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="idClientCompteACrediter" placeholder="identifiant">
				</div>
			</div>
			<div class="form-group row">
				<label for="compteRecepteur" class="col-xs-4 col-form-label">Saisir le type de compte à créditer</label>
				<div class="col-xs-8">
					<input type="text" class="form-control" id="compteRecepteur" placeholder="courant ou epargne">
				</div>
			</div>
		</form>
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