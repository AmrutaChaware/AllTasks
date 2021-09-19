import java.text.DecimalFormat;

public class Decimal 
{
	public static void main(String[] args)
	{
		System.out.println("1st way");
		
		System.out.println("Before round off :");
		System.out.println(123.24*13.1);
		
		System.out.println("After round off :");
		System.out.println(new DecimalFormat("0.00").format(123.24*13.12));
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("2nd way");
		System.out.println("Before");
		System.out.println(123.24*13.12);
		System.out.println("After rounding");
		System.out.printf("%.2f",(123.24*13.12));
		
		System.out.println("\n------------------------------------------------------------");
		
		System.out.println("3rd way");
		
		double num= 3.14763837347;
		System.out.println("Number is : "+num);
		
		num=Math.round(num*100.0)/100.0;
		System.out.println("After rounding "+num); 
	}
}
