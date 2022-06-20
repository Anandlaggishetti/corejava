package com.app.model;

import java.util.Scanner;

public class DiscountValue 
{
	public static void main(String[] args) 
	{
		double p,q,t;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the market price:");
		p=sc.nextDouble();
		System.out.println("Enter the interest:");
		q=sc.nextDouble();
		System.out.println("Enter the time");
		t=sc.nextDouble();
		
		 
		double amount=(p*q*t)/100;
		
		System.out.println(amount);
		//System.out.println("amount after discou);
	 
		}	
	}
