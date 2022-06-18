package Assignment;

import java.util.Scanner;

public class PalindeomeOrNot {
	public static void main(String[] args) {
		String temp = "";
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String sName = sc.next();
		temp = sName;
		for (int i = sName.length(); i > 0; i--) {
			reverse = reverse + (sName.charAt(i - 1));
		}
		if (reverse.equals(temp)) {
			System.out.println("is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}

}
