package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * PalindromeNumber
 */

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,temp,rem;
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Given number is palindrome:"+sum);
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
		sc.close();
	}
}
