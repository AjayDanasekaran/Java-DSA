// Java program for Method Overloading
// by Using Different Numbers of Arguments
class Mul {

	// Method 1
	// Multiplication of 2 numbers
	static int Multiply(int a, int b)
	{
		return a * b;
	}

	// Method 2
	// // Multiplication of 3 numbers
	static int Multiply(int a, int b, int c)
	{
		return a * b * c;
	}
}


class Cmpoly1 {
	public static void main(String[] args)
	{
		System.out.println(Mul.Multiply(2, 4));
		System.out.println(Mul.Multiply(2, 7, 3));
	}
}
