package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		if (DAO.login(username, password))
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			response.sendRedirect("LoggedIn.jsp");
		}
		else 
		{
			request.getRequestDispatcher("Login.jsp").include(request,response);
			PrintWriter out = response.getWriter();
			out.println("<p style=\"color:red\";>Error: Wrong username or password</p>");
			System.out.println("Wrong username or password");
		}
	}

}
