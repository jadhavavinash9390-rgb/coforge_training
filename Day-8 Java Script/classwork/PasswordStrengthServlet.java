package com.coforge.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordStrengthServlet")
public class PasswordStrengthServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String password = request.getParameter("pwd");

		if (password == null) {
			return;
		}

		if (password.length() < 3) {
			out.println("<font color='red'><b>Weak</b></font>");
		}

		else if (password.length() >= 3 && password.length() <= 6) {
			out.println("<font color='orange'><b>Good</b></font>");
		}
		else {
			out.println("<font color='green'><b>Strong</b></font>");
		}
	}
}