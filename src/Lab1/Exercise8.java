package Lab1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		if(checkNumber(num))
			System.out.println("Power of 2");
		else
			System.out.println("Not a power of 2");
		
	}
	public static boolean checkNumber(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		
		return true;
		}

}
