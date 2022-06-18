package PatternPrograms;

public class Pattern14 {
	public static void main(String[] args) {
		int n = 5, x;
		for (int i = 1; i <= n; i++) {
			x = i;
			for (int j = 1; j <= n; j++) {
				System.out.print(x);
				x++;
			}
			x++;
			System.out.println();
		}
	}
}
