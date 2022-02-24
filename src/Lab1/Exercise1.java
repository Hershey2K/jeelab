package Lab1;
import java.util.*;
import java.io.*;

public class Exercise1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = cube(num);
		System.out.println(sum);
	}
	
	public static int cube(int x)
	{
		int number = x;
		int sum = 0;
		while (number > 0) {
		    int digit = number % 10;
		    sum += digit * digit * digit;
		    number /= 10;
		}
		return sum;
	}

}
