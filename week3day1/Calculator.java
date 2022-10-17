package week3day1;

public class Calculator {

	
	public void add(int a,int b)

       {
		
		int x=a+b;
		System.out.println(x);
		
		}
	
	public void add(float a,float b,float c)
	{
		float y=a+b+c;
		System.out.println(y);
		
	}
	
	public void sub(int a,int b)
	{
		int f= a-b;
		System.out.println(f);
	
}
	
	public void sub(double c)
	{
		System.out.println(c);
	
	}
	
	public static void main(String args[])
	{
	 Calculator cal=new Calculator();
	 cal.add(5, 4);
	 cal.add(7.0f,3.0f,2.0f);
	 
		
	 Calculator cal1=new Calculator();
	 cal1.sub(24);
	 cal1.sub(300,200);
	 
	}
}


