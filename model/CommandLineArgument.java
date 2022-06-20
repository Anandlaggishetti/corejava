package com.app.model;

public class CommandLineArgument {
	public static void main(String[] args) {
		String name = args[0] + " " + args[1];
		System.out.println("Name : " + name);
	}
}
