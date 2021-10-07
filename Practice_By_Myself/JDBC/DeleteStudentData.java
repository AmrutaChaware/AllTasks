import java.sql.*;
import java.util.Scanner;

class Amruta3{
	int roll;
	String name;
}
class Amruta3daoclass{
	
	public Amruta3 removestudent(int roll)
	{
		
		try {
			
			Amruta3 a = new Amruta3();
			a.roll = roll;
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amruta", "root", "root");
			
			String query = "delete from student where RollNo ="+roll;
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

public class DeleteStudentData 
{

	public static void main(String[] args) 
	{
		Amruta3daoclass dao = new Amruta3daoclass();
		Scanner scan = new Scanner(System.in);
		int rollnumber=scan.nextInt();
		
		
		Amruta3 student = dao.removestudent(rollnumber);
		
	}

}


