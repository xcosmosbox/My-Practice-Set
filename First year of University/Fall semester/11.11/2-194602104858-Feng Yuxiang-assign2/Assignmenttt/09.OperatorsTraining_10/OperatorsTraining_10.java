/**
 *This program can judge user input number that the number divisible 5 or 6
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/15
 * @version 1.0
 */ 

public class OperatorsTraining_10 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//divisible number
		if(number%5 == 0 && number%6 ==0 ) //ALL divisible
		{
			System.out.println("Is "+number+" divisible by 5 and 6?  true");
		}
		else
		{
			System.out.println("Is "+number+" divisible by 5 and 6?  false");
		}
		
		if(number%5 == 0 || number%6 ==0 ) //ONE divisible
		{
			System.out.println("Is "+number+" divisible by 5 and 6?  true");
		}
		else
		{
			System.out.println("Is "+number+" divisible by 5 and 6?  false");
		}
		
		if(number%5 == 0 ^ number%6 ==0 ) // NOT both divisible
		{
			System.out.println("Is "+number+" divisible by 5 and 6, but not both?  true");
		}
		else
		{
			System.out.println("Is "+number+" divisible by 5 and 6,but not both?  false");
		}

	}

}
