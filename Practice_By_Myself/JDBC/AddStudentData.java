import java.sql.*;
import java.util.Scanner;

class Amruta2{
	int roll;
	String name;
}
class Amruta2daoclass{
	
	public Amruta2 addstudent(int roll,String name)
	{
		
		try {
			
			Amruta2 a = new Amruta2();
			a.roll = roll;
			a.name = name;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amruta", "root", "root");
			
			String query = "insert into student value(?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1,a.roll);
			pstmt.setString(2,a.name );
			
			pstmt.executeUpdate();
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	
}

public class AddStudentData 
{

	public static void main(String[] args) 
	{
		Amruta2daoclass dao = new Amruta2daoclass();
		Scanner scan = new Scanner(System.in);
		int rollnumber=scan.nextInt();
		String name = scan.nextLine();
		
		Amruta2 student = dao.addstudent(rollnumber,name);
		
		
	}

}
