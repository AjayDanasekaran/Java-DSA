package com.practice;

import com.inter.Employee;

interface Employee{
	String getNames();
	double getSalary();
	String getRole();
}

class Manager implements Employee{
	private String name;
	private double base_pay;
	
	public Manager(String name,double pay){
		this.name = name;
		this.base_pay = pay;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBase_pay() {
		return base_pay;
	}

	public void setBase_pay(double base_pay) {
		this.base_pay = base_pay;
	}
	
	@Override
	public String getNames() {
		return getName();
	}

	@Override
	public double getSalary() {
		return base_pay * 1.1;
	}

	@Override
	public String getRole() {
		return "Manager";
	}
	
}

class Developer implements Employee{
	private String name;
	private double hourly_rate;
	private int hours_worked;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String getNames() {
		return getName();
	}

	@Override
	public double getSalary() {
		return (getHourly_rate()*getHours_worked());
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class EmpMain {

}
