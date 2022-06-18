package FlowControls;
/**
 * 
 * @author al22077
 *  Using difference between for loop and for each
 */
public class ForEachDemo {
	public static void main(String[] args) {
		int x[]= {5,2,6,8,4,9,6};
		for(int i=0;i<x.length;++i)
		{
			System.out.print(x[i] +" ");
		}
		System.out.println();
		
		System.out.println("---------------------------");
		
		for(int j:x)
		{
			System.out.print (j +" ");
		}
	}

}
