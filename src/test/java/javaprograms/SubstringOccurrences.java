package javaprograms;

public class SubstringOccurrences {
    
    public static void main(String[] args) {
        String str = "Finding a sub string in a string";
        String substr = "string";
        
        int count = 0;
        int n = str.length();
        int m = substr.length();
        for (int i = 0; i <= n - m; i++) {
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        
        System.out.println("The substring:" + substr + ":occurs: " + count + " :times in the string:" + str);
    }
    
}
