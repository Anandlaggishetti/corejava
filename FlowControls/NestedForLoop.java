package FlowControls;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * pattern program
 */
public class NestedForLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=5;++i) {
			for(int j=1;j<=10;++j) {
				System.out.print(i+"*"+j+"="+(i*j) +" ");
			}
			System.out.println( );
		}
		sc.close();
	}

}
