package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	
	public static void main(String args[]) throws Exception {
		
		String city ="Sangmner";
		String email ="nikita@088gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://3306/jdbc_db","root","Nikita@123");
		
		PreparedStatement ps =con.prepareStatement("update register set city = ? where email =?");
		
		ps.setString(1, city);
		ps.setString(2, email);
		
		int count = ps.executeUpdate();
		
		if(count>0) {
			
			System.out.println("update succesfully");
		}
		else {
			System.out.println("update fail");
		}
		
		
	}

}
