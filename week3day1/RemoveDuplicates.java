package week3day1;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "We learn java basics as part of java sessions in java week1";

		String[] split = input.split(" ");

		for (int i = 0; i < split.length; i++)

		{
			int count = 0;
			for (int j = i + 1; j < split.length; j++) {

				if (split[i].equals(split[j])) {

					count++;

				}

			}
			if (count > 1) {
				String replace = input.replace(split[i], "");
				System.out.println(replace);
				// System.out.println(split[i]);

			}

		}

	}
}
