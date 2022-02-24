package Lab3;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String xo = sc.next();
		boolean bool = checkString(xo);
		System.out.println(bool);
	}
	
	public static boolean checkString(String xo)
	{
		for(int i=0;i<xo.length();i++)
		{
			int x1=(int)xo.charAt(i);
			int x2;
			if(i==xo.length()-1)
				x2=x1;
			else
				x2 =(int) xo.charAt(i+1);
			
			if(x1>x2)
				return false;
		}
		return true;
	}

}
