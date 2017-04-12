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
	<form method="post" action="Login">
			<fieldset id="section-1">
				<label for="login">Saisir le login :</label>
				<input type="text" name="login" id="login"/><br/>
				<label for="mdp">Saisir le mdp :</label>
				<input type="text" name="mdp" id="mdp"/><br/>
			</fieldset>
			<input class="btn btn-primary" type="submit" value="Submit">
		</form>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>