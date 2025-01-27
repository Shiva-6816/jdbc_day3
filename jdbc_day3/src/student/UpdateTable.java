package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		
		 Statement statement = connection.createStatement();
		 
		 statement.execute("alter table student modify column phone bigint(11) ");
		 
		 connection.close();
		 
		 System.out.println("sucessfully updated");
	}

}
