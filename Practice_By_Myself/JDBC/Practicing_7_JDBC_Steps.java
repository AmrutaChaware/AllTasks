//import package for SQL
import java.sql.*;

//Creating class for JDBC Connection
public class Practicing_7_JDBC_Steps {

	//Main method
	public static void main(String[] args) 
	{
		try {
			/* 1.Load Driver and 2.Register Driver:- 
				 Loading Driver from mysql-Connector jar available on google
				 DriverName : com.mysql.jdbc.Driver
				 forName(): used to load the Driver
				  			-this method belongs to a "Class" class 
				  			-thats why we write : Class.forName()
				  			-forName() is a Reflection API method which loads the Driver */
			Class.forName("com.mysql.jdbc.Driver");
			
			/* 3.Establish Connection 
			    - Connection is a interface so we cannot create object of the Connection
			    - So we use getConnection() method to get the Object of Connection 
			    - getConnection() method belongs to DriverManager class
			    - getConnection() is a static method so we use Class Name DriverManager
			    - connection is a reference name
			    - path for connection:- "jdbc:mysql://localhost:3306/test"
			    - username :- 'root' 
			    - password :- 'root' 
			    */
				
			Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","root" );
			
			/* 4.Fire Query
			 	- We use Statement for query firing
			 	- Statement is a Interface so again we need to access object
			 	- so we use connection object*/
			Statement  statement = connection.createStatement();
			
			/* 5. Execute Query
			 	- ResultSet is an Interface so we can use object of statement 
			 	- resultset is a object : so it holds the table */
		   ResultSet resultset = statement.executeQuery("select * from books");
		   
		   /* 6. Process Query
		      	- means fetching data
		      	- next() is a method which points the records and 
		      	  also checks whether data present on next line or not
		      	- getInt()for fetching integer type value 
		      	- getInt(1) means fetching data from 1st column
		      	- getString()for fetching String type value
		      	- getInt(2) means fetching data from 2nd column*/
		   while(resultset.next())
		   {
			   System.out.print(resultset.getInt(1)+" ");
			   System.out.print(resultset.getString(2)+" ");
			   System.out.print(resultset.getString(3)+"\n");
		   }
		   /* 6. Close Connection */
		   
		   statement.close();
		   connection.close();
			
		} 
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
