/**This program can convert the number entered by 
 * the user into the character corresponding to ASCII code.
 *
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/23
 * @version 1.0
 * @teacher Mike , Tim
 */ 
public class Character2ASCII4_8 
{
	/**
	 * @param args
	 */
	//Program entry
    public static void main(String[] args) 
    {
    	//Read user input
    	java.util.Scanner input = new java.util.Scanner(System.in);
    	System.out.print("Enter an ASCII code: ");
    	int number = input.nextInt();
    	
    	//Judge whether user data is legal or not.
    	if(number>= 0 && number <=127);
    	else
    	{
    		System.out.println("You input data is error! Please input again!");
    		return;
    	}
        
    	//Passing Parameters
    	char ascii = byteAsciiToChar(number);
    	
    	//Output result
        System.out.println("The character for ASCII code "+number+" is "+ascii);
    }

    //Method for converting numbers to ASCII
    public static char byteAsciiToChar(int ascii)
    {
		char ch = (char)ascii;
		return ch;
	}

}
