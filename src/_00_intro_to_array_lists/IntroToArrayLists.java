package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("integer");
		words.add("numbers");
		words.add("string");
		words.add("boolean");
		words.add("ints");
		//3. Print all the Strings using a standard for-loop
		
		for (int i = 0; i < words.size(); i++) {
			String s = words.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for (String string : words) {
			
			System.out.println(words);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < words.size(); i++) {
			if (i % 2 == 0) {
				String s = words.get(i);
				System.out.println(s);
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = words.size()-1; i >= 0; i--) {
			String s = words.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < words.size(); i++) {
			String s = words.get(i);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
