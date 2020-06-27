/**
 * 
 */

/**
 * @author apple
 *
 */
public class RunTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Triangle triangle_01 = new Triangle();
		System.out.println( "The circumference of this rectangle is: " + triangle_01.getPerimeter()+"\n"+
							"The area of this rectangle is: "+ triangle_01.getArea());
		System.out.println("-------------------");
		
		Triangle triangle_02 = new Triangle(3,4,5);
		System.out.println( "The circumference of this rectangle is: " + triangle_02.getPerimeter()+"\n"+
							"The area of this rectangle is: "+ triangle_02.getArea());
		System.out.println("-------------------");
		
		Triangle triangle_03 = new Triangle(1,1.5,1);
		System.out.println( "The circumference of this rectangle is: " + triangle_03.getPerimeter()+"\n"+
							"The area of this rectangle is: "+ triangle_03.getArea());
		System.out.println("-------------------");
		
		System.out.println(triangle_03.getnumberOfObjects());
	
		
	}

}
