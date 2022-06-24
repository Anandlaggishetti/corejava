package Arrays;

import java.util.Scanner;

public class ArraySorting {

	public static void sortStringArray(String[] str, int size) {
		String temp = " ";
		for (int i = 1; i < size-1; i++) {
			for (int j = 1; j <=size - 1; j++) {
				if (str[i - 1].compareToIgnoreCase(str[i]) > 0) {
					temp = str[i - 1];
					str[i - 1] = str[i];
					str[i] = temp;
				}
			}
		}
		System.out.println("After Sorting.....");
		for (String str1 : str)
			System.out.println(str1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an str: ");
		int size = sc.nextInt();

		String[] str = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.print("please enter the string" + (i + 1) + ": ");
			str[i] = sc.next();
		}
		System.out.println("Before Sorting......");
		for (String str1 : str) {
			System.out.println(str1);
		}
		sortStringArray(str, size);

	}
}
