package StringAlgo;

public class BruteForceSearch {
    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // Pattern found at index i in the text
            }
        }
        return -1; // Pattern not found in the text
    }

    public static void main(String[] args) {
        String text = "eminemIsKing";
        String pattern = "Is";
        int index = search(text, pattern);
        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}
