/**
 * 
 */

/**
 * @author apple
 *
 */
public class exercise_01 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] userInput = new int[5];
		for(int i=0; i<5; i++)
		{
			userInput[i] = input.nextInt();
		}
		
		//Pass by value
		changeArray(userInput);
		
		//Display result
		for(int i=0; i<5; i++)
		{
			System.out.print(userInput[i] + " ");
		}	
	}
	
	//Double number method
	public static void changeArray(int[] userInput)
	{
		for(int i=0; i<5; i++)
		{
			userInput[i] = userInput[i]*2;
		}
		
	}

}
