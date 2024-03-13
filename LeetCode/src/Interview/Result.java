package Interview;

import java.util.HashMap;

class Result {

    private static final HashMap<String, String> userCredentials = new HashMap<>();

    static {
        // Initializing user credentials
        userCredentials.put("user1", "pass1");
        userCredentials.put("user2", "pass2");
        userCredentials.put("user3", "pass3");
        userCredentials.put("user4", "pass4");
    }

    public static void login(int noOfDigitsForThePalindrome, String userId, String password) {
        // Check for invalid input
        if (noOfDigitsForThePalindrome <= 0 || userId.isEmpty() || password.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        // Check if the user is valid
        if (userCredentials.containsKey(userId) && userCredentials.get(userId).equals(password)) {
            // Generate the palindrome number
            String palindromeNumber = generatePalindromeNumber(noOfDigitsForThePalindrome);

            // Display the welcome message
            System.out.println("Welcome " + userId + " and the generated token is: token-" + palindromeNumber + ".");
        } else {
            System.out.println("User-id or password is invalid. Please try again.");
        }
    }

    private static String generatePalindromeNumber(int numOfDigits) {
        // Generate the first N-digit palindrome number
        StringBuilder palindromeNumber = new StringBuilder("1");
        for (int i = 1; i < numOfDigits - 1; i++) {
            palindromeNumber.append("0");
        }
        palindromeNumber.append("1");

        return palindromeNumber.toString();
    }

    public static void main(String[] args) {
        // Sample input for testing
        login(2, "user1", "pass1");
    }
}
