package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		
		 Statement statement = connection.createStatement();
		 
		 statement.execute("update student set age=30 where id = 2");
		 
		 connection.close();
		 
		 System.out.println("sucessfully updated the data  ");
		 
	}

}
