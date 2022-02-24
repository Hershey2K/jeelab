package Lab1;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String args[])
	{
		int num;
		boolean bool;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		bool = check(num);
		if(bool==true)
			System.out.println(num+"is an increasing number");
		else
			System.out.println(num+"is not an increasing number");
		
	}
	
	public static boolean check(int x)
	{
		int temp;
		while(x>9)
		{
			temp = x/10;
		}
		return true;
	}

}
