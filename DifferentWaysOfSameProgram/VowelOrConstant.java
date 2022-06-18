package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

public class VowelOrConstant {
	public static void main(String[] args) {
		int i = 0;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the charcter: ");
//		char ch=sc.next().charAt(0);
//		switch(ch)
//		{
//		case  'a':
//		case  'e':
//		case  'i':
//		case  'o':
//		case  'u':
//		case  'A':
//		case  'E':
//		case  'I':
//		case  'O':
//		case  'U':	
//			i++;
//		}
//		if(i==1)
//		{
//			System.out.println("Enter charcter "+ch+" is Vowel");
//		}
//		else if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))
//		{
//			System.out.println("Enter charcter"+ch+" is consonent");
//		}
//		else
//		{
//			System.out.println("Not an alphabet");
//		}
		// Another Way
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charcter: ");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Enter charcter " + ch + " is Vowel");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Enter charcter " + ch + " is consonent");
		} else {
			System.out.println("Entered chacrter is a special character ");
		}

		sc.close();
	}

}
