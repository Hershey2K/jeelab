package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise2 {
	
	public static Map<Character, Integer> countChars(char[] arr)
	{
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c: arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}

		return map;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Map<Character,Integer> map = new HashMap<>();
		String str = sc.next();
		char[] strArray = str.toCharArray();
		map=countChars(strArray);
		
		for(Map.Entry entry : map.entrySet())
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
	}

}
