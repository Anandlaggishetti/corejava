package com.ojas;

public class Samsung extends Mobile{
	
	public void start()
	{
		System.out.println("Paresnt class main method");
	}
}


class Samsung_S5 extends Samsung 
{
	public static void main(String[] args) {
		System.out.println("Samsung_S5 child class main method");
		Samsung_S5 s=new Samsung_S5();
		s.start();
	}	
}
