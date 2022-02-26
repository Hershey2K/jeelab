package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	
	public static Map<Integer, Integer> getSquares(int[] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i: arr)
		{
			map.put(i, i*i);
		}

		return map;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<>();
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		map=getSquares(arr);
		
		for(Map.Entry entry : map.entrySet())
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
	}

}

