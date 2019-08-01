package br.com.iw.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.iw.entity.Cliente;
import br.com.iw.model.ClienteDAO;

@WebServlet("/Controller")
public class ClienteController extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requisicaoCliente(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requisicaoCliente(request, response);
	}

	
	protected void requisicaoCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operacao = request.getParameter("operacao");
		String cpf = request.getParameter("cpf");
		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		String telefone = request.getParameter("telefone");
		
		if (operacao.contentEquals("cadastrar")) {
			
			Cliente cliente = new Cliente();
			cliente.setCpf(Long.parseLong(cpf));
			cliente.setNome(nome);
			cliente.setSexo(sexo.charAt(0));
			cliente.setTelefone(Long.parseLong(telefone));
			
			
			ClienteDAO clienteDAO = new ClienteDAO();
			
			clienteDAO.cadastrar(cliente);
			
			
			request.setAttribute("result", "Dados Cadastrados com sucesso");
			RequestDispatcher enc = request.getRequestDispatcher("view/cadastrar.jsp");
			enc.forward(request, response);
			
			
		} else if (operacao.equals("listar")){
			
			try {
				
				ClienteDAO clienteDAO = new ClienteDAO();
				
				List<Cliente> contatosCadastrados = clienteDAO.listar();
				
				request.setAttribute("result", "Dados listados com sucesso!");
				request.setAttribute("contatosCadastrados", contatosCadastrados);
				RequestDispatcher enc = request.getRequestDispatcher("view/listar.jsp");
				enc.forward(request, response);
				
			} catch (Exception e) {
				System.out.println("Occoreu um erro ao tentar listar os registros: Error: " + e.getMessage());
			}
			
		} else if (operacao.equals("atualizar")){
			
			try {
				
				Cliente cliente = new Cliente();
				cliente.setCpf(Long.parseLong(cpf));
				cliente.setNome(nome);
				cliente.setSexo(sexo.charAt(0));
				cliente.setTelefone(Long.parseLong(telefone));
				
				
				ClienteDAO clienteDAO = new ClienteDAO();
				
				clienteDAO.atualizar(cliente);
				
				
				request.setAttribute("result", "Dados Atualizados com sucesso");
				RequestDispatcher enc = request.getRequestDispatcher("view/atualizar.jsp");
				enc.forward(request, response);
				
				
			} catch (Exception e) {
				System.out.println("Occoreu um erro ao tentar atualizar os registros: Error: " + e.getMessage());
			}
			
		}else if (operacao.equals("excluir")){
			
			try {
				
				Cliente cliente = new Cliente();
				cliente.setCpf(Long.parseLong(cpf));
	
				ClienteDAO clienteDAO = new ClienteDAO();
				
				clienteDAO.excluir(cliente);
				
				
				request.setAttribute("result", "Dados Ecluidos com sucesso");
				RequestDispatcher enc = request.getRequestDispatcher("view/excluir.jsp");
				enc.forward(request, response);
				
				
			} catch (Exception e) {
				System.out.println("Occoreu um erro ao tentar excluir os registros: Error: " + e.getMessage());
			}
			
		}
	}
}
