import java.util.Scanner;

public class Sample {

	public static void main(String[] args)
	{
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter 1st number\n ");
		int a=scan.nextInt();
		
		System.out.println("Enter 2nd number\n");
		int b=scan.nextInt();
		
		int c = a+b;
		System.out.println("Result is\n "+c);
		
	}

}
