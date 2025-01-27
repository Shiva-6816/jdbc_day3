package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FaechAllStudent {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");

	//	ResultSet resultSet = connection.prepareStatement("select * from student").executeQuery();
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
		ResultSet resultSet =   preparedStatement.executeQuery();
		
		
		
		while (resultSet.next()) {
			System.out.println("ID : " + resultSet.getInt(1));
			System.out.println("Name : " + resultSet.getString(2));
			System.out.println("Age : " + resultSet.getInt(3));
			System.out.println("Address : " + resultSet.getString(4));
			System.out.println("Date Of Birth : " + resultSet.getDate(5));
			System.out.println("Phone Number : " + resultSet.getLong(6));
			System.out.println();
			System.out.println("**********************************************");
			System.out.println();

		}

		connection.close();

		System.out.println("Hear the Data Of all Student ");

	}

}
