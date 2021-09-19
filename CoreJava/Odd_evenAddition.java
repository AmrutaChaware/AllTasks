import java.util.Scanner;

public class Odd_evenAddition 
{
   public static void main(String[] args) 
	{
		int sum=0;
		int add=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value ");
		 int number = scan.nextInt();
		 
		 for(int i=1;i<=number;i++)
		 {
		    if(i%2==0)
		    sum=sum+i;
		    
		    else
		    add=add+i;
		 }
	  	System.out.println("addition of even number upto " +number+" is " +sum);
		System.out.println("addition of odd number upto " +number+" is " +add);
	 }
}

