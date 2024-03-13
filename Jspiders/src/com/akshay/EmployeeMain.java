//Aggregation
package com.akshay;
import java.util.Scanner;

class Company{
	Employee e;
	
	public void addEmployee(Employee e) {
		if(this.e==null) {
			this.e = e;
		}
		else {
		System.out.println("Employee already exists");
		}
	}
	public void removeEmployee() {
		if(this.e!=null) {
			this.e = null;
			System.out.println("Employee deleted");
			}
		else {
			System.out.println("No Employee exists");
		}
	}
	public void displayDetails() {
		if(this.e!=null) {
			System.out.println("Employee Details below:");
			System.out.println("Employee Name : "+this.e.getEmpname());
			System.out.println("Employee Salary :"+this.e.getSal());
			System.out.println("Employee Dsignation :"+this.e.getDesignation());
			System.out.println("Employee Gender :"+this.e.getGender());
		}
		else {
			System.out.println("No Employee detail exists");
		}
	}
	
}
class Employee{
	private String empname = "Ajay";
	private double sal = 100000.0;
	private String designation = "SDE-1";
	private char gender = 'M';
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		boolean flag =false;
		while(!flag) {
			System.out.println("1.Add Employee"+"\n2.Remove Employee"+"\n3.Display Details"+"\n4.Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: {
					c.addEmployee(new Employee());
				}break;
				case 2:{ 
					c.removeEmployee();
				}break;
				case 3:{ 
					c.displayDetails();
				}break;
				case 4:{ 
					flag =true;
				}					
				break;
				default : System.out.println("Invalid Choice");
			}
			System.out.println();
		}
//		try {
//			System.out.println(m.s.sim_provider+" "+m.s.sim_no);
//		}
//		catch(NullPointerException n) {
//			System.out.println("Sim is empty");
//		}
//		finally {
//			System.out.println("Enter new sim");
//		}
//		
	}
}
