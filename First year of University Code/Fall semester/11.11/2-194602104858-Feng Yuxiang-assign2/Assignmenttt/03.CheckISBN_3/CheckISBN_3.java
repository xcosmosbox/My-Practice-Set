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
		String isbn = input.next();
		
		//Check whether the ISBN code entered by the user is legal
		if(isbn.length() == 9) {}
		else
		{
			System.out.println("You data is error. Please input again!");
			return;
		}
		
		//Pass parameters to "calculate" method
		String endNum = calculate(isbn);
		
		//Output result
		System.out.println("The ISBN-10 number is "+ endNum);
		
	}
	
	//Constructing a new method for calculation and output
	public static String calculate(String number)
	{
		//Create array and calculate result
		int[] d = new int[10];
		int d10 = 0;
		String num0_Word ="";
		for(int i=0 ; i<9 ; i++)
		{
			d[i] = (char)(number.charAt(i));
			num0_Word = num0_Word+(char)d[i];
			d[i] = (int)(number.charAt(i) - '0');
		}
		
		d10 = (d[0]*1+d[1]*2+d[2]*3+d[3]*4+d[4]*5+d[5]*6+d[6]*7+d[7]*8+d[8]*9)%11;
		
		if(d10 == 10)
		{
			num0_Word = num0_Word + "X";
		}
		else
		{
			num0_Word = num0_Word + d10;
		}
		
		return num0_Word;
		
	}

}
