package Operators;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * BitwiseOpertators programss
 */
public class BitwiswOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the num2 number: ");
		int num2=sc.nextInt();
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		System.out.println(num1 >> 2);
		System.out.println(num1 << 2);
		System.out.println(num1 >>> 2);
		
		
		sc.close();
		
	}

}
