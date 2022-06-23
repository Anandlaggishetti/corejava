package Strings;

import java.util.Scanner;

/*
 * Java Program to Swap Two Strings 
 */
public class Assignmnet9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String1: ");
		String str1=sc.next();
		System.out.print("Enter the String2: ");
		String str2=sc.next();
		String temp=" ";
		
		System.out.println("Before Swapping "+str1+"  "+str2);
		
//		temp=str1;
//		str1=str2;
//		str2=temp;
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After Swapping "+str1+"  "+str2);	
	}

}
