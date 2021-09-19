class PrivateCon
{
	void details()
	{
		System.out.println("Hello");
	}
	
	private PrivateCon()
	{
		System.out.println("This is private cons");
	}
	
	static PrivateCon getObject()
	{
		PrivateCon p = new PrivateCon();
		return p;
		
	}
}



public class PrivateConst {

	public static void main(String[] args) {
		PrivateCon p2 = PrivateCon.getObject();
		p2.details();
	}

}
