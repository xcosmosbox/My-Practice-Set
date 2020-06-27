/**
 *	This is a self created exception class 
 */
public class ArrayIndexOutOfBoundsException extends Exception 
{
	public ArrayIndexOutOfBoundsException(int index)
	{
		super("Index "+index+" out of bounds for length 100");
	}
}
