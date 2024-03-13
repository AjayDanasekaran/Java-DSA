package com.inter;

interface Shape
{
	double getArea();
	double getPerimeter();
}

class Circle implements Shape
{
	int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	
	@Override
	public double getPerimeter() 
	{
		return 2*3.14*radius;
	}
}

class Rectangle implements Shape
{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double getArea() 
	{
		return length*breadth;
		
	}
	
	@Override
	public double getPerimeter() 
	{
		return 2*(length+breadth);
	}
}

public class ShapeMain 
{

	public static void main(String[] args) 
	{
		Circle c = new Circle(4);
		Rectangle r = new Rectangle(3, 4);
		
		System.out.println("\t\tDetails of circle");
		System.out.println("\t -----------------------------------");
		
		System.out.printf("\t| %-15s | %-15s |\n","Area is",c.getArea());
		System.out.printf("\t| %-15s | %-15s |\n","Perimeter is",c.getPerimeter());
		System.out.println("\t -----------------------------------");
		
		System.out.println();
		
		System.out.println("\t\tDetails of Rectangle");
		System.out.println("\t -----------------------------------");
		
		System.out.printf("\t| %-15s | %-15s |\n","Area is",r.getArea());
		System.out.printf("\t| %-15s | %-15s |\n","Perimeter is",r.getPerimeter());
		System.out.println("\t -----------------------------------");

	}

}
