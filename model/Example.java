package com.app.model;

public class Example 
{
	
	int x=60;                //instance variable
	static int y=100;         // static varibale
	
	public static void main(String[] args) 
	{
		//Example e=new Example();
		int x=20;
		//int y=50;
		System.out.println(x);
		System.out.println(y);
		//System.out.println(e.x);
		//System.out.println(x);
		anand();
		//e.sample();
		//e.hari();
		
		 int y = ++x * 10 / x++ + ++x;  
		System.out.println(y);
	}
	
	public static void anand()
	{
		int x=40;
		System.out.println(y);
	}
	
	void sample()
	{
		System.out.println("hai");
	}
	
	
	void hari()
	{
		System.out.println("hello");
	}

}
