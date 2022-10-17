package week3day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		 int length1=text1.length();
		 int length2=text2.length();
		 
		if(length1 ==(length2))
		{
			char[] length11= text1.toCharArray(); 
			//System.out.println(Arrays.toString(length11));
			char[] length21=text2.toCharArray();
			//System.out.println(Arrays.toString(length21));
		    Arrays.sort(length11);
		    System.out.println(Arrays.toString(length11));
		    
			Arrays.sort(length21);
			System.out.println(Arrays.toString(length21));
			
		if(	length11 .equals(length21))
			{
				System.out.println("both arrays have same values");
				
			}
		else {
			System.out.println("both arrays are not equal");
		}
	          
		}
		
	
		
	}

	
	

}
