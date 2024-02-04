package servletjava;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")

@WebServlet("/submitForm")

public class Myservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request ,HttpServletResponse response) throws ServletException ,IOException
	{
		//Backed code
		
		//System.out.println(" I am in doGet() method");
		
		// to get parameter from user we used request.getparameter method
		String FirstName =request.getParameter("First Name");
		String LastName = request.getParameter("Last Name");
		 //print output on console
		System.out.println("First Name:" +FirstName);
		System.out.println("Last Name:" +LastName);
		
		
		//to print on browser we used  response .getwriter() method
		PrintWriter out = response.getWriter();
		
		
		out.println("First Name:" +FirstName);
		out.println("Last Name :" +LastName );
		
		
	}           
	
	
}


	
	
	


