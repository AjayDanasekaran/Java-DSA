package SearchingAlgo;

import java.util.HashMap;
import java.util.Map;

public class HashSearch {
	public static void main(String[] args) {
		Map<Integer,String> mp = Map.of(
				1,"One",
				2,"Two",
				3,"Three",
				4,"Four",
				5,"Five"
				);
		int keyToSearch = 4;
		if(mp.containsKey(keyToSearch)) {
			System.out.println("Key: "+keyToSearch+" Value: "+mp.get(keyToSearch));
		}
		else {
			System.out.println("Element not found");
		}
	}
}
