package PatternPrograms;
/**
 * 
 * @author al22077
 *  
 */
public class Pattern10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 3; ++j) {
				 
				// Here we are printing 2 values at a time
				System.out.print(j + " " + i + " ");
			}
			System.out.println();
		}
	}
}
