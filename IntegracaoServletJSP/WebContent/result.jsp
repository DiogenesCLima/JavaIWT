<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Integrando Servlet com JSP</title>
	</head>
	<body>
		<%
			String nome = (String) request.getAttribute("nomeUsuario");
			String senha = (String) request.getAttribute("senhaUsuario");
		%>
		<%= "O nome do usuario é:" + nome %>
		<br />
		<%= "A senha do usuario é:" + senha %>
	</body>
</html>