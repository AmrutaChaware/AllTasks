import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
			int fact=1;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Number for factorial");
			int num = scan.nextInt();
			
			for(int i =1;i<=num;i++)
			{
			fact=fact*i;
			}
			System.out.println("Factorial of "+num+" is: "+fact);
	}

}
