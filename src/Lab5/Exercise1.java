package Lab5;

import java.util.Scanner;

import Lab3.InvalidAgeException;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}

public class Exercise1 {
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<15)
			throw new InvalidAgeException("Invalid Age");
		else
			System.out.println("Age is valid!");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int age = sc.nextInt();
			validateAge(age);
		}
		catch(InvalidAgeException exp)
		{
			System.out.println("Invalid Age Exception");
			System.out.println("Exception Occured "+exp);
		}
		System.out.println("Outside the Block");
		
	}

}
