package Operators;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Increment & Decrement Operator
 */

public class IncermentDecrement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//	System.out.print("Input first number: ");
		int i = 10;
	//	System.out.print("Input second number: ");
		int j = 20;
		
		System.out.println("preIncrement");
		int x=++i;
		System.out.println(x);
		System.out.println("post increment");
		int y=i++;
		System.out.println(y);
		System.out.println(i);
		
		System.out.println("pre decrement");
		int a=--j;
		System.out.println(a);
		System.out.println("Post Decrement");
		int b=j++;
		System.out.println(b);
		System.out.println(j);
		sc.close();
		
	}

}
