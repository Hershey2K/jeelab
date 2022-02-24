package Lab1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String args[])
	{
		int num, result;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		result=diff(num);
		System.out.println(result);
	}
	
	public static int diff(int x)
	{
		int sum1=0,sum2=0;
		
		for(int i=1;i<=x;i++)
		{
			sum1+=x;
			sum2+=(x*x);
		}
		sum1*=sum1;
		
		return sum1-sum2;
	}

}
