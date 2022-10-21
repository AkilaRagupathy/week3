package Week3Day2Assignments;

import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;

import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = { 1, 2, 3, 4, 5, 6, 7, 7, 9, 10 };

		Set<Integer> tree = new TreeSet<Integer>();
		System.out.println(tree);
		for (Integer a : s) {
			tree.add(a);

		}
		System.out.println("TreeSet  " + tree);

		List<Integer> list = new ArrayList<Integer>(tree);
		System.out.println("ArrayList   " + list);
		System.out.println(list.size());
		int size = list.size();

		List<Integer> missingno = new ArrayList<Integer>();

		for (int i = 1; i < size; i++) {
			if (!list.contains(i)) {
				missingno.add(i);
				System.out.println("missing number  " + missingno);

			}

		}

	}

}
