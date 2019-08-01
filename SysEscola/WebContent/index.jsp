<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>SysEscula</title>
	</head>
	<body>
		<form method="get" action="ValidarEndereco" >
		<label>Logradouro: </label>
		<input type="text" name="logradouro" />
		<br />
		<label>numero: </label>
		<input type="text" name="numero" />
		<input type="submit" value="validar endereço">
		</form>
	</body>
</html>