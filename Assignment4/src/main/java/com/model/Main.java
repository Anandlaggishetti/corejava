package com.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
	        Account ac=new Account("123456789", "Anand", "7702728690");
	        System.out.println("Enter Account Number:");
	        String EnteredAccountNumber = sc.next();
	            if(ac.accoNo.equals(EnteredAccountNumber)) {
	                System.out.println("-----------Account Details----------");
	                System.out.println("WElcome :"+ac.name);
	                System.out.println("Account Number is:"+ac.accoNo);
	                System.out.println("Account Holder name is:"+ac.name);
	                System.out.println("Mobile Number is:"+ac.mobileNumber);
	                System.out.println("------------------------------------");
	                System.out.println("Do You Want to Deposite press Dept:");
	                System.out.println("Do You Want to WithDraw press With:");
	                String Depts = sc.next();

	                if(Depts.equalsIgnoreCase("Dept")) {
	                    ac.deposit();
	                }else {
	                    ac.Withdraw();
	                }
	                //ac.Deposit();

	            }else {
	                System.out.println("pls Try again:");
	            }
		
	}

}
