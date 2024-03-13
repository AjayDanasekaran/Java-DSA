package com.jspy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    static ArrayList<Employee> emp = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void saveEmp() {
        try {
            System.out.println("How many Employee Details do you want to enter (ID, Name, Sal)?");
            int numEmployees = scanner.nextInt();

            for (int i = 0; i < numEmployees; i++) {
                System.out.println("Enter details for Employee #" + (i + 1));
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Sal: ");
                double sal = scanner.nextDouble();

                emp.add(new Employee(id, name, sal));
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid details.");
            scanner.nextLine(); 
        }
    }

    public static void viewEmp(ArrayList<Employee> empList) {
        if (empList.isEmpty()) {
            System.out.println("No employee details available.");
        } else {
            System.out.println("Employee details:");
            for (Employee employee : empList) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
//        boolean isRunning = true;
//
//        do {
//            System.out.println("Enter Your Choice\n" +
//                    "1: Save New Employee detail\n" +
//                    "2: View Employee details\n" +
//                    "0: EXIT");
//
//            switch (scanner.nextInt()) {
//                case 0:
//                    isRunning = false;
//                    System.out.println("Exiting...");
//                    break;
//                case 1:
//                    saveEmp();
//                    break;
//                case 2:
//                    viewEmp(emp);
//                    break;
//                default:
//                    System.err.println("Invalid Choice");
//                    break;
//            }
//        } while (isRunning);
    	emp.add(new Employee(254,"Dell",8));
    	emp.add(new Employee(786,"HP",4));
    	emp.add(new Employee(596,"MacBook",12));
    	Collections.sort(emp);
//    	Collections.sort(emp, new Employee());
    	System.out.println(emp);
        scanner.close();
    }
}
