package com.bank;

public class SBI extends Bank
{
	SBI(long acc)
	{
		super(acc);
	}
	@Override
	public void withdraw(double amount)
	{
		if(amount%1000==0 && amount>0 && getBalance()>=amount)
		{
			System.out.println(amount +"Amount withdrawn successfully!!");
			double updated_balance = getBalance()-amount;
			
			setBalance(updated_balance);
			
		}
		else if(amount<=0)
		{
			System.out.println("Invalid amount");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	@Override
	public void deposit(double amount)
	{
		if(amount>0 && amount%2000==0)
		{
			System.out.println(amount+" deposited successfully!!");
			double updated_balance = getBalance()+amount;
			setBalance(updated_balance);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Account number "+acc.acc_no);
		System.out.println("Account balance "+getBalance());
	}
	
}








