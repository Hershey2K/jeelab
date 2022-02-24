package Lab3;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc =new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(sc.nextLine());
				
		while(str.hasMoreTokens())
		{
			int i=Integer.parseInt(str.nextToken(" "));
			System.out.println(i);
			sum+=i;
		}
		
		System.out.println(sum);

	}

}
