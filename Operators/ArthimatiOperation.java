package Operators;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * Arithmatic Operator program
 */

public class ArthimatiOperation 
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
		
		
		
		sc.close();
	}

}
