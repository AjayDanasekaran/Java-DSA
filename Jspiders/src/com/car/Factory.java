package com.car;
public class Factory {
	public static Car getCar() {
		java.util.Scanner sc =new java.util.Scanner(System.in);
		String carName = sc.next();
		if(carName.equals("Ford")) {
			return new Ford();
		}
		else if(carName.equals("Porsche")) {
			return new Porsche();
		}
		else if(carName.equals("Lambo")) {
			return new Lambo();
		}
		else {
			return null;
		}
	}
}
