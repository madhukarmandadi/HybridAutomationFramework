package javaprograms;

public class CountDigits {

	public static void main(String[] args) {

		// 2. Write a Java program to calculate the sum of numbers in given alphanumeric
		
		/*
		 * Here 
		 */

		String str = "a1b12c123d4e5";
		
		int sum = 0;
		
		String replaceAll = str.replaceAll("([a-z])", " ");
		
		System.out.println("replaceAll:" + replaceAll);
		
		String[] split = replaceAll.split(" ");
		
		for (int i = 0; i < split.length-1; i++) {
			
			int parseInt = Integer.parseInt(split[i]);
			
			sum=sum+parseInt;
			
		}
		
		System.out.println("sum:" + sum);
		
//		int sum = 0;
//		
//		for (int i = 0; i < replaceAll.length(); i++) {
//
//			char c = replaceAll.charAt(i);
//			
//			if (Character.isDigit(c)) {
//				sum = sum + Character.getNumericValue(c);
//			}
//		}
//		System.out.println("sum:" + sum);

		

		

	}
}
