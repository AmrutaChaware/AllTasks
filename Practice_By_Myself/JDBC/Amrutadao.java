import java.sql.*;
import java.util.Scanner;


class Amruta{
	int rollno;
	String name;
} 

class Amrutadaoclass {
	
	public Amruta getstudentname(int rollno)
	{
		try{
			  Amruta student = new Amruta();
			  student.rollno=rollno;
			  String query = "select * from student where rollno = "+rollno;
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amruta","root","root");
			  Statement stmt = con.createStatement();
			  ResultSet rs = stmt.executeQuery(query);
			  
			  rs.next();
			  String name = rs.getString(2);
			  student.name = name;
			  
			  
			  return student;
		}
		 catch(Exception e)
		{
			 System.out.println(e);
		}
		 return null;
	}

}

public class Amrutadao {

	public static void main(String[] args) 
	{
		Amrutadaoclass dao = new Amrutadaoclass();
		Scanner scan = new Scanner(System.in);
		int rollnumber=scan.nextInt();
		Amruta student = dao.getstudentname(rollnumber);
		System.out.println("Roll no of student is :"+student.rollno);
		System.out.println("Name of student is :"+student.name);
		
	}

}
