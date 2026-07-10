package assignment.day9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AreaServlet
 */
@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        double radius =
        (Double)request.getAttribute("radius");

        double area =
        (Double)request.getAttribute("area");

        out.println("<h2>Circle Details</h2>");
        out.println("Radius : " + radius + "<br>");
        out.println("Area : " + area);
		
	}

}
