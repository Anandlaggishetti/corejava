package com.app.model;

public class Transaction {
	static String bname = "Hyd";          //static variable
	int accno=54321;                            //instance
	int amount=250000;                           //instance

	public static void withdraw() {
		Transaction t=new Transaction();
		int wAmt = 5000;                    //local variable
		System.out.println(t.accno);          //Error
		System.out.println(t.amount);            
		//System.out.println(dAmt);
	}

	public static void deposit() {
		Transaction t=new Transaction();
		int dAmt = 2000;                    //local variable
		System.out.println(t.accno);
		System.out.println(t.amount);
		//System.out.println(WAmt);
		//System.out.println(newpin) ; 
	}

	public static void pinchange(int newpin) // newpin is parameter
	{
		Transaction t=new Transaction();
		int pinnum = newpin;
		System.out.println(t.accno);
	}

	public static void main(String[] args) {
		int accno = 1001; // Local variable
		System.out.println(accno);
		Transaction t=new Transaction();
		t.deposit();
		t.withdraw();
		
	}
}


