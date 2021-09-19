import java.util.Scanner;

public class DaysToMonth 
{
public static void main(String[] args)
{
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Days : ");
	int days=scan.nextInt();
	
	
	if(days >  30)	
	{
		System.out.println("1 month and " +(days-30)+"days");
	}
}
}
