package Week3Day2Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Akila";
           //name.equalsIgnoreCase("akila");
		char[] unique = name.toCharArray();
		Set<Character> HashSet = new HashSet<Character>();
		Set<Character> uniquechar = new HashSet<Character>();

		for (Character names : unique) {
			if (!HashSet.add(names)) {
				uniquechar.add(names);
			}
		}
		System.out.println(uniquechar);
	}

}
