package javaprograms;

public class FindSecondLargestString {

	public static void main(String[] args) {
		
		String str = "hello madhukar where are you is a test automation engineer using";
		
		String[] strings = str.split(" ");
		
		String largest=strings[0];
		String secondLargest="";
		
		for (int i = 1; i < strings.length; i++) {
            String current = strings[i];
            if (current.compareTo(largest) > 0) {
                secondLargest = largest;
                largest = current;
            } else if (current.compareTo(largest) != 0) {
                if (secondLargest == null || current.compareTo(secondLargest) > 0) {
                    secondLargest = current;
                }
            }
        }
		
		System.out.println("second largest string is:"+secondLargest);
	}
}
