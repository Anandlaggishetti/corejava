package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077
 *  FactorialUsingWhileLoop program
 */

public class FactorialUsingWhileLoop 
{
	public static void main(String[] args) {
		long n,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextLong();
		
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial = "+fact);
		
	}

}
