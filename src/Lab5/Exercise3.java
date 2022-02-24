package Lab5;

import java.util.Scanner;

class EmployeeException extends Exception
{
	public EmployeeException(String str)
	{
		super(str);
	}
}

public class Exercise3 {

	static void validateEmployee(int salary) throws EmployeeException
	{
		if(salary<3000)
			throw new EmployeeException("Salary is Invalid");
		else
			System.out.println("Salary is valid");
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try
		{
			int salary= sc.nextInt();
			validateEmployee(salary);
		}
		catch (EmployeeException exp)
		{
			System.out.println("Invalid Employee Exception");
			System.out.println("Exception Occured "+exp);
		}
		System.out.println("Outside the block");

	}

}
