// Java Program for Method Overriding

class Parent {

	// Method of parent class
	void Print()
	{
		System.out.println("parent class");
	}
}

class subclass1 extends Parent {

	// Method
	void Print() 
	{
		System.out.println("subclass 1");
	}
}

class subclass2 extends Parent {

	// Method
	void Print()
	{
		System.out.println("subclass 2");
	}
}

class Rpoly {

	// Main driver method
	public static void main(String[] args)
	{
		Parent a;
		a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}
