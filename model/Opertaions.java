package com.app.model;

import java.util.Scanner;

public class Opertaions 
{
	public static void main(String[] args) 
	{
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		for(int i=0;i<=50;i++)
		{
			System.out.print("*" );			
		}
		System.out.println();
		
		int x=-5 + 8 * 6;
		int y=(55+9) % 9,z=20 + -3*5 / 8,w=5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(x +"\n"+ y +"\n" + z +"\n" + w ) ;
	}
}
