/**
 *This program can determine whether a three-digit number is palindrome number or not.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/28
 * @version 1.0
 */ 
public class PalindromeNumber 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Note: Be sure to enter a three-digit number"+'\n');
		
		//Read user input
		java.util.Scanner number = new java.util.Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int num = number.nextInt();
		
		//Check the validity of the data entered by the user
		if(num >= 100 && num <= 999) {}
		else 
		{	
			System.out.println("The data you entered is not valid!");
			return;
		}
		
		//Declaration array
		int data[] = new int[2];
		data[0] = num / 100;
		data[1] = num % 10;
		
		//Compute results
		if(data[0] == data[1]) 
		{
			System.out.println(num+ " is a palindrome");
		}
		else
		{
			System.out.println(num+ " is not a palindrome");
		}
		

	}

}
