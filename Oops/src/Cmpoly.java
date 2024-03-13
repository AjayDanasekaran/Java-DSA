// Java Program for Method overloading
// By using Different Types of Arguments
class Math {

	// Method with 2 integer parameters
	static int Multiply(int a, int b)
	{
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{
		return a * b;
	}
}

class Cmpoly {
	public static void main(String[] args)
	{
		System.out.println(Math.Multiply(2, 4));
		System.out.println(Math.Multiply(5.5, 6.3));
	}
}
