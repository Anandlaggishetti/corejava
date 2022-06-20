package com.app.model;

import java.util.Scanner;

// Write a Java program to print the sum of two numbers.

public class SumOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(50+60);
		System.out.print("Enter the First number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the Secong number :");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of two number "+sum);
		
		
	}

}
