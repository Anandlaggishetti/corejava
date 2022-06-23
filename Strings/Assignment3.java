package Strings;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Java Program to Count the Number of Occurrences of Substring in a String
 */

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,match;
		System.out.print("Enter the main String :");
		str=sc.next();
		System.out.print("Enter the match substring :");
		match=sc.next();
		int index = 0,count=0;
		while((index=str.indexOf(match,index)) != -1)
		{
			count++;
			str=str.substring(index+1);
		}
		System.out.println("Count: "+ count);
	}

}
