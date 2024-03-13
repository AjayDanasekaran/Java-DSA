package StringAlgo;

public class RabinKarp {
    private static final int PRIME = 101; // A prime number used for hashing
    private static final int BASE = 256; // The base for the hash function

    public static void search(String pattern, String text) {
        int patternLength = pattern.length();
        int textLength = text.length();
        int patternHash = hash(pattern, patternLength);
        int textHash = hash(text, patternLength);

        for (int i = 0; i <= textLength - patternLength; i++) {
            if (patternHash == textHash) {
                if (pattern.equals(text.substring(i, i + patternLength))) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            if (i < textLength - patternLength) {
                textHash = recalculateHash(text, i, i + patternLength, textHash);
            }
        }
    }

    private static int hash(String str, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash = (hash * BASE + str.charAt(i)) % PRIME;
        }
        return hash;
    }

    private static int recalculateHash(String str, int oldIndex, int newIndex, int oldHash) {
        int newHash = (oldHash - str.charAt(oldIndex) * (int) Math.pow(BASE, newIndex - oldIndex - 1)) % PRIME;
        newHash = (newHash * BASE + str.charAt(newIndex)) % PRIME;
        if (newHash < 0) {
            newHash += PRIME;
        }
        return newHash;
    }

    public static void main(String[] args) {
        String text = "AjayIsBetterthanajaybutAjayIsHimself";
        String pattern = "Ajay";
        search(pattern, text);
    }
}

