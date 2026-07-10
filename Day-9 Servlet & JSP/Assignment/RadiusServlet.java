package assignment.day9;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadiusServlet
 */
@WebServlet("/RadiusServlet")
public class RadiusServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double radius = Double.parseDouble(request.getParameter("radius"));
		
		double area = 3.14*radius*radius;
		
		request.setAttribute("radius", radius);
		request.setAttribute("area", area);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("AreaServlet");
		
		dispatcher.forward(request, response);
		
	}

}
