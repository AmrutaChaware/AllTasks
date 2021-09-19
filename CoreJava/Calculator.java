import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		System.out.println("Menu :\n1.Addition\n2.Substraction\n3.multiplication\n4.division\n5.Square\n6.Cube\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int ch = scan.nextInt();
		
		
		if(ch<=6)
		{
		switch(ch)
		{
		case 1 :
				System.out.println("Enter two numbers");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int add =num1 +num2;
				System.out.println("Addition is : " +add);
				break;

		case 2 :
			System.out.println("Enter two numbers");
			int num3 = scan.nextInt();
			int num4 = scan.nextInt();
				int sub =num3-num4;
				System.out.println("Substraction is : " +sub);
				break;
		case 3 :
			System.out.println("Enter two numbers");
			int num5 = scan.nextInt();
			int num6 = scan.nextInt();
			int mul =num5*num6;
		System.out.println("Multiplication is : " +mul);
		break;	
		
		case 4 :
			System.out.println("Enter two numbers");
			int num7 = scan.nextInt();
			int num8 = scan.nextInt();
			int div =num7/num8;
		System.out.println("Division is : " +div);
		break;
		
		case 5 :
			System.out.println("Enter one numbers");
			int num9 = scan.nextInt();
			int square = num9*num9;
		System.out.println("Square is : " +square);
		break;
		
		case 6 :
			System.out.println("Enter one numbers");
			int num10 = scan.nextInt();
			int cube =num10*num10*num10;
		System.out.println("Cube is : " +cube);
		break;
		
		default:
			System.out.println("Enter correct choice");
		}
		}
		else
		{
			System.out.println("Enter correct choice");
		}
	}

}
