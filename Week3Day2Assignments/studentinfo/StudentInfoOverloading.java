package studentinfo;

public class StudentInfoOverloading {
	
	public void StudentInfo(double id)
	{
		System.out.println("Student ID: "+id);
	}

	public void StudentInfo(int id,String Name)
	{
		System.out.println("Student ID:   "+id);
		System.out.println("Student Name:  "+Name);
	}
	
	public void StudentInfo(String email,String phoneno)
	{
		System.out.println("Student email id:  "+email);
		System.out.println("Student phone number:    "+phoneno);
	}
	public static void main(String[] args) {
		
	
		StudentInfoOverloading call= new StudentInfoOverloading();
		call.StudentInfo(70110001);
		call.StudentInfo(10001, "Akila.R");
		
		call.StudentInfo("akilarunprasad@gmail.com", "9676245677");
		
		
		
		
		

	}

}
