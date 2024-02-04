package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	
	public static void main(String args[]) throws Exception {
		
		Class .forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root" ,"Nikita@123");
		
		PreparedStatement Ps = con.prepareStatement("insert into register values('nikita','nikita@088gmail.com','nikita@123','female','akole')");
		int i = Ps.executeUpdate();
		
		if(i>0) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}
		

}
