package br.com.iw.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		responseField(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		responseField(request, response);
	}
	
	protected void responseField (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login"); 
		String senha = request.getParameter("senha");
		
		PrintWriter retornoLogin = response.getWriter();
		response.setContentType("text/html");
		retornoLogin.print("O login do usuario é" + login + "a senha do usuario é" + senha);
		retornoLogin.close();
	}

}
