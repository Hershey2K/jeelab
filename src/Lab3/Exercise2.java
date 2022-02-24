package Lab3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(sc.nextLine());
		String str1=str.toString();
		str.append("|").append(getImage(str1));
		System.out.println(str);		
	}
	
	public static String getImage(String str)
	{
		StringBuilder strz = new StringBuilder();
		strz.append(str);
		strz.reverse();
		
		return strz.toString();
	}
}
