package Lab1;
import java.util.*;
import java.io.*;
public class Exercise3 {
	public static void main(String args[])
	{
		int a1,a2,n,x;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		a1=1;
		a2=1;
		System.out.println(a1);
		System.out.println(a2);
		for(int i=0;i<n;i++)
		{
			x=a1+a2;
			System.out.println(x);
			a1=a2;
			a2=x;
		}
	}
}
