/**The program can calculate the 10th digit according to the formula
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/14
 * @version 1.0
 */ 
public class CheckISBN_3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int digits_01 = input.nextInt();
		int digits_02 = input.nextInt();
		int digits_03 = input.nextInt();
		int digits_04 = input.nextInt();
		int digits_05 = input.nextInt();
		int digits_06 = input.nextInt();
		int digits_07 = input.nextInt();
		int digits_08 = input.nextInt();
		int digits_09 = input.nextInt();
		
		//calculate the result
		int digits_10 = ((digits_01 + (digits_02* 2) + (digits_03* 3) + (digits_04* 4) + (digits_05* 5) + (digits_06* 6) + (digits_07* 7) + (digits_08* 8) + (digits_09* 9)) % 11);
		
		//Output result
		if(digits_10 == 10)
		{
			System.out.println("The ISBN-10 number is "+digits_01+digits_02+digits_03+digits_04+digits_05+digits_06+digits_07+digits_08+digits_09+"X");
		}
		else
		{
			System.out.println("The ISBN-10 number is "+digits_01+digits_02+digits_03+digits_04+digits_05+digits_06+digits_07+digits_08+digits_09+digits_10);
		}
		
	}

}
