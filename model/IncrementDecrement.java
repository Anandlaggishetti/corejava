package com.app.model;

public class IncrementDecrement {

	int x = 40;
	float y = 55.5f;
	int z = 60;

	public static void main(String[] args) {
		IncrementDecrement td=new IncrementDecrement();
		td.compare();

	}

	 void compare()
	{
		
		if(y>x)
		{
			System.out.println("x is greather than y");
		}
		else 
		{
			System.out.println("y is lessthan x");
		}
		if(y < z) 
		{ 
		  System.out.println("y is less than z");  
		 }  
		else  
		{  
		  System.out.println("y is greater than z");  
		 }  
		}
}
