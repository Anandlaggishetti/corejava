package PatternPrograms;

public class Pattern12 {
	public static void main(String[] args) {
		int k=1;
		for (int i = 1; i <= 5; ++i) {
			k=i;
			for (int j = 1; j <= 5; ++j) {
				System.out.print(k+" ");
				k+=5;
			}
			System.out.println();
		}
	}
}
