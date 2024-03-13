package com.bank;

abstract public class Bank 
{
	private double balance;
	Account acc = new Account();
	
	Bank(long acc)
	{
		this.acc.acc_no = acc;
	}
	
	

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	abstract public void withdraw(double amount);
	
	abstract public void deposit(double amount);
	
	abstract public void displayDetails();
	
	
	
}
