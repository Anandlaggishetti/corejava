package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * Fibionic Series Program 
 */

public class FibionicSeries {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the range: ");
//		int n = sc.nextInt();
//		int i = 0, j = 1, nextterm = 0;
//		System.out.println("fibmoic series is: ");
//		for (int c = 0; c < n; c++) {
//			
//			if (c <= 1) {
//				nextterm = c;
//			} else {
//				nextterm = i + j;
//				i = j;
//				j = nextterm;
//			}
//		System.out.println(nextterm);
//	}
		
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
}
}
