package DSA;
//Generics in Java allow you to create classes, interfaces, and methods that 
//can work with different data types while providing compile-time type safety.
//Generics are particularly useful for creating reusable and type-safe code.
//
//Wildcards, denoted by ?, are used in conjunction with generics to create 
//more flexible generic classes and methods that can accept different types 
//while still ensuring type safety.
public class GenericWildcards<p> {
	private p value;
	
	public GenericWildcards(p value) {
		this.value=value;
	}
	
	public p getValue() {
		return value;
	}
	public static void main(String[] args) {
		
//		Create a Box for Integer:
		GenericWildcards<Integer> integerBox = new GenericWildcards<Integer>(42);
		int intValue = integerBox.getValue();
		System.out.println("Integer Value: " + intValue);
		
//		Create a Box for String:
		GenericWildcards<String> stringBox = new GenericWildcards<String>("Hello, World!");
		String stringValue = stringBox.getValue();
		System.out.println("String Value: " + stringValue);
		
//		Create a Box for Double:
		GenericWildcards<Double> doubleBox = new GenericWildcards<Double>(3.14);
		double doubleValue = doubleBox.getValue();
		System.out.println("Double Value: " + doubleValue);
		
		



	}
}
