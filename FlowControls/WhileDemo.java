package FlowControls;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * Print 1 to 10 numbers
 */

public class WhileDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		while(num<=10)
		{
			System.out.println(num);
			++num;
		}
		sc.close();		
	}

}
