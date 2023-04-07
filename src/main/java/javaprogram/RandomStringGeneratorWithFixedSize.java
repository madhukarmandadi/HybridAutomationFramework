package javaprogram;

import java.util.Random;
import java.util.stream.Collectors;

public class RandomStringGeneratorWithFixedSize {
	
	//small a ascii code - 97
	//small z ascii code - 122
	
	//capital a ascii code - 65
	//capital z ascii code - 90
	
	// numbers 0 ascii code - 48
	// numbers 9 ascii code - 57
	
	
	public static void main(String[] args) {
		RandomStringGeneratorWithFixedSize obj=new RandomStringGeneratorWithFixedSize();
//		String randomStringWithSize49 = obj.getRandomStringWithSizeOf(4);
//		System.out.println("randomStringWithSize49:"+randomStringWithSize49);
//		String randomStringWithSize50 = obj.getRandomStringWithSizeOf(11);
//		System.out.println("randomStringWithSize50:"+randomStringWithSize50);
//		String randomStringWithSize51 = obj.getRandomStringWithSizeOf(8);
//		System.out.println("randomStringWithSize51:"+randomStringWithSize51);
		
		int number = obj.getRandomStringWithSizeOf(4);
		System.out.println("randomStringWithSize49:"+number);
		
	}
	
	public int getRandomStringWithSizeOf(int number) {
		
//		String collect = new Random().ints(number, 48, 57).mapToObj(i -> String.valueOf((char) i))
//				.collect(Collectors.joining());
//		
		String collectInt = new Random().ints(number, 48, 57).
		mapToObj(i->String.valueOf((char) i)).collect(Collectors.joining());
		
		int number1 = Integer.parseInt(collectInt);
		
		//System.out.println("number1:" + number1);
		
		return number1;
		
	}
}
