package com.DifferentWaysOfSameProgram;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Leap Program 
 */
public class LeapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		if (year != 0) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("leap year");
					} else {
						System.out.println("not a leap year");
					}
				} else {
					System.out.println("leap year");
				}
			} else {
				System.out.println("Not a leap year");
			}
		}
		sc.close();

	}

}
