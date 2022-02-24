package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=getSecondSmallest(arr);
		System.out.println(result);
	}
	
	public static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}

}
