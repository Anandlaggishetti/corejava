package com.DifferentWaysOfSameProgram;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Sum Of Digits program	
 */
public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		long sum=0,digit = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		long num=sc.nextLong();
		for(sum=0;num!=0;num/=10)
		{
//		while(num!=0)
//		{
//			digit=num%10;
//			sum=sum+digit;
//			num/=10;
			sum+=num%10;
		}
		System.out.println(sum);
		
	}

}
