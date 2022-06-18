package FlowControls;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Print 1 to 10 numbers
 */

public class DoWhileDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int num=sc.nextInt();
		do {
			System.out.println(num);
			++num;	
		}while(num<=10);
		sc.close();
	}

}
