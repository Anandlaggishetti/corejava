package Operators;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * Logical Operators
 */

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input Third number: ");
		int num3 = sc.nextInt();

		// && operator

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("num1 is the largest number");
		} else if ((num2 > num3) && (num2 > num3)) {
			System.out.println("num2 is the larget number");
		} else {
			System.out.println("num3 is the largest number");
		}

		// || operator
		if ((num1 == num2) || (num1 > num3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// ! Not Operator
		if (num1 != num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

}
