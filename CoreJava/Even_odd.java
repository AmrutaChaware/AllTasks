import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value ");
		 int data1 = scan.nextInt();
		 
		 if(data1%2==0)
		 {
			 System.out.println("Number is even");
		 }
		 else
		 {
			 System.out.println("Number is odd");
		 }
	}

}
