package com.DifferentWaysOfSameProgram;
/**
 * 
 * @author al22077
 *  DiscountProgram 
 *
 */
public class DiscountProgram {
	public static void main(String[] args) 
	{
		int dis,marketprice,amount,s;
		marketprice=1000;
		dis=25;
		System.out.println("Market Price is"+marketprice);
		System.out.println("Discount price "+dis);
		
		s=100-dis;
		
		amount=(marketprice*s)/100;
		System.out.println("After discount the price is :"+ amount);
		
		
	}

}
