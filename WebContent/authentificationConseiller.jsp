<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
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
				<li class="active"><a href="#">Accueil</a></li>
				<li><a href="#">Clients</a></li>
				<li><a href="#">Modification d'un client</a></li>
				<li><a href="#">Comptes d'un client</a></li>
				<li><a href="#">Virement</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<form method="post" action="Login"
			class="form-inline row">
			<fieldset>
			<legend class="legende">Authentification</legend>
			<label class="sr-only" for="login">Login</label> <input type="text"
				class="col-4" id="login" placeholder="Identifiant"> <label
				class="sr-only" for="mdp">MDP</label> <input type="password"
				class="col-4" id="mdp" placeholder="Mot de passe">
			</fieldset>
			<button type="submit" class="col-4 btn btn-primary">Valider</button>
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