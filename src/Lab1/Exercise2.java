package Lab1;

import java.util.*;
import java.io.*;

public class Exercise2 {
	public static void main(String args[])
	{
	String input1;
	Scanner sc = new Scanner(System.in);
	input1=sc.next();
	if(input1.equals("red"))
		System.out.println("stop");
	else if(input1.equals("yellow"))
		System.out.println("wait");
	else if(input1.equals("green"))
		System.out.println("go");
	else
		System.out.println("Invalid Input");
}
}