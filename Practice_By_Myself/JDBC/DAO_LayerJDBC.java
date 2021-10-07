/*DAO-Data Access Object
 * write all database steps in DAO layer*/

import java.sql.*;

class Student
{
	int rollNo;
	String name;;
}

class StudentDAO
{
	public Student getStudent(int rollNo) 
	{
		
		
		try {
				String Query="select NAME from student where RollNo="+rollNo;
				
				Student student = new Student();
				student.rollNo = rollNo;
				
				Class.forName("com.mysql.jdbc.Driver");//load and register driver
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amruta", "root", "root");//establish connection
				Statement statement = connection.createStatement();//fire Query
				ResultSet resultset = statement.executeQuery(Query);//execute Query
					
				//process Query
					resultset.next();
					String name = resultset.getString(1);
					student.name = name;
					return student;
				
				} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
		return null;
		
		
		
	}
}
public class DAO_LayerJDBC {

	public static void main(String[] args) 
	{
		StudentDAO studentdao = new StudentDAO();
		
		Student student = studentdao.getStudent(12);
		System.out.println(student.name);

	}

}


