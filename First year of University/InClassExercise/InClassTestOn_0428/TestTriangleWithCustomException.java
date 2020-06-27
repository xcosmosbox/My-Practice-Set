/**
 * 
 */

/**
 * @author apple
 *
 */
public class TestTriangleWithCustomException 
{
	public static void main(String[] args)
	{
		try
		{
			new TriangleWithCustomException();
			new TriangleWithCustomException(3,4,5);
			new TriangleWithCustomException(2,1,1);
			new TriangleWithCustomException(6,8,10);
			 
		}
		catch(InvalidTriangleException ex)
		{
			System.out.println(ex);
		}
	
		System.out.println("Number of objects created: "+TriangleWithCustomException.getNumberOfObjects());
	}

}
