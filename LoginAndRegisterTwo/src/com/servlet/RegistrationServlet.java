package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Registration;

import com.dao.DAO;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		Registration r = new Registration(email, name, pass);
		
		if(DAO.register(r))
		{
			request.getRequestDispatcher("Registration.jsp").include(request,response);;
			PrintWriter out = response.getWriter();
			out.println("<p style=\"color:blue\";>User registered in database</p>");		
		}
	}

}
