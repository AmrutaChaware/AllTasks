import java.util.Scanner;

public class Prime_uptoNumber {

	public static void main(String[] args) 
	{
		int i,count,add=0;
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
       // System.out.println("\nNONPRIME NUMBERS BETWEEN 1 TO " +n+" ARE ");
        for(int j=2;j<=n;j++)
        {
        	count=0;
        	for(i=1;i<=j;i++)
        	{
        		if(j%i==0)
        		{
        			count++; 
        		}
        		
        	}
        	if(count==2)
        	System.out.print(j+" "); 
        	add++;
        	System.out.println("\n Total prime numbers are : "+add);
       }
    	
        
	}
}


