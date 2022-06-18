package PatternPrograms;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 5;

		int x;
		
		for (int i = 1; i <= n; i++) {
			x= (n - i) + 1;

			for (int j = 1; j <= n; j++) {
				System.out.print(x);
				x += n;
				}
				//System.out.println();
				//y += n;
			System.out.println();
			}
		}
	}

