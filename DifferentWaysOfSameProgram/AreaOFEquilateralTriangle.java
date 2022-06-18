package com.DifferentWaysOfSameProgram;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * finding the AreaOFEquilateralTriangle
 */

public class AreaOFEquilateralTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of a triangle :");
		double a=sc.nextDouble();
		double area=(Math.sqrt(3)/4)*(a*a);
		System.out.println("Area of trinale "+area);
		sc.close();
	}

}
