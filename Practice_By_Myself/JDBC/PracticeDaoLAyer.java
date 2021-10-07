class Student1{
	int rollno;
	String Name;
}

class Studentdao{
	
	public Student1 getstudent(int rollno)
	{
		
		return null;
		
	}
}

public class PracticeDaoLAyer {

	public static void main(String[] args) {
		
		Studentdao studentdao = new Studentdao();
		
		Student1 student1 = studentdao.getstudent(12);
		
		
		System.out.println(student1.name);

	}

}
