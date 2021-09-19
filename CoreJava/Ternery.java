
public class Ternery {

	public static void main(String[] args) {
		/*int a=25,b=25;
		int max=(a>b)?a:b;
		System.out.println(max);*/
		
		int a=20,b=25,c=30;
		int max=(a>b)?(a>c?a:b):(b>c?b:c);
		System.out.println("Greater no. among "+a+","+b+","+c+" is " +max);

	}

}
