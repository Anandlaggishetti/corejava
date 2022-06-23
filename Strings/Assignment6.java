package Strings;

import java.util.Scanner;

/**
 * 
 * @author al22077 
 * Java Program to Remove Duplicate Words from String
 */
public class Assignment6 {
	public static void main(String[] args) {

		String result = " ";
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String: ");
//		String str=sc.next();
		String str ="Nasa selects three fission Nasa reacter for concepts for demomnstration on moon";
		str.toLowerCase();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j]))
					words[j] = "remove";
			}
		}
		for (String i : words) {

			if (i != "remove") {
				result = result + i + " ";
			}
		}
		System.out.println(result);
	}
}
