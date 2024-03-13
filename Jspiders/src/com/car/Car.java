package com.car;

public interface Car {
	void start();
	void move();
	void stop();
}
class Ford implements Car{
	@Override
	public void start() {
		System.out.println("Ford Started");
	}
	@Override
	public void move() {
		System.out.println("Ford Moved");
	}
	@Override
	public void stop() {
		System.out.println("Ford Stopped");
	}
}
class Porsche implements Car{
	@Override
	public void start() {
		System.out.println("Porsche Started");
	}
	@Override
	public void move() {
		System.out.println("Porsche Moved");
	}
	@Override
	public void stop() {
		System.out.println("Porsche Stopped");
	}
}
class Lambo implements Car{
	@Override
	public void start() {
		System.out.println("Lambo Started");
	}
	@Override
	public void move() {
		System.out.println("Lambo Moved");
	}
	@Override
	public void stop() {
		System.out.println("Lambo Stopped");
	}
}