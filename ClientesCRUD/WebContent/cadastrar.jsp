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
			    <div class="col-md-2" style="border: 1px solid red">
			     <div class="col-md-12 text-center" style="border: 1px solid red">
			      	Cadastrar
			      </div>
			      <div class="col-md-12 text-center" style="border: 1px solid red">
			      	listar
			      </div>
			      <div class="col-md-12 text-center" style="border: 1px solid red">
			      	Atualizar
			      </div>
			      <div class="col-md-12 text-center" style="border: 1px solid red">
			      	Exluir
			      </div>
			    </div>
			    <div class="col-md-10 text-center" style="border: 1px solid black">
			      <form method="get"  action="CadastrarCliente">
			      	<label>CPF:</label>
			      	<input type="text" name="cpf" placeholder="Digite seu CPF (apenas numueros)" size=50/>
			      	</br>
			      	<label>NOME:</label>
			      	<input type="text" name="nome" placeholder="Digite nome completo" size=50/>
			      	</br>
			      	<label>Telefone:</label>
			      	<input type="text" name="telefone" placeholder="Digite seu telefone" size=50/>
			      	</br>
			      	<label>Sexo:</label>
			      	<select nome="sexo">
			      		<option value="M">Masculino</option>
			      		<option value="F">Feminino</option>
			      	</select>
			      	</br>
			      	<input type="submit" value="Cadastrar Cliente">
			      	</form>
			    </div>
		  	</div>
		</div>
	</body>
</html>