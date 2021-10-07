import java.sql.*;
import java.util.Scanner;

class Amruta4{
	int roll;
	String name;
}
class Amruta4daoclass{
	
	public Amruta4 removestudent(int roll)
	{
		
		try {
			
			Amruta4 a = new Amruta4();
			a.roll = roll;
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amruta", "root", "root");
			
			String query = "update student set name='Nita' where RollNo ="+roll;
			PreparedStatement pstmt = con.prepareStatement(query);
			
			int rs = pstmt.executeUpdate();
			System.out.println("Rows affected :"+rs);
			System.out.println("Record Deleted");
			
		} 
		catch (Exception e) {
			
			System.out.println(e);
		}
		return null;
		
	}
	
}



public class UpdateStudentData {

	public static void main(String[] args) {
		Amruta4daoclass dao = new Amruta4daoclass();
		Scanner scan = new Scanner(System.in);
		int rollnumber=scan.nextInt();
		
		
		Amruta4 student = dao.removestudent(rollnumber);
		

	}

}
