import java.sql.*;

public class InsertDataFromJava_JDBC {

	public static void main(String[] args) {
		
		
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				Statement statement = connection.createStatement();
						
				int rows_affected_cout = statement.executeUpdate("insert into JDBCTable values(4,'Neha'),(5,'Kartiki'),(6,'Misha') ");
				System.out.println(rows_affected_cout+" row/s affected");
		
		
			} 
			catch (Exception e)
			{
				System.out.println(e);
			}

	}

}
