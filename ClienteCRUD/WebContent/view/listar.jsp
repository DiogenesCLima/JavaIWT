<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Sistema de Controle de Clientes</title>
		<link href="http://localhost:8080/clientes/css/bootstrap.css" rel="stylesheet">
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
				    <a class="nav-link" href="http://localhost:8080/clientes/view/cadastrar.jsp">Cadastrar Cliente</a>
				  </li>
				  <li class="nav-item my-5">
				    <a class="nav-link active" href="http://localhost:8080/clientes/view/listar.jsp">Listar Clientes</a>
				  </li>
				  <li class="nav-item my-5">
				    <a class="nav-link" href="http://localhost:8080/clientes/view/atualizar.jsp">Atualizar Cliente</a>
				  </li>
				  <li class="nav-item my-5">
				    <a class="nav-link" href="http://localhost:8080/clientes/view/excluir.jsp">Excluir Cliente</a>
				  </li>			  
				</ul>
			</div>
			<div class="col-md-10">
				<h3 class="text-center my-3">Lista de Clientes</h3>
				<table class="table text-center">
				<thead>
					<tr>
						<th>#</th>
						<th>CPF</th>
						<th>Nome</th>
						<th>Sexo</th>
						<th>Telefone</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="contato" items="${contatosCadastrados}" varStatus="status">
						<tr>
							<td>${status.count}</td>
							<td>${contato.cpf}</td>
							<td>${contato.nome}</td>
							<td>${contato.sexo}</td>
							<td>${contato.telefone}</td>
						</tr>
						<br>
			    	</c:forEach>
		    	</tbody>	
		    	</table>
		    	<form method="post" action="../Controller?operacao=listar">
		    		<div class="form-group text-center my-5">
				    	<button type="submit" class="btn btn-dark">Listar Clientes</button>
				  	</div>
		    	</form>
		    	<h4 class="text-center">${result}</h4>
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