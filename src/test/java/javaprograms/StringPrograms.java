package javaprograms;

public class StringPrograms {

	public static void main(String[] args) {
		char c;
		String s = "Madhukar234";
		int strLen = s.length();

		for (int i = 0; i < strLen; i++) {
			 c = s.charAt(i);
			 
			 
				/*
				 * if(Character.isUpperCase(c)) { System.out.println(c); }
				 * 
				 * if(Character.isLowerCase(c)) { System.out.print(c); } System.out.println();
				 * 
				 * if(Character.isDigit(c)) {
				 * 
				 * System.out.print(c); }
				 */
			 
			if(Character.isLetterOrDigit(c)) {
				System.out.println(c);
			}
		}
	}

}
