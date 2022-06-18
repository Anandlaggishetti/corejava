package com.DifferentWaysOfSameProgram;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Factorial program
 */
public class FactorialProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=5,fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+"is "+fact);
		
	}

}
