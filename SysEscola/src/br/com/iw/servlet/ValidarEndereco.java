package br.com.iw.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.iw.classes.Endereco;

@WebServlet("/ValidarEndereco")
public class ValidarEndereco extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		validarEndereco(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		validarEndereco(request, response);
	}
	
	protected void validarEndereco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String logradouro = request.getParameter("logradouro");
		String numero = request.getParameter("numero");
		
		Endereco end = new Endereco(logradouro, Integer.parseInt(numero));
		
		request.setAttribute("endereco", end);
		
		RequestDispatcher enc = request.getRequestDispatcher("result.jsp");
		
		enc.forward(request, response);
	}
	
}
