package Lab1;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[])
	{
		int n;
		boolean b=true;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(checkPrime(i))
				System.out.println(i);
		}
		
	}
	
	public static boolean checkPrime(int n)
	{
		int i,m=0,flag=0;      
		m=n/2;      
		if(n==0||n==1)
			{  
				return false;      
			}
		else
		  	{  
			for(i=2;i<=m;i++)
				{      
				if(n%i==0)
					{      
						return false;      
					}      
				}      
			if(flag==0)  return true; 
		  	} 
		return true;
	}
}
