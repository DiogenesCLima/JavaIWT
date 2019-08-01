package br.com.restaurante.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.restaurante.RestauranteCaseiro;


@WebServlet("/RestauranteController")
public class RestauranteController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pedidosRestaurante( request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pedidosRestaurante( request, response);
	}
	
	protected void pedidosRestaurante (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RestauranteCaseiro Restaurante = new RestauranteCaseiro();
		
		String kgRefeicao01 = request.getParameter("m01i01");
		String sobremesa01 = request.getParameter("m01i02");
		String refri2L01 = request.getParameter("m01i03");
		String refri600L01 = request.getParameter("m01i04");
		String refrilata01 = request.getParameter("m01i05");
		String cerveja01 = request.getParameter("m01i06");
		
		String kgRefeicao02 = request.getParameter("m02i01");
		String sobremesa02 = request.getParameter("m02i02");
		String refri2L02 = request.getParameter("m02i03");
		String refri600L02 = request.getParameter("m02i04");
		String refrilata02 = request.getParameter("m02i05");
		String cerveja02 = request.getParameter("m02i06");
		
		String kgRefeicao03 = request.getParameter("m03i01");
		String sobremesa03 = request.getParameter("m03i02");
		String refri2L03 = request.getParameter("m03i03");
		String refri600L03 = request.getParameter("m03i04");
		String refrilata03 = request.getParameter("m03i05");
		String cerveja03 = request.getParameter("m03i06");
	}

}
