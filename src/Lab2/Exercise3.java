package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sortArr[] = getSorted(arr);
		System.out.println(sortArr);
	}
	public static int[] getSorted(int arr[])
	{
		StringBuilder input1 = new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			input1.append(arr[i]);
		}
		input1.reverse();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(input1.toString());	
		}
		
		Arrays.sort(arr);
		return arr;
	}

}
