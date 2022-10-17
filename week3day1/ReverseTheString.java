package week3day1;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aditya";
		char[] ch=s.toCharArray();
		String rev = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev =rev+ ch[i];
			
			//System.out.println(rev);
		}
		System.out.println(rev);
	}

}
