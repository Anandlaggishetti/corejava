package FlowControls;

import java.util.Scanner;

/**
 * 
 * @author al22077
 * write a program to find whether given number  is even or odd:
 *
 */
public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number is Even number");
		}
		else
		{
			System.out.println("Given number is Odd number");
		}
		sc.close();
	}
}
