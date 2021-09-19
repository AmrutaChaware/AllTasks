
public class Logical 
{
	public static void main(String[] args) 
	{
		int n1=5,n2=4;//5=0101 4=0100
		
		System.out.println(n1 & n2);//0100
		System.out.println(n1 | n2);//0101
		System.out.println(n1 ^ n2);//0001
		System.out.println(5>>2);//0000 0101->0000 0001
		System.out.println(5<<2);//0000 0101->0001 0100
	    System.out.println(5>>>2);//0000 0101->0000 0001
	}

}
