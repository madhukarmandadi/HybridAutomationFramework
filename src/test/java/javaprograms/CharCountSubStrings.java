package javaprograms;

public class CharCountSubStrings {

	public static void main(String[] args) {
		
		int maxSubStringLen=0;
		int secondMaxSubString=0;
		String biggestSubString = " ";
		
		String secondBiggestSubString = " ";

		String str = "hello madhukar where are you is a test automation engineer using selenium";
		String[] strArray = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {

			int len = strArray[i].length();
			if (len >=maxSubStringLen) {
				
				biggestSubString = strArray[i];
				maxSubStringLen=strArray[i].length();
			}
		}
		System.out.println("sub string having max length:" + biggestSubString);
	}
}
