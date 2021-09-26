import java.sql.*;

public class PreparedStatement_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			PreparedStatement preparedstatement = connection.prepareStatement("insert into JDBCTable values(?,?)");
			
			preparedstatement.setInt(1,8);
			preparedstatement.setString(2,"Kritika");
					
			int rows_affected_cout = preparedstatement.executeUpdate();
			System.out.println(rows_affected_cout+" row/s affected");
	
	
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
