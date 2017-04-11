<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<div class="page-header row entete">
					<h1>Bienvenue sur Proxibanque</h1>
		</div>
		<div class="row titre">
			<h4>Veuillez vous identifier</h4>
		</div>	
		<div class="form-inline row">
					<form method="post" action="authentificationConseiller">
						<label class="sr-only" for="login">Login</label> <input
							type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
							id="login" placeholder="Identifiant"> <label
							class="sr-only" for="mdp">MDP</label>
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<input type="password" class="form-control" id="mdp"
								placeholder="Mot de passe">
						</div>
						<button type="submit" class="btn btn-primary">Valider</button>
					</form>
			</div>
		</div>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>