import java.util.Scanner;

/**
 *	 This program can find the specified character in the string entered by the user
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/25
 * @version 1.0
 * @teacher Mike , Tim
 */
public class A11_2_OccurrencesOfASpecifiedCharacterInAnArray 
{
	public static void main(String[] args) 
	{
		//Prompt user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string: ");
		String str = input.next();
		System.out.print("Please input a character you want: ");
		String chStr = input.next();
		char ch = chStr.charAt(0);
		
		//Convert string to character array and output the result by recursion
		char[] s = str.toCharArray();
		System.out.println("The number of times this character appears in this string is: "+count(s,ch));
		
	}
	
	/*Main recursive method*/
	public static int count(char[] chars, char ch)
	{
		return count(chars,ch,0);
	}
	/*Auxiliary recursive method*/
	public static int count(char[] chars, char ch, int high)
	{
		//Judge whether to query to the end of string through if statement
		if(high == chars.length)
		{
			return 0;
		}
		else
		{
			//Query whether the specified character appears in the specified position through if statement
			if(chars[high] == ch)
			{
				return 1+count(chars,ch,high+1);
			}
			else
			{
				return 0+count(chars,ch,high+1);
			}
		}
	}

}
