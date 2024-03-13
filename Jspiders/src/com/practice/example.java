package com.practice;

abstract class example2 {
	abstract void name();
}
abstract class example1 extends example2 {
	@Override
	void name() {
		System.out.println("Hello");
	}
}
public class example{
	
}