package Strings;
/**
 * 
 * @author al22077
 * Java Program to Count Number of Words in Given String                                
 */
public class Assignment2 {
	public static void main(String[] args) {
		String words="welcome to the java program this is my first program";
		int count=1;
		for(int i=0;i<words.length()-1;i++)
		{
			if((words.charAt(i)==' ') && (words.charAt(i+1)!=' '	))
			{
				count++;
			}
		}
		System.out.println("Number of words in a string is: "+count);
		
	}

}
