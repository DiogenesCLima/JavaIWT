<%@ page language="java" contentType="text/html1" pageEncoding="UTF-8"%>
<%@ page import="br.com.iw.classes.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Validar Endereco</title>
</head>
<body>
<%
	Endereco end = (Endereco) request.getAttribute("endereco");
%>
<%= "logradouro" + end.getLogradouro() %>
<%= "numero" + end.getNumero() %>
</body>
</html>