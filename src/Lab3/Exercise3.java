package Lab3;

import java.util.*;

public class Exercise3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder str1 = new StringBuilder();
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				str1.append(str.charAt(i));
			else
			{
				int x=(int)str.charAt(i);
				char f = (char)(x+1);
				str1.append(f);
			}
				
		}
		System.out.println(str1.toString());
	}

}
