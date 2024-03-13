//Composition
package com.akshay;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		System.out.println(l.brand);
		System.out.println(l.price);
		System.out.println(l.m.ram);
		System.out.println(l.m.processor);//
		System.out.println(l.b.model);
	}

}
class Laptop{
	String brand = "Asus";
	int price = 30000;
	Motherboard m = new Motherboard();
	Battery b = new Battery();
}
class Motherboard{
	int ram = 8;
	String processor = "AMD RADEON";
}
class Battery{
	String model = "Intel";
	
}

