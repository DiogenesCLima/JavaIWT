<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Sistema de Controle de Clientes</title>
		<link rel="stylesheet" href="css/bootstrap.css">
	</head>
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12 text-center my-3" style="background-color: gray; color:white" >
					<h1>Sistema de Controle e Cadastro de Clientes</h1>
				</div>
			</div>
		  <div class="row">
		  	<div class="col-md-2">
			  	<ul class="nav nav-pills flex-column text-center my-5">
				  <li class="nav-item my-5">
				    <a class="nav-link active" href="view/cadastrar.jsp">Cadastrar Cliente</a>
				  </li>
				  <li class="nav-item my-5">
				    <a class="nav-link active" href="view/listar.jsp">Listar Clientes</a>
				  </li>
				  <li class="nav-item my-5">
				    <a class="nav-link active" href="view/atualizar.jsp">Atualizar Cliente</a>
				  </li>
				  <li class="nav-item my-5">
				    <a class="nav-link active" href="view/excluir.jsp">Excluir Cliente</a>
				  </li>			  
				</ul>
			</div>
			<div class="col-md-10 text-center">
				<img alt="Imagem de Clientes" src="img/clientes.png" />
			</div>
		  </div>
		  <footer class="row">
		  	<div class="col-md-12 footer-copyright text-center">
		  		&copy 2019 Copyright:
			  	<a href="http://www.iwtraining.com.br">Iw Training</a>
		  	</div>
		  </footer>
		</div>
	</body>
</html>