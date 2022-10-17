package week3day1;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev =rev+ ch[i];
		}
		boolean s = str.equals(rev);
		if (s == true) {
			System.out.println("The given word  " + str + "  is palindrome");
		}
 
		else
			System.out.println("The given word "+str+" is not palindrome");
	}

}
