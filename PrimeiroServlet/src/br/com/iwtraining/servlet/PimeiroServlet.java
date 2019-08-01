package br.com.iwtraining.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeiroServlet")
public class PimeiroServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		PrintWriter out = response.getWriter();
		out.print("Dados do usuario<br>"
				+ "Nome:" + nome + "<br>"
				+ "Sobrenome:" + sobrenome + "<br>"
				+ "Email:" + email + "<br>"
				+ "Senha:" + senha + "<br>");
		out.close();
		
	}

}
