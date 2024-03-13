package com.browser;

public class BrowserMain {
	public static void main(String[] args) {
		Browser b;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Your Choice"+"\n1: Chrome"+"\n2: Firefox"+"\n3: Brave");
		int choice = sc.nextInt();
		if(choice==1) {
			b = BrowserFactory.getBrowser(choice);
			b.start();
		}
		else if(choice==2) {
			b = BrowserFactory.getBrowser(choice);
			b.start();
		}
		else if(choice==3) {
			b = BrowserFactory.getBrowser(choice);
			b.start();
		}
		else {
			System.out.println("Invalid choice");
		}
		sc.close();
	}
}
