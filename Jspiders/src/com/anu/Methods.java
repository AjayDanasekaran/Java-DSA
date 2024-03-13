package com.anu;

public class Methods {
	public static void main(String[] args) {
	Methods method = new Methods(new Methods(5));
	}
	Methods(int i){
		System.out.println("Hello");
	}
	Methods(Methods Test){
		System.out.println("World");
	}
}
