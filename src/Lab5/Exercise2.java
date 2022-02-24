package Lab5;

import java.util.Scanner;

class InvalidName extends Exception
{
	public InvalidName(String str)
	{
		super(str);
	}
}

public class Exercise2 {
	static void validateName(String name) throws InvalidName
	{
		int x=0;
		String[] Name = name.split(" ");
		for(String a : Name) {
			if(a!=null)
				x++;
			
			if(x==1)
				System.out.println("Name is valid");
			else
			{
				throw new InvalidName("Name is Invalid");
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try
		{
			String name= sc.nextLine();
			validateName(name);
		}
		catch (InvalidName exp)
		{
			System.out.println("Invalid Name Exception");
			System.out.println("Exception Occured "+exp);
		}
		System.out.println("Outside the block");

	}

}
