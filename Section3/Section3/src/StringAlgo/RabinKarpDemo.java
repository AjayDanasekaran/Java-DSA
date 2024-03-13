package StringAlgo;

public class RabinKarpDemo {
    public static void search(String pattern, String text) {
        int patternHash = pattern.hashCode();
        int patternLength = pattern.length();
        for (int i = 0; i <= text.length() - patternLength; i++) {
            String substring = text.substring(i, i + patternLength);
            if (substring.hashCode() == patternHash && substring.equals(pattern)) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        String text = "HelloFromHello";
        String pattern = "Hello";
        search(pattern, text);
    }
}

