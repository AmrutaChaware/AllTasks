
public class Variable
{
	static int a=10;
	int b=50;
	int c=20;
	public static void main(String[] args) 
	{
		Variable v1 =new Variable();
		Variable v2 =new Variable();
		
		v1.a=20;
		v1.a=30;
		System.out.println("v1.a = " +v1.a);
		System.out.println("v1.b = " +v1.b);
		
		v2.b=60;
		v2.b=70;
		v2.b=80;
		System.out.println("v2.b = " +v2.b);
		System.out.println("v2.a = " +v2.a);
		
		

	}

}
