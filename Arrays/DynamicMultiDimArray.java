package Arrays;

import java.util.Scanner;

public class DynamicMultiDimArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows :");
		int rows = sc.nextInt();
		System.out.print("Enter no of columns: ");
		int cols = sc.nextInt();
		// creating the array
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		int total=0;
		for (int i = 0; i < rows; ++i) {
			int sum = 0;
			for (int j = 0; j < cols; ++j) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
				//total=sum+sum+sum;
			}
			total+=sum;
			System.out.println("=" + sum);
		}
		System.out.println(total);
		System.out.println("----------------------");
		int sum = 0;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
					sum += arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Total Sum = " + sum);
		System.out.println("----------------------");
	}
}
