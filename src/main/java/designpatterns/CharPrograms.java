package designpatterns;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharPrograms {

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public static void main(String[] args) {

		String str = "i am counting chars occarances";
		char[] charArr = str.toCharArray();

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < charArr.length; i++) {

			if (charArr[i] == ' ') {
				continue;
			}

			if (!map.containsKey(charArr[i])) {
				map.put(charArr[i], 1);
			} else {

				// map.get(charArr[i]) = This will give existing value associated for the key
				map.put(charArr[i], map.get(charArr[i]) + 1);
			}
		}
		System.out.println("output is::" + map);
	}
}
