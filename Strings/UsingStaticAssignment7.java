package Strings;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Java Program to Reverse a String(5 ways)
 */
public class UsingStaticAssignment7 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String :");
	String name1 = sc.nextLine();System.out.print("Reverse of string is: "+reverse(name1));
}

	public static String reverse(String s) {
		String rev = " ";
		for (int i = s.length() - 1; i > 0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}
}

