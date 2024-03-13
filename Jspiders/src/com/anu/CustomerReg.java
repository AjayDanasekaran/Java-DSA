package com.anu;

public class CustomerReg {
	public static void main(String[] args) {
		AccountReg  customer1 = new AccountReg();
		customer1.setAccountName("Ajay");
		customer1.setPhonenumber(934549577);
		customer1.setPannumber("123Abc");
		customer1.setDob("13/2/1999");
		customer1.setGender('M');
		AccountReg  customer2 = new AccountReg();
		customer2.setAccountName("Ujwal");
		customer2.setPhonenumber(934549433);
		customer2.setPannumber("456Abc");
		customer2.setDob("14/3/2000");
		customer2.setGender('M');
		AccountReg  customer3 = new AccountReg();
		customer3.setAccountName("Dhanush");
		customer3.setPhonenumber(934549544);
		customer3.setPannumber("678Abc");
		customer3.setDob("15/4/2001");
		customer3.setGender('M');
		AccountReg  customer4 = new AccountReg();
		customer4.setAccountName("Guru");
		customer4.setPhonenumber(934549555);
		customer4.setPannumber("789Abc");
		customer4.setDob("16/5/2002");
		customer4.setGender('M');
		AccountReg  customer5 = new AccountReg();
		customer5.setAccountName("Rahul");
		customer5.setPhonenumber(934549566);
		customer5.setPannumber("456Abc");
		customer5.setDob("17/6/2003");
		customer5.setGender('M');
		
		//Printing
		System.out.println("Customer 1 Details");
		System.out.println(customer1.getAccountNumber());
		System.out.println(customer1.getAccountName());
		System.out.println(customer1.getPhonenumber());
		System.out.println(customer1.getPannumber());
		System.out.println(customer1.getDob());
		System.out.println(customer1.getGender());
		System.out.println("Customer 2 Details");
		System.out.println(customer2.getAccountNumber());
		System.out.println(customer2.getAccountName());
		System.out.println(customer2.getPhonenumber());
		System.out.println(customer2.getPannumber());
		System.out.println(customer2.getDob());
		System.out.println(customer2.getGender());
		System.out.println("Customer 3 Details");
		System.out.println(customer3.getAccountNumber());
		System.out.println(customer3.getAccountName());
		System.out.println(customer3.getPhonenumber());
		System.out.println(customer3.getPannumber());
		System.out.println(customer3.getDob());
		System.out.println(customer4.getGender());
		System.out.println("Customer 4 Details");
		System.out.println(customer4.getAccountNumber());
		System.out.println(customer4.getAccountName());
		System.out.println(customer4.getPhonenumber());
		System.out.println(customer4.getPannumber());
		System.out.println(customer4.getDob());
		System.out.println(customer4.getGender());
		System.out.println("Customer 5 Details");
		System.out.println(customer5.getAccountNumber());
		System.out.println(customer5.getAccountName());
		System.out.println(customer5.getPhonenumber());
		System.out.println(customer5.getPannumber());
		System.out.println(customer5.getDob());
		System.out.println(customer5.getGender());
		
	}
}
