/**
 *	This is a self created exception class to store error information 
 */
public class BinaryFormatException extends Exception 
{
	public BinaryFormatException(int point, int number)
	{
		super("No."+point+" bit: \""+number+"\" is not a binary digit ");
	}
	
}
