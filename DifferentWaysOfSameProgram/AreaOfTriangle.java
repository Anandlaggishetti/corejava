package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077 finding the AreaOfTriangle in different ways
 */
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height: ");
		double h = sc.nextDouble();
		System.out.print("Enter the width: ");
		double b = sc.nextDouble();

//		double area = (h * b) / 2;
//		System.out.println("Area of Triangle is:" + area);
//		sc.close();
		
		AOT aot=new AOT(10, 20);
		System.out.println("Area of triangle is:"+aot.area);
		

	}

}
