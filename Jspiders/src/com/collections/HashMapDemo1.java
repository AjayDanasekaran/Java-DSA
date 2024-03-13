package com.collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Ujwal");
		m.put(2, "Dhanush");
		m.put(3, "Guru");
		m.put(4,"Ajay");
		
		System.out.println(m.size());
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("Sahana"));	
		System.out.println(m.remove(1));
		System.out.println(m.get(2));
		System.out.println(m);
		System.out.println(m.put(1, "King"));
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		m.forEach((key,value)->{
			System.out.println("Key :"+key+" "+"Value :"+value);
		});
	}
}
