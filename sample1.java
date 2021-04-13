package sample;

import java.util.Scanner;

public class sample1 {
	public static int square(int a)
	{
		int d = a * a * a;
		return d;
	}
	public static void main(String[] args)
	{
		//int a = 10;
		//int b= 30;
		//int result = addition(a,b);
		//System.out.println(result);
		int a = 10;
		double result = Math.sqrt(a);
		System.out.println(result);
		int squ = square(a);
		System.out.println("Square Root:"+squ);
	}
}
