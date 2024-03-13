package com.inter;

interface Employee
{
	String getName();
	double getSalary();
	String getRole();
}

class Manager implements Employee
{
	private String name;
	private double base_pay;
	
	
	
	
	public Manager(String name, double base_pay) 
	{
		super();
		this.name = name;
		this.base_pay = base_pay;
	}


	public double getBase_pay() 
	{
		return base_pay;
	}


	public void setBase_pay(double base_pay) 
	{
		this.base_pay = base_pay;
	}


	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getNamee()
	{
		return name;
	}


	@Override
	public String getName() 
	{
		return getNamee();
	}
	
	@Override
	public double getSalary()
	{
		return base_pay * 1.1;
	}
	
	@Override
	public String getRole()
	{
		return "Manager";
	}
}


class Developer implements Employee
{
	private String name;
	
	private double hourly_rate;
	private int hours_worked;
	
	
	
	public Developer(String name, double hourly_rate, int hours_worked) 
	{
		super();
		this.name = name;
		this.hourly_rate = hourly_rate;
		this.hours_worked = hours_worked;
	}

	public double getHourly_rate() {
		return hourly_rate;
	}

	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getNamee()
	{
		return name;
	}
	
	@Override
	public String getName()
	{
		return getNamee();
	}
	
	@Override
	public double getSalary()
	{
		return (getHourly_rate()*getHours_worked());
	}
	
	@Override
	public String getRole()
	{
		return "Developer";
	}

}

public class EmployeeMain 
{

	public static void main(String[] args)
	{
		Manager e = new Manager("Manoj",80000d);
		Developer d = new Developer("Sai",150,270);
		
		System.out.println("\t\tDetails of Manager");
		System.out.println("\t -----------------------------------");
		
		System.out.printf("\t| %-15s | %-15s |\n","Name is ",e.getName());
		System.out.printf("\t| %-15s | %-15s |\n","Salary is ",e.getSalary());
		System.out.println("\t -----------------------------------");
		
		System.out.println();
		
		System.out.println("\t\tDetails of Developer");
		System.out.println("\t -----------------------------------");
		
		System.out.printf("\t| %-15s | %-15s |\n","Name is",d.getName());
		System.out.printf("\t| %-15s | %-15s |\n","Salary is",d.getSalary());
		System.out.println("\t -----------------------------------");
	}

}
