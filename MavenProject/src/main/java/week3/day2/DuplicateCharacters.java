package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String input = "Infosys Limited";

		input = input.replaceAll("\\s", "");

		char[] charArray = input.toCharArray();

		Map<Character, Integer> myList = new LinkedHashMap<>();

		for (char c : charArray) {

			if (myList.containsKey(c)) {
				myList.put(c, myList.get(c) + 1);
			} else {
				myList.put(c, 1);
			}
		}

		for (Entry<Character, Integer> load : myList.entrySet()) {

			if (load.getValue()> 1) {
				System.out.print(load.getKey());
			}

		}

	}

}
