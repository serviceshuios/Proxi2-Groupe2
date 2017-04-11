<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" import="java.io.*" contentType="text/plain"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Erreur</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<div class="page-header row entete">
			<h1>Erreur</h1>
		</div>
		<div>Message:</div>
		<%=exception.getMessage()%>
	</div>div>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
</body>
</html>