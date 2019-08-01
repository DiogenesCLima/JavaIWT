package br.com.iw.crud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.iw.bd.TestaConexaoBD;

@WebServlet("/Cadastrar")
public class CadastrarCliente extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requisicaoCliente(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requisicaoCliente(request, response);
	}
	
	protected void requisicaoCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TestaConexaoBD testConnect = new TestaConexaoBD();
		Connection mysqlConnection  = testConnect.getConexao();
		
		try {
			
			mysqlConnection.isValid(0);
			System.out.println("Conexao OK");
			mysqlConnection.close();
			
		} catch (SQLException e) {
			
			System.out.println("Ocorreu um erro ou criar uma conexao" + e.getMessage());
		}
	}

}
