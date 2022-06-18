package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077 prime Number Program for a given range
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int min = sc.nextInt();
		System.out.println("Enter the second number");
		int max = sc.nextInt();
		int count, i, j;
		for (i = min; i <= max; i++) {
			count = 0;
			for (j = 1; j <= i ; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		
//		System.out.print("Enter any number: ");
//		int n=sc.nextInt();
//		primeCal(n);
//		sc.close();
//	}
//	private static void primeCal(int num) {
//		int count=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//			System.out.println("prime number");
//		else
//			System.out.println("Not a prime");
		}
}
