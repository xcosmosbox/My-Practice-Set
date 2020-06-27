/**
 * 
 */

/**
 * @author apple
 *
 */
public class SearchNum 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Scanner user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		String letter = input.nextLine();
		char word;
		boolean digits = false;
		
		//"for loop" to search digits
		for(int i=0 ; i<letter.length() ; i++)
		{
			word = letter.charAt(i);
			if(Character.isDigit(word))
			{
				digits = true;
				break;
			}
		}
		
		//Output result
		if(digits) System.out.println("This string has digits!");
		else System.out.println("This string has not digtis!");
		

	}

}
