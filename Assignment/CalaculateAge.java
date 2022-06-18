package Assignment;

import java.util.Scanner;
/**
 * 
 * @author al22077
 *
 *Calculate and return the age as a decimal number with precision upto a max of 2 decimal places by referring following example.
 * Example:
 * if the age is 15 years and 6 months, then the output should be 15.5
 * if the age is 20 years abd 3 months, then the output should be 20.25
 */
public class CalaculateAge {
	static double  calculateAge(int bYear,int bMonth)
	{
		double age=2022-bYear;
		double cAge=(age*12+bMonth)/12;
		
		if((bMonth<1) || (bYear<1))
		{
			return -1; 
		}
		else if(bYear>=2022 &&  bMonth>=6)
		{
			return -2;
		}
		else
		{
			return cAge;			
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Date of year: ");
		float bYear=sc.nextFloat();
		System.out.print("Enter the month of your birth: ");
		float bMonth=sc.nextFloat();
		//sf.setMaximumFractionDigits(2);
		System.out.printf("%.2f",calculateAge((int) bYear, (int) bMonth));
		sc.close();
	}
} 
