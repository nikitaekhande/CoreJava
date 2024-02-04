package nikitajsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/submitForm")
public class Resister extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out = resp.getWriter();
		
		
		String name = req.getParameter("name");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		String gender= req.getParameter("gender");
		String city= req.getParameter("city");
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/yt_db" ,"root","Nikita@123");
			
			PreparedStatement ps = con.prepareStatement("insert into resister values(?,?,?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);
			
			 int count =ps.executeUpdate();
			 
			 if(count>0) {
				resp.setContentType("text/Html");
				
				out.print("<h3 style='color:green'>User resister succesfully</h3>");
				RequestDispatcher rd =req.getRequestDispatcher("/Resister1.jsp");
					
			    rd.include(req, resp);
				}
				else {
					
					resp.setContentType("text/Html");
					
					out.print("<h3 style='color:red'>User not resister succesfully</h3>");
					RequestDispatcher rd =req.getRequestDispatcher("/Resister1.jsp");
						
				    rd.include(req, resp);
					
				}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			resp.setContentType("text/Html");
			
			out.print("<h3 style='color:red'> exception occured:"+e.getMessage()+"</h3>");
			RequestDispatcher rd =req.getRequestDispatcher("/Resister1.jsp");
				
		    rd.include(req, resp);
		}
	}
	
	

}
