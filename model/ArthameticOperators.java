package com.app.model;

import java.util.Scanner;

public class ArthameticOperators 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(125+24);
		System.out.println(125-24);
		System.out.println(125*24);
		System.out.println(125/24);
		System.out.println(125%24);
		//System.out.println(125+24);
		
		for(int i=0;i<=50;i++)
		{
			System.out.print("*" );			
		}
		System.out.println( );
		
		System.out.print("Input first number: ");
		int num1=sc.nextInt();
		System.out.print("Input second number: ");
		int num2=sc.nextInt();
		System.out.println(num1 +"+"+num2 +"="+ (num1+num2));
		System.out.println(num1 +"-"+num2 +"="+ (num1-num2));
		System.out.println(num1 +"*"+num2 +"="+ (num1*num2));
		System.out.println(num1 +"/"+num2 +"="+ (num1/num2));
		System.out.println(num1 +"%"+num2 +"="+ (num1%num2));
		
		
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		double result=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(result);
	}

}
