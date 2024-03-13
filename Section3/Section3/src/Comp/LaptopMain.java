package Comp;

import java.util.Arrays;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop lt1 = new Laptop(254,"Dell",8,"15");
		Laptop lt2 = new Laptop(786,"HP",4,"13");
		Laptop lt3 = new Laptop(596,"MacBook",12,"19");
		Laptop lf[] = {lt1,lt2,lt3};
		for(Laptop ll: lf) {
			System.out.println(ll);
		}
//		Arrays.sort(lf);
//		Arrays.sort(lf, new Laptop());
		System.out.println();
		for(Laptop ll: lf) {
			System.out.println(ll);
		}
	}
}
