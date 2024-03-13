//toString method Object class
package com.akshayObjectMethods;

class Mobile{
	String Brand;
	int price;
	String color;
	int ram;
	
	public Mobile(String Brand,int price,String color,int ram) {
		this.Brand = Brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		String s = "Brand : "+Brand+"\nPrice : "+price+"\nColor : "+color+"\nRam   : "+ram+"";
		return s;
	}
	
}
public class MobileMain {
	public static void main(String[] args) {
		Mobile m = new Mobile("Iphone",45000,"Red",8);
		Mobile m1 = new Mobile("Samsung",50000,"Black",16);
		Mobile m2 = new Mobile("Nothing",90000,"White",16);
		System.out.println(m);
		System.out.println("---------------------------------");
		System.out.println(m1);
		System.out.println("---------------------------------");
		System.out.println(m2
				
				
				);
//		System.out.println(m.toString());
	}
}

