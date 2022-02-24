package Lab3;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String result = modifyNumber(num);
		System.out.println(result);
	}
	
	public static String modifyNumber(int n)
	{
		String str = String.valueOf(n);
		StringBuffer result = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			int a1=(int)str.charAt(i);
			int a2;
			if(i==str.length()-1)
				a2=a1;
			else
				a2=(int)str.charAt(i+1);
			
			if(a1>=a2)
				result.append(a1-a2);
			else
				result.append(a2-a1);
		}
		
		return result.toString();
		
	}

}
