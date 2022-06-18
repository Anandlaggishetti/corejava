package com.DifferentWaysOfSameProgram;

import java.util.Scanner;

/**
 * 
 * @author al22077 Area of Circle Program
 */

class AreaOfCircle //extends AreaCalculation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter the radius:"); double r = sc.nextDouble(); double
		 * area = (22 * r * r) / 7; System.out.println("Area of circle is:" + area);
		 * sc.close();
		 */
		
//		System.out.println("Enter the radius:");
//		double r = sc.nextDouble();
//		double area = (22 * r * r) / 7;
//		AreaOfCircle aoc = new AreaOfCircle();
//		aoc.circle(r);
//		System.out.println("Area of circle is:" + aoc.area);
//		sc.close();

		System.out.println("Enter the radius:");
		double r = sc.nextDouble();
		AreaCalculation areaCalculation=new AreaCalculation(r);
		System.out.println("Area of circle is:"+areaCalculation.area);
		sc.close();

	}
}
