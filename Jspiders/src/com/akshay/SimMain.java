//Aggregation
package com.akshay;
import java.util.Scanner;

class Mobile{
	Sim s;
	int sim_slot = 1;
	
	public void addSim(Sim s) {
		if(this.s==null) {
			this.s = s;
		}
		else {
		System.out.println("Sim Already exists");
		}
	}
	public void removeSim() {
		if(this.s!=null) {
			this.s = null;
			System.out.println("Sim removed");
			}
		else {
			System.out.println("No Sim exists");
		}
	}
	
}
class Sim{
	String sim_provider = "Jio";
	long sim_no = 935456333l;
//	String sim_provider;
//	long sim_no;
//	Sim(String sim_provider,long sim_no){
//		this.sim_provider=sim_provider;
//		this.sim_no=sim_no;
//	}
}

public class SimMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mobile m = new Mobile();
//		m.addSim(new Sim("Airtel",9345495727l));
//		System.out.println(m.s.sim_provider+" "+m.s.sim_no);
//		m.addSim(new Sim("Vi",6363366363l));
//		m.removeSim();
//		boolean flag =false;
		while(true) {
			System.out.println("1. Add Sim"+"\n2.Remove Sim"+"\n3.Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: {
					m.addSim(new Sim());
				}break;
				case 2:{ 
					m.removeSim();
				}break;
				case 3:{ 
					System.exit(0);
				}
//					flag =true;
//				}break;
				default: System.out.println("Invalid Choice");
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
