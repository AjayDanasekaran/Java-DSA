package com.bank;

import java.util.Scanner;

public class BankMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		SBI sbi = new SBI(11784569234l);
		HDFC hdfc = new HDFC(357347346733l);
		boolean flag = true;
		
		while(flag)
		{
			System.out.println();
			System.out.println("=========");
			System.out.println("1.SBI");
			System.out.println("2.HDFC");
			System.out.println("3.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("1.CheckBalance");
					System.out.println("2.Withdraw");
					System.out.println("3.Deposit");
					System.out.println("4.Display");
					int ch = sc.nextInt();
					if(ch==1)
					{
						System.out.println(sbi.getBalance());
					}
					else if(ch==2)
					{
						System.out.println("How much amount you want to withdraw????");
						double amount = sc.nextDouble();
						sbi.withdraw(amount);
					}
					else if(ch==3)
					{
						System.out.println("How much amount you want to deposit????");
						double amount = sc.nextDouble();
						sbi.deposit(amount);
					}
					else if(ch==4)
					{
						sbi.displayDetails();
					}
					else
					{
						System.out.println("Invalid option");
					}
				}break;
				
				case 2:
				{
					System.out.println("1.CheckBalance");
					System.out.println("2.Withdraw");
					System.out.println("3.Deposit");
					System.out.println("4.Display");
					int ch = sc.nextInt();
					if(ch==1)
					{
						System.out.println(hdfc.getBalance());
					}
					else if(ch==2)
					{
						System.out.println("How much amount you want to withdraw????");
						double amount = sc.nextDouble();
						hdfc.withdraw(amount);
					}
					else if(ch==3)
					{
						System.out.println("How much amount you want to deposit????");
						double amount = sc.nextDouble();
						hdfc.deposit(amount);
					}
					else if(ch==4)
					{
						hdfc.displayDetails();
					}
					else
					{
						System.out.println("Invalid option");
					}
				}break;
				
				case 3:
				{
					flag = false;
				}break;
				
				default:
				{
					System.out.println("Invalid option");
				}
				
				
			}
			
		}
		
		System.out.println("Thank you for your patience and VISIT ONCE AGAIN!!!!!");
	}
}





