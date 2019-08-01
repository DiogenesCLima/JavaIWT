package br.com.iw.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexaoBD {
	
	private Connection conexao = null;
	
	public TestaConexaoBD() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/cliente?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String senha = "123456";
			
			conexao = DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ou criar a conexao. Error" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Ocorreu um erro ou criar a conexao. Error" + e.getMessage());
		}
	}

	public Connection getConexao() {
		return conexao;
	}
	
}
