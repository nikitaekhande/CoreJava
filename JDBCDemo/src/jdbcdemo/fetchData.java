package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fetchData {
	
	public static void main(String args[]) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Nikita@123");
		
		PreparedStatement ps = con.prepareStatement("select*from register");
		ResultSet rs =ps.executeQuery();
		
		
		while(rs.next()) {
			String name1 = rs.getString("name");
			System.out.println(name1);
			
			String email1 =rs.getString("email");
			System.out.println(email1);
			
			String city =rs.getString("city");
			System.out.println(city);
		}
	}

	

}
