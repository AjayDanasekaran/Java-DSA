package StringAlgo;

public class BoyerMoore {
    private static int NO_OF_CHARS = 256;

    // Preprocessing function for the bad character heuristic
    private static void badCharHeuristic(char[] pattern, int[] badChar) {
        int m = pattern.length;

        for (int i = 0; i < NO_OF_CHARS; i++) {
            badChar[i] = -1; // Initialize all characters as not found
        }

        for (int i = 0; i < m; i++) {
            badChar[(int) pattern[i]] = i;
        }
    }

    // Preprocessing function for the good suffix heuristic
    private static void goodSuffixHeuristic(char[] pattern, int[] goodSuffix) {
        int m = pattern.length;
        int[] suffix = new int[m];

        suffix[m - 1] = m;
        int j = m - 1;

        for (int i = m - 2; i >= 0; i--) {
            if (i > j && suffix[i + m - 1 - j] < i - j) {
                suffix[i] = suffix[i + m - 1 - j];
            } else {
                if (i < j) {
                    j = i;
                }
                while (j >= 0 && pattern[j] == pattern[j + m - 1 - i]) {
                    j--;
                }
                suffix[i] = i - j;
            }
        }

        for (int i = 0; i < m; i++) {
            goodSuffix[i] = m;
        }

        j = 0;
        for (int i = m - 1; i >= 0; i--) {
            if (suffix[i] == i + 1) {
                for (; j < m - 1 - i; j++) {
                    if (goodSuffix[j] == m) {
                        goodSuffix[j] = m - 1 - i;
                    }
                }
            }
        }

        for (int i = 0; i < m - 1; i++) {
            goodSuffix[m - 1 - suffix[i]] = m - 1 - i;
        }
    }

    public static void search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int[] badChar = new int[NO_OF_CHARS];
        int[] goodSuffix = new int[m];

        badCharHeuristic(pattern.toCharArray(), badChar);
        goodSuffixHeuristic(pattern.toCharArray(), goodSuffix);

        int s = 0; // Shift of the pattern with respect to text
        while (s <= n - m) {
            int j = m - 1;
            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                System.out.println("Pattern found at index " + s);
                s += (s + m < n) ? m - badChar[text.charAt(s + m)] : 1;
            } else {
                s += Math.max(goodSuffix[j], j - badChar[text.charAt(s + j)]);
            }
        }
    }

    public static void main(String[] args) {
        String text = "This is a test string for searching.";
        String pattern = "search";
        search(text, pattern);
    }
}

