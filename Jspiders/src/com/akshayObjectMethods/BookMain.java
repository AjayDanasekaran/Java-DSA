//hashcode method
package com.akshayObjectMethods;

class Book{
	int id;
	double price;
	String name;
	
	public Book(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		Book b = (Book)o;
		return this.id==b.id && this.price==b.price && this.name==b.name; 
	}
	
	@Override
	public int hashCode() {
		int hc = id + (int)price + name.hashCode();
		return hc;
	}
}
public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book(1,100,"ajay");
		Book b2 = new Book(1,100,"ajay");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode()==b2.hashCode());
	}

}
