package com.netflix;

abstract class Verify{
	abstract void verify();
}

abstract class Verification extends Verify{

	@Override
	public void verify() {
		verification();
	}
	public static void verification() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean b= true;
		long acc = sc.nextLong(); 
		if(b) {
			if(acc==Account.getAcc_no()) {
				System.out.println("Welcome to Netflix"+Account.getAcc_name());
			}
			else {
				System.out.println("Account does not exist");
				b = false;
			}
		}
		else {
			System.out.println("Do you wish to reset password?");
			String decision = sc.next().toLowerCase();
			if(decision == "yes") {
				System.out.println("Enter your phone number to change password?");
				if(sc.nextLong() == Account.getPhone_no()) {
					System.out.println("What was your Pet Name?");
					if(sc.next() == Account.getPet_name()) {
						Account.setPassword(sc.next());
					}
				}
			}
			else {
				System.out.println("Find a different verification method");
			}
		}
		
	}
	
}
