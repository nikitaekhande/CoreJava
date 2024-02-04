package servletProgram;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





@WebServlet("/mylogin")
@SuppressWarnings("serial")
public class Myservlet  extends HttpServlet{
	protected void doPost(HttpServletRequest Request,HttpServletResponse Response) throws ServletException ,IOException
     
	
	
	{
		String myemail=   (String)Request.getParameter("email");
		String mypwd  =   (String)Request.getParameter("pwd");
		
		if(myemail.equals("ekhandenikita088@gmail.com") && mypwd.equals("nikita@088")) {
			
			System.out.println("success");
		}
		
		else {
			System.out.println("Failed");
		}
	}
}
