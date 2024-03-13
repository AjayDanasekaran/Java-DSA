package com.jspy;

import java.util.Comparator;

public class Employee implements Comparable,Comparator{//<Employee>{
	private int id;
	private String name;
	private double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee() {}
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
    public int compareTo(Object o) {
		Employee l1 = (Employee)o;
        return Integer.compare(this.id, l1.id);
    }
	
	@Override
	public int compare(Object o1,Object o2) {
		Employee l1 = (Employee)o1;
		Employee l2 = (Employee)o2;
		if(l1.id > l2.id) {
			return -1;
		}
		else if(l1.id == l2.id) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
