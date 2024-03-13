package com.bank3;

public class Validation {
    
    public static boolean validateUPI(String enteredUPI) {
    	Account a = new Account();
            if (a.getUpiPins().equals(enteredUPI)) {
                System.out.println("UPI PIN is correct.");
                return true;
            } 
            else {
                System.out.println("Invalid UPI PIN");
                return false;
        }
    }
}
