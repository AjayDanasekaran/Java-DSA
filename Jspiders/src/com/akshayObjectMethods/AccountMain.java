package com.akshayObjectMethods;

class Account{
	private int acc_no;
	private long ifsc;
	
	public Account() {
	}
	
	public Account(int acc_no, long ifsc) {
		super();
		this.acc_no = acc_no;
		this.ifsc = ifsc;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public long getIfsc() {
		return ifsc;
	}

	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}
	
	@Override
	public String toString() {
		String s = "Acc_no : "+acc_no+"\nIFSC : "+ifsc;
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		Account a = (Account)o;
		return this.acc_no==a.acc_no && this.ifsc==a.ifsc; 
	}
	
	@Override
	public int hashCode() {
		int hc = acc_no + (int)ifsc ;
		return hc;
	}
	
}
class SavingsAccount extends Account{
	private int balance;

	public SavingsAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		String s = "Balance : "+balance;
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		SavingsAccount s = (SavingsAccount)o;
		return this.balance==s.balance; 
	}
	
	@Override
	public int hashCode() {
		int hc = balance;
		return hc;
	}
}
class LoanAccount extends Account{
	private int loan_amount;

	public LoanAccount(int loan_amount) {
		this.loan_amount = loan_amount;
	}

	public int getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	
	@Override
	public String toString() {
		String s = "Loan_amount : "+loan_amount;
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		LoanAccount l = (LoanAccount)o;
		return this.loan_amount==l.loan_amount; 
	}
	
	@Override
	public int hashCode() {
		int hc = loan_amount;
		return hc;
	}
}
public class AccountMain {
	public static void main(String[] args) {
		Account a1 = new Account(1,123456);
		Account a2 = new Account(1,123456);
		SavingsAccount s1 = new SavingsAccount(10000);
		SavingsAccount s2 = new SavingsAccount(10000);
		LoanAccount l1 = new LoanAccount(10000);
		LoanAccount l2 = new LoanAccount(10000);
		
//		System.out.println(a==s);
//		System.out.println(a==l);
//		System.out.println(a.equals(s));
//		System.out.println(a.hashCode());
//		System.out.println(s.hashCode());
//		System.out.println(l.hashCode());
		System.out.println(a1.hashCode()==a2.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(l1.hashCode()==l2.hashCode());
		System.out.println(l1.equals(l2));
		
	}
}
