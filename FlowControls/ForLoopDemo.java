package FlowControls;

import java.util.Scanner;
/**
 * 
 * @author al22077
 * Print 1 to 10 numbers
 */
public class ForLoopDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;++i)
		{
			System.out.println(i);
		}
		sc.close();
	}
}
