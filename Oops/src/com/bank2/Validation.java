package com.bank2;

public class Validation {
    
    public static boolean validateUPI(String enteredUPI) {
    	Account a = new Account();
    	String actualUPI = a.getUpiPin();
            if (enteredUPI.length() == 6 && enteredUPI.equals(actualUPI)) {
                System.out.println("UPI PIN is correct.");
                return true;
            } 
            else {
                System.out.println("UPI PIN is incorrect");
                return false;
        }
    }
}
