package Week3Day2Assignments;

import java.util.HashSet;
import java.util.Set;


public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		Set<Integer> HashSet = new HashSet<Integer>();
		// System.out.println(HashSet);

		Set<Integer> Dupno = new HashSet<Integer>();
		System.out.println();

		for (Integer Hash : input) {
			if (!HashSet.add(Hash)) {
				Dupno.add(Hash);
			}

		}

		System.out.println(Dupno);
	}
}
