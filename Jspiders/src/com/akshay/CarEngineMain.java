//Composition
package com.akshay;

public class CarEngineMain {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.carName);
		System.out.println(c.e.model);//
		System.out.println(c.e.eo.oil);
	}

}
class Engine{
	int model = 12345;
	EngineOil eo = new EngineOil();
}
class Car{
	String carName = "Ford";
	Engine e = new Engine();
	
}
class EngineOil{
	String oil = "Shell";
}
