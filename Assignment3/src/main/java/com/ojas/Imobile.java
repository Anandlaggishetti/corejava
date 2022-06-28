package com.ojas;

interface Imobile {

	public void dial();
}

interface ITelephone {

	public void dial();
}

class Mobile implements Imobile, ITelephone {

	long EMICode;
	boolean IsSingleSIM;
	String Processor;
	String SIMCard;
	long MobileNo;

	public void ConnectBlueTooth() {
		System.out.println("With bluetooth connection we can liston music and we can respond to the call");
	}

	public void dial() {

		System.out.println("Dail is used to call a person");
	}

	public void GetIEMICode() {
		System.out.println("Here you can IMEInumber");
	}

	public void GetWIFIConnection() {
		System.out.println("with the wifi we can connect laptop,tv, mobile etc..");
	}

	public void Receive() {
		System.out.println("we can receive anything");
	}

	public void SendMessage() {
		System.out.println("send a message to a friend");
	}
}
