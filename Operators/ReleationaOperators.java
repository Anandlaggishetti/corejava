package Operators;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * Releational Operator Program
 */
public class ReleationaOperators {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1=sc.nextInt();
		System.out.print("Input second number: ");
		int num2=sc.nextInt();
		System.out.println("num1 > num2 is"+(num1>num2));
		System.out.println("num1 >= num2 is"+(num1>=num2));
		System.out.println("num1 < num2 is"+(num1<num2));
		System.out.println("num1 <= num2 is"+(num1<=num2));
		System.out.println("num1 == num2 is"+(num1==num2));
		System.out.println("num1 != num2 is"+(num1!=num2));
		sc.close();
	}

}
