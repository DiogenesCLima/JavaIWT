package br.com.iw.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/*@WebServlet(
		urlPatterns = { "/AutoInitParams" }, 
		initParams = { 
				@WebInitParam(name = "ip-servidor", value = "10.55.0.1"), 
				@WebInitParam(name = "porta", value = "8080")
		},
		loadOnStartup = 1)*/
public class AutoInitParams extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Esse servlet instaciado!" + "O ip do servidor: " + config.getInitParameter("ip-servidor"));
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("AutoDestruuição");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
	}

}
