package Strings;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Java Program to Reverse a String(5 ways)
 */
public class Assignment7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=" Anand Gupta";
		String reverse=" ";
		
		for(int i=name.length()-1;i>0;i--)
		{
			reverse+=name.charAt(i);
		}
		System.out.println(reverse);
		
		
	   //Using Char[] 
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>0;i--)
		{
			reverse+=ch[i];
		}
		System.out.println(reverse);
		
		
		
		//using charcter variable
		
		char ch1;
		for(int i=0;i<name.length();i++)
		{
			ch1=name.charAt(i);
			reverse=ch1+reverse;
		}
		System.out.println(reverse);
		
	}
}
