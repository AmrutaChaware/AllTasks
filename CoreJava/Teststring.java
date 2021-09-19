
public class Teststring {

	public static void main(String[] args) 
	{
		String s1 ="Welcome To ";
		System.out.println(s1.split(""));
		
		System.out.println(s1);
		
		String s2=new String("Hello Everyone");
		System.out.println(s2);
		
		char arr[]= {'a','b','c','d','e'};
		String arr1=new String(arr);
		System.out.println("Array Elements are : "+arr1);
		
		byte b[]= {66,67,68,69,70};
		String s3 = new String(b);
		System.out.println(s3);
		
		String s4 = new String(arr,1,4);
		System.out.println(s4);
	}

}
