package com.ojas;

public class Nokia extends Mobile  {

	public void ready()
	{
		System.out.println("Paresnt class main method");
	}
}


class Nokia_Lumis625 extends Nokia
{
	public static void main(String[] args) {
		System.out.println("Samsung_S5 child class main method");
		Nokia_Lumis625 s=new Nokia_Lumis625();
		s.ready();
	}
	
}