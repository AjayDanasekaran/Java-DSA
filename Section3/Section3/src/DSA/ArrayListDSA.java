package DSA;
import java.util.ArrayList;

//ArrayList in Java
//An ArrayList in Java is a dynamic array that allows you to store 
//and manipulate a variable-sized collection of elements.
//Unlike traditional arrays, ArrayLists can grow or shrink in size as needed, 
//making them very versatile for managing lists of data.

//1.Before using ArrayList, you need to import it.
//2. Creating an ArrayList

public class ArrayListDSA {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		String firstPerson = names.get(0); // "Alice"
		String secondPerson = names.get(1); // "Bob"
		names.set(1, "Bobby"); // Change "Bob" to "Bobby"
		names.remove(0); // Removes the first element ("Alice")
		int size = names.size(); // Returns the size of the ArrayList
		
		for (String name : names) {
		    System.out.println(name);
		}

	}
}
