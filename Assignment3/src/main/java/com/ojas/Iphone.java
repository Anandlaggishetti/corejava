package com.ojas;

public class Iphone extends Mobile{
	public static void main(String[] args) {
		Iphone iPhone =new Iphone();
		iPhone.ConnectBlueTooth();
		iPhone.dial();
		iPhone.GetIEMICode();
		iPhone.GetWIFIConnection();
		iPhone.Receive();
		iPhone.SendMessage();
	}

}
