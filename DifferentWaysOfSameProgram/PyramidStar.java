package com.DifferentWaysOfSameProgram;


/**
 * 
 * @author al22077
 * Pyramid program 
 */
public class PyramidStar
{
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");				
			}
			for(int j=1;j<=i;j++)
			{  
				System.out.print("A ");
			}
			System.out.println( );
		}	
	}
}
