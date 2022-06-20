package com.app.model;

import java.util.Scanner;

public class ProductOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(25*5);
		
		for(int i=0;i<=50;i++)
		{
			System.out.print("*" );			
		}
		System.out.println();
		System.out.print("Input first number: ");
		int num1=sc.nextInt();
		System.out.print("Input second number: ");
		int num2=sc.nextInt();
		int product=num1*num2;
		System.out.println("product of two numbers: "+product);
		
		for(int i=0;i<=50;i++)
		{
			System.out.print("*" );			
		}
		System.out.println( );
		
		ProductOfTwoNumbers pof=new ProductOfTwoNumbers();
		System.out.println("Product of two numbers"+pof.product(25, 5));
	}
	public int product(int a,int b)
	{
		return a*b;	
	}
}
