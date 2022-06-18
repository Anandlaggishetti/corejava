package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * ReverseOfaString programs
 */
public class ReverseOfaString {
	public static void main(String[] args) {
		//ReverseOfaString rev = new ReverseOfaString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();
		System.out.println("Reverse of a String: ss" + reverse(str));
		sc.close();

	}

	private static String reverse(String str) {
		String rev1 = " ";
		for (int j = str.length(); j > 0; j--) {
			rev1 = rev1 + (str.charAt(j-1));
		}
		return rev1;
	}
}
