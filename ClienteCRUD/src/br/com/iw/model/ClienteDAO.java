package br.com.iw.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.iw.entity.Cliente;


public class ClienteDAO implements DAO {
	
	private Connection connexao;
	
	public ClienteDAO () {
		
		this.connexao = new MysqlConnection().getConexao();
	}

	@Override
	public void cadastrar(Object object) {
	
		PreparedStatement insertSt = null;
		String sql = "INSERT INTO contato (cpf, nome, sexo, telefone) VALUES (?, ?, ?, ?)";
		try {
			insertSt = this.connexao.prepareStatement(sql);
			Cliente cliente = (Cliente) object;
			insertSt.setLong(1, cliente.getCpf());
			insertSt.setString(2, cliente.getNome());
			insertSt.setString(3, String.valueOf(cliente.getSexo()));
			insertSt.setLong(4, cliente.getTelefone());
			insertSt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("Erro ao incluir contato. messagem: " + e.getMessage());
		} finally {
			try {
				insertSt.close();
				connexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a operaçãode inserção. messagem: " + e.getMessage());
			}
		}
		
	}

	@Override
	public List<Cliente> listar() {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		Statement consulta = null;
		ResultSet resultado = null;
		Cliente cliente = null;
		String sql = "SELECT * FROM contato";
		try {
			consulta = this.connexao.createStatement();
			resultado = consulta.executeQuery(sql);
			while (resultado.next()) {
				cliente = new Cliente();
				cliente.setCpf(resultado.getLong("cpf"));
				cliente.setNome(resultado.getString("nome"));
				cliente.setSexo(resultado.getString("sexo").charAt(0));
				cliente.setTelefone(resultado.getLong("telefone"));
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar contato. messagem: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				connexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a operaçãode busca. messagem: " + e.getMessage());
			}
		}
		
		return clientes;

	}

	@Override
	public void atualizar(Object object) {
		
		PreparedStatement atualizaSt = null;
		String sql = "UPDATE contato SET nome = ?, sexo = ?, telefone = ? WHERE cpf = ?";
		try {
			atualizaSt = this.connexao.prepareStatement(sql);
			Cliente cliente = (Cliente) object;
			atualizaSt.setString(1, cliente.getNome());
			atualizaSt.setString(2, String.valueOf(cliente.getSexo()));
			atualizaSt.setLong(3, cliente.getTelefone());
			atualizaSt.setLong(4, cliente.getCpf());
			atualizaSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao buscar contato. messagem: " + e.getMessage());
		} finally {
			try {
				atualizaSt.close();
				connexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a operaçãode busca. messagem: " + e.getMessage());
			}
		}
	
	}

	@Override
	public void excluir(Object object) {
		
		PreparedStatement excluirSt = null;
		String sql = "DELETE FROM contato WHERE cpf = ?";
	
		try {
			excluirSt = connexao.prepareStatement(sql);
			Cliente cliente = (Cliente) object;
			excluirSt.setLong(1, cliente.getCpf());
			excluirSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao excluir contato. messagem: " + e.getMessage());
		} finally {
			try {
				excluirSt.close();
				connexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar a operaçãode busca. messagem: " + e.getMessage());
			}
		}
		
	}
		
}
