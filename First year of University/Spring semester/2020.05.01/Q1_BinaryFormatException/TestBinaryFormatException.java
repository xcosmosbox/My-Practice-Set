import java.util.Scanner;

/**
 * This program can convert binary integers to decimal integers
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/30
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestBinaryFormatException 
{
	public static void main(String[] args) throws BinaryFormatException 
	{
		bin2Dec();
	}
	
	//Binary to decimal method
	public static void bin2Dec() throws BinaryFormatException
	{
		//Prompt user for binary integer
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String str = input.next();
		int point = 1;
		int sum = 0;
		boolean isError = false;
		
		//Calculating decimal integers by calculation rules
		for(int i=str.length()-1; i>=0; i--)
		{
			//By judging the error of sentence receiving and throwing
			if((str.charAt(i)-'0')<=1 && (str.charAt(i)-'0')>=0)
			{
				sum = (int) (sum + (str.charAt(i)-'0')*Math.pow(2, point-1));
				point++;
			}
			else
			{
				System.out.println(new BinaryFormatException(point,((int)str.charAt(i)-'0')));
				isError = true;
				bin2Dec();
				break;
			}
		}
		
		//If non binary bits do not appear, the correct answer is output
		if(!isError)
		{
			System.out.println("The decimal number is: "+sum);
		}
		
	}
	

}
