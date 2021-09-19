import java.util.Scanner;

public class Week {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value ");
		 int data1 = scan.nextInt();
		 
		 if(data1==1)
		 {
			 System.out.println("Monday");
		 }
		 else if(data1 ==2)
		 {
			 System.out.println("Tuesday");
		 }
		 
		 else if(data1 == 3)
		 {
			 System.out.println("Wensday");
		 }
		 else if(data1 == 4)
		 {
			 System.out.println("Thusday");
		 }
		 else if(data1 == 5)
		 {System.out.println("Friday");
		 }
		 else if(data1 == 6)
		 {
			 System.out.println("Saturday");
		 }
		 else if(data1 ==7)
		 {System.out.println("Sunday");
	}
		 else
		 {
			 System.out.println("Enter valid number");
		 }
	}}