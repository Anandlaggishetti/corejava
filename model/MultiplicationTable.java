package com.app.model;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert the number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the range: ");
		int range = sc.nextInt();

		for (int i = 1; i <= range; i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
	}

}
