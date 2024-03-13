package PatternProgramming;
class Employee
{
	String name;
	int emp_id;
	String dept;
	char gender;
	double salary;

	public void display()
	{
		System.out.println("Name is :"+name);
		System.out.println("Employee id is :"+emp_id);
		System.out.println("Department is :"+dept);
		System.out.println("Gender is :"+gender);
		System.out.println("Salary is :"+salary);
	}

}



class EmployeeDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner xyz = new java.util.Scanner(System.in);


		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();


		//1st emp details
		System.out.println("===========");
		System.out.println("Enter the 1st emp details");
		System.out.println("===========\n");

		System.out.println("Enter the the name");
		e1.name = xyz.next();
		System.out.println("Enter the emp id");
		e1.emp_id = xyz.nextInt();
		System.out.println("Enter emp salary");
		e1.salary = xyz.nextDouble();
		System.out.println("Enter the dept");
		e1.dept = xyz.next();
		System.out.println("Enter the gender");
		e1.gender = xyz.next().charAt(0);
		
		//2nd emp details
		System.out.println("===========");
		System.out.println("Enter the 2st emp details");
		System.out.println("===========\n");
		
		System.out.println("Enter the the name");
		e2.name = xyz.next();
		System.out.println("Enter the emp id");
		e2.emp_id = xyz.nextInt();
		System.out.println("Enter emp salary");
		e2.salary = xyz.nextDouble();
		System.out.println("Enter the dept");
		e2.dept = xyz.next();
		System.out.println("Enter the gender");
		e2.gender = xyz.next().charAt(0);


		//3rd emp details
		System.out.println("===========");
		System.out.println("Enter the 3rd emp details");
		System.out.println("===========\n");
		
		System.out.println("Enter the the name");
		e3.name = xyz.next();
		System.out.println("Enter the emp id");
		e3.emp_id = xyz.nextInt();
		System.out.println("Enter emp salary");
		e3.salary = xyz.nextDouble();
		System.out.println("Enter the dept");
		e3.dept = xyz.next();
		System.out.println("Enter the gender");
		e3.gender = xyz.next().charAt(0);

		System.out.println("------------------------");
		System.out.println("1st emp details");
		e1.display();

		System.out.println("=================");
		System.out.println();
		System.out.println("2nd emp details");
		e2.display();

		System.out.println("=================");
		System.out.println();
		System.out.println("3rd emp details");
		e3.display();


		System.out.println("Weather u want to change dept???");
		System.out.println("Enter Y or N");
		String choice = xyz.next();

		if(choice.equals("Y"))
		{
			System.out.println("Employee1");
			System.out.println("Employee2");
			System.out.println("Employee3");
			int ch = xyz.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter new dept");
					String new_dept = xyz.next();
					e1.dept = new_dept;
				}break;

				case 2:
				{
					System.out.println("Enter new dept");
					String new_dept = xyz.next();
					e2.dept = new_dept;
				}break;

				case 3:
				{
					System.out.println("Enter new dept");
					String new_dept = xyz.next();
					e3.dept = new_dept;
				}break;

				default:
				{
					System.out.println("Invalid input sorry for inconvenience");
				}
			}

			System.out.println("------------------------");
			System.out.println("1st emp details");
			e1.display();

			System.out.println("=================");
			System.out.println();
			System.out.println("2nd emp details");
			e2.display();

			System.out.println("=================");
			System.out.println();
			System.out.println("3rd emp details");
			e3.display();
		}
		else
		{
			System.out.println("Thank you!! visit once again.....");
		}
	}
}