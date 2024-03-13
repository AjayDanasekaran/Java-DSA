//Aggregation
package com.akshay;

class Bus{
	Passenger p;
	public void addPassenger(Passenger p) {
		this.p = p;
	}
}
class Passenger{
	String name = "Ajay";
}


public class BusPassengerMain {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.addPassenger(new Passenger());
		System.out.println(b.p.name);
	}	
}
