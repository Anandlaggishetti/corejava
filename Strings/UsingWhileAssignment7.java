package Strings;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * Java Program to Reverse a String(5 ways)
 */
public class UsingWhileAssignment7 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name=sc.nextLine();
		String rev=" ";
		int i=name.length();
		System.out.print("reverse of a string is: ");
		while(i>0)
		{
			System.out.print(name.charAt(i-1)+ " ");
			i--;
		}
	}		

}
