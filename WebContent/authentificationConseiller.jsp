<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentification du conseiller</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 formulaire">
				<div class="page-header">
					<h1>Bienvenue sur Proxibanque</h1>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 titre">
			<h4>Veuillez vous identifier</h4>
			</div>
		</div>	
		<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 formulaire">
					<form method="post" action="AuthentificationConseiller"
						class="form-inline">
						<label class="sr-only" for="inlineFormInput">Name</label> <input
							type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
							id="inlineFormInput" placeholder="Identifiant"> <label
							class="sr-only" for="inlineFormInputGroup">Username</label>
						<div class="input-group mb-2 mr-sm-2 mb-sm-0">
							<input type="text" class="form-control" id="inlineFormInputGroup"
								placeholder="Mot de passe">
						</div>
						<button type="submit" class="btn btn-primary">Valider</button>
					</form>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>