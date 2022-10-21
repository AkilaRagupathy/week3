package Week3Day2Assignments;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		// List<Integer> list=new ArrayList<Integer>(data);
		// System.out.println(data);
		Set<Integer> data1 = new TreeSet<Integer>();
		System.out.println(data1);

		for (int i = 0; i < data.length; i++) {

			data1.add(data[i]);

		}

		System.out.println(data1);

		List<Integer> list = new ArrayList<Integer>(data1);

		// System.out.println(list.size());

		int lastindex = list.size();

		System.out.println(list.get(lastindex - 2));

	}

}
