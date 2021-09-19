import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		 System.out.println("a ");
		 int a = scan.nextInt();
		 System.out.println("b ");
		 int b = scan.nextInt();
		
		 a = a+b;//12+2 = 14 i.e. a = 14
		 b = a-b;//14-2 = 12 i.e  b = 12
		 a = a-b;//14-12= 2  i.e. a = 2
		
		 System.out.println("After swapping");
		 System.out.println("a " +a);
		 System.out.println("b " +b);
		

	}

}
