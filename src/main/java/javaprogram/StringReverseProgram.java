package javaprogram;

import java.util.Objects;

public class StringReverseProgram {
	public static String reverseString(String input) {
		String reverse = "";
		char ch;
		if (Objects.isNull(input)) {
			System.out.println("invalid input");
			System.exit(0);
		}
		for (int i = 0; i < input.length(); i++) {
			 ch = input.charAt(i);
			 reverse = ch+reverse;
		}
		System.out.println("reverse:" + reverse);
		return input;

	}

	public static void main(String[] args) {
		reverseString("Greeks");
	}
}