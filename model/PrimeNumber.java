package com.app.model;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				temp++;
			}
		}
		if (temp ==2) {
			System.out.println("prime number");
		} else {
			System.out.println("Not a prime");
		}
		sc.close();
	}

}
