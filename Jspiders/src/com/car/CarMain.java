package com.car;

public class CarMain {
	public static void main(String[] args) {
		Car c = Factory.getCar();
		Driver d = new Driver();
		d.driver(c);
	}
}