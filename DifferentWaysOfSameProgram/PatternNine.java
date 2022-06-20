package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

public class PatternNine 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		
		System.out.print("Enter the symbol what you want to print: ");
		String s1=sc.next();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==j || i+j==num+1) {
					System.out.print(s1);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
