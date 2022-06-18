package Operators;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {

//		int a = 40, b = 30;
//		int x = (a > b) ? a : b;
//		System.out.println(x);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		System.out.println("Enter the number: ");
		int b=sc.nextInt();
		int z=(a>b)?a:b;
		System.out.println("Largest number is:"+z);

	}

}
