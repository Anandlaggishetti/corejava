package Strings;

/**
 * 
 * @author al22077
 * Java Program to Count Number of Duplicate Words in String
 */

public class Assignment1 {
	public static void main(String[] args) {
		String name = "My name is anand and i born and raise i and in hyderabad i and " 
	+ "i have completed i and  post graduation and in computer ";
		int count = 0;
		String[] words = name.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if(words[i]!="0")
		         System.out.println(words[i]+"--"+count); //Printing the word along with count
		         count=1;
		}
		// System.out.println(words);
	}
}
