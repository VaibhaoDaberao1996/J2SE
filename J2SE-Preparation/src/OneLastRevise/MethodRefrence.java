package OneLastRevise;

import java.util.Arrays;

public class MethodRefrence {

	public static void main(String[] args) {

		String[] words = { "Rahul", "vishal", "Shubham", "vaibhao" };

		// Methods refernce particularly in the parameter of a method

		Arrays.sort(words, String::compareToIgnoreCase);

		for (String word : words) {
			if (word.contains("u")) {
				continue;
			} else {
				System.out.print(" " + word);
			}
		}
	}
}
