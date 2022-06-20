package com.app.model;

import java.util.Scanner;

//Write a Java program to divide two numbers and print on the screen

public class DivideOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(50/3   );
		System.out.print("Enter the First number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the Secong number :");
		int num2=sc.nextInt();
		int div=num1/num2;
		System.out.println("Division  of two number "+div);
		
	}

}
