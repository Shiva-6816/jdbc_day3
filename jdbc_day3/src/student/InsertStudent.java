package student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		Scanner scanner = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");

		PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?,?,?)");

		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "sonu");
		preparedStatement.setInt(3, 23);
		preparedStatement.setString(4, "hyd");

		Date sqldate = Date.valueOf("2023-05-10");
		preparedStatement.setDate(5, sqldate);

		preparedStatement.setLong(6, 7286820550l);

		preparedStatement.execute();

		connection.close();

		System.out.println("sucessfully ");

	}

}
