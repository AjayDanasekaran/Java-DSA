package com.bank2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        boolean exitFlag = false;

        System.out.println("Welcome to Gpay " + a.getName().toUpperCase());

        while (!exitFlag) {
            System.out.println();
            System.out.println("Choose an option:");
            System.out.println("1. Display balance");
            System.out.println("2. Transfer money");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    displayBankBalance(sc);
                    break;
                case 2:
                    transferMoney(sc);
                    break;
                case 3:
                    System.out.println("Thank you for using Gpay");
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        System.out.println("Exiting Gpay application.");
    }

    private static void displayBankBalance(Scanner sc) {
        System.out.println("Which Bank Balance?" + "\n1. SBI" + "\n2. ICICI" + "\n3. HDFC");
        int choice1 = sc.nextInt();
        Bank obj = null;

        switch (choice1) {
            case 1:
            	System.out.println("Enter your UPI to utilize Gpay");
                String upi = sc.next();
                
                if (!Validation.validateUPI(upi)) {
                	sc.close();
                    return;
                }
                obj = FactoryBank.getBank("SBIBank");
                break;
            case 2:
            	System.out.println("Enter your UPI to utilize Gpay");
                String upi1 = sc.next();
                
                if (!Validation.validateUPI(upi1)) {
                	sc.close();
                    return;
                }
                obj = FactoryBank.getBank("ICICIBank");
                break;
            case 3:
            	System.out.println("Enter your UPI to utilize Gpay");
                String upi2 = sc.next();
                
                if (!Validation.validateUPI(upi2)) {
                	sc.close();
                    return;
                }
                obj = FactoryBank.getBank("HDFCBank");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Bank Balance: " + obj.balance());
    }

    private static void transferMoney(Scanner sc) {
        System.out.println("Enter source bank name (SBI, HDFC, or ICICI)");
        String currentBank = sc.next()+"Bank";
        System.out.println("Enter Destination bank name (SBI, HDFC, or ICICI)");
        String destinationB = sc.next()+"Bank";
        System.out.println("How much do you wish to transfer?");
        int transferAmount = sc.nextInt();
        System.out.println("Enter your UPI to utilize Gpay");
        String upi = sc.next();
        
        if (!Validation.validateUPI(upi)) {
        	sc.close();
            return;
        }
        
        Bank sourceBank = FactoryBank.getBank(currentBank);
        Bank destinationBank = FactoryBank.getBank(destinationB);
        
        if (sourceBank != null && destinationBank != null) {
            sourceBank.transfer(destinationB, transferAmount);
            System.out.println("Source Bank " + currentBank + " Balance: " + sourceBank.balance());
            System.out.println("Destination Bank " + destinationB + " Balance: " + destinationBank.balance());
        } else {
            System.out.println("Invalid source or destination bank.");
        }
    }
}
