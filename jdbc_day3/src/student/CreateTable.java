package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		
		 Statement statement = connection.createStatement();
		 
		 statement.execute("create table student (id int primary key ,name varchar(20),age int, address varchar(30), dob date ,phone bigint(10)   )");
		 
		 connection.close();
		 
		 System.out.println("sucessfully created table ");
		 
		
	}

}
