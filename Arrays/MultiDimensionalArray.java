package Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		// Sum of opposite diagonal
		int sum = 0;
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int length=arr.length;

/*		for (int i = 0; i < arr.length; ++i) {
			System.out.println("The matrix Item at " + i + "," + (arr.length-i-1) + " position = "
					+ arr[i][arr.length - i - 1]);
		
			sum += arr[i][arr.length - i - 1];
		}
		System.out.println("The sum of opposite diagonal are :" + sum);

		System.out.println("------------------------------");
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(
					"The matrix Item at " + i + "," + (arr.length - length) + " position = " + arr[i][arr.length - length]);
			sum += arr[i][arr.length - length];
		}
		System.out.println("The sum of opposite diagonal are :" + sum);

		System.out.println("------------------------------");
		
		
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(
					"The matrix Item at " + (i) + "," + (arr.length - 1) + " position = " + arr[i][arr.length - 1]);
			sum += arr[i][arr.length -1];
		}
		System.out.println("The sum of opposite diagonal are :" + sum);
		
		*/
		
		System.out.println("------------------------------");
		
		for (int i = 0; i <arr.length; ++i) {
			System.out.println(
					"The matrix Item at " + (i) + "," + (arr.length-1) + " position = " + arr[i][arr.length-1]);
			//sum += arr[i][length];
		}
		//System.out.println("The sum of opposite diagonal are :" + sum);
	}
}
