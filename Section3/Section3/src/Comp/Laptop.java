package Comp;

import java.util.Comparator;

public class Laptop implements Comparable,Comparator{
	int laptop_id;
	String brand;
	int ram;
	String processor;
	
	Laptop(){
		
	}
	
	Laptop(int laptop_id,String brand,int ram,String processor){
		this.laptop_id= laptop_id;
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "[ Laptop_id = "+laptop_id+", brand = "+brand+", ram = "+ram+", processor = "+processor+"]";
	}

	@Override
	public int compareTo(Object o) {
		Laptop l = (Laptop)o;
		if(this.laptop_id < l.laptop_id) {
			return -1;
		}
		else if(this.laptop_id == l.laptop_id) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	@Override
	public int compare(Object o1,Object o2) {
		Laptop l1 = (Laptop)o1;
		Laptop l2 = (Laptop)o2;
		if(l1.laptop_id < l2.laptop_id) {
			return -1;
		}
		else if(l1.laptop_id == l2.laptop_id) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
