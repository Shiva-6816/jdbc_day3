package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
		preparedStatement.setInt(1, 2);
		
		preparedStatement.execute();
		
		connection.close();
		
		System.out.println("Deleted data sucessfully ");
	}

}
