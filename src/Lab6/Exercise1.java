package Lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
	
	static Map<String,Integer> map = new HashMap<>();
	
	public static void sortMap()
	{
		HashMap<String,Integer> sorted = new HashMap<>();
		sorted.putAll(map);
		
		for(Map.Entry<String,Integer> entry : sorted.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	
	public static void main(String args[])
	{
		map.put("harshil", 30);
		map.put("mahi", 46);
		map.put("sapna", 21);
		map.put("rakesh", 25);
		
		
		sortMap();
	}

}
