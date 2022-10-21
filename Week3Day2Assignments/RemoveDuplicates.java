package Week3Day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "PayPal India";
		char[] RemDup = name.toCharArray();

		Set<Character> charset = new HashSet<Character>();

		Set<Character> dupCharSet = new HashSet<Character>();

		for (char input : RemDup) {
			if (!charset.add(input)) {

				dupCharSet.add(input);
			}

		}

		System.out.println(dupCharSet);
		System.out.println(charset);

		if (dupCharSet.equals(charset)) {

			System.out.println();
		}
		for (int i = 0; i < charset.size(); i++) {

		}
		
		int[] a = {1,2,4,4};
		java.util.List<Integer> a_list = new ArrayList<Integer>();
		for (int i:a ) a_list.add(i);
		
	}

}
