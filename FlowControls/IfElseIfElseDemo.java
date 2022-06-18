package FlowControls;

import java.util.Scanner;

/**
 * 
 * @author al22077
 *Largest of Three numbers  
 */

public class IfElseIfElseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = sc.nextInt();
		System.out.print("Enter the Third number: ");
		int thirdNumber= sc.nextInt();
		if ((firstNumber > secondNumber) && (firstNumber> thirdNumber)) {
			System.out.println("firstNumber is the largest number");
		} else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
			System.out.println("secondNumber is the largest number");
		} else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
			System.out.println("thirdNumber is the largest number");
		} else {
			System.out.println("Any two or more numbers are equal ");
		}
	}

}
