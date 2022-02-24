package Lab1;
import java.util.Scanner;
public class Exercise5 {
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		sum=calculateSum(n);		
		System.out.println(sum);
	}
	
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}
}
