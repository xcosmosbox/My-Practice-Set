import java.util.Scanner;

/**
 *	This program can output the string array input by the user in reverse order
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/14
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestStack 
{
	public static void main(String[] args)
	{
		//Create a stack to store strings
		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		
		//Prompt user for five strings
		System.out.println("Enter 5 strings, ends with: ");
		for(int i=0; i<5; i++)
		{
			stack.push(input.nextLine());
		}
		
		//Output the string input by the user in reverse order
		System.out.println(stack.getSize()+" strings are: ");
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	
	}
	
	
	
}
