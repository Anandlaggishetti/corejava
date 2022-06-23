package Strings;

import java.util.Scanner;

/**
 * 
 * @author al22077 
 * Java Program to Count the Occurrences of Each Character in
 *         String
 */
public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "This is java program written by the anand gupta";
		System.out.print("Enter that character that you want to search ");
		char search = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i <= str.length()-1; i++)		
		{
			if (str.charAt(i) == search) {
				count++;
			}
			// int count=(str.split("a").length)-1;
		}
		System.out.println("Total occurrences of a substring in the given string: " + count);
	}

}
