package FlowControls;

import java.util.Scanner;

/**
 * 
 * @author al22077 Calculation Program.
 */

public class SwicthDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("calculation Application");
		System.out.println("------------------------");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("-------------------------");
		System.out.print("Enter the num1 number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the num2 number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter your choice number: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition of two numbers:" + (num1 + num2));
			break;
		case 2:
			System.out.println("Subtraction of two numbers:" + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication of two numbers:" + (num1 * num2));
			break;
		case 4:
			System.out.println("Division of two numbers:" + (num1 / num2));
			break;
		default:
			System.out.println("Enter the choice in given range:1-4");

		}
		sc.close();
	}

}
