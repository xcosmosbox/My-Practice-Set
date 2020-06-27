/**
 * This is a test program, which can be used to detect the operation of triangle exception class.
 */
package Q2ForTriangleException;

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/30
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestIllegalTriangleException 
{
	public static void main(String[] args) throws IllegalTriangleException 
	{
		//Create triangles
		
			new Triangle();
			new Triangle(3,4,5);
			new Triangle(2,1,1);//第三个三角形是错的
			new Triangle(6,8,10);
		

		//Output successfully created several triangles
		System.out.println("Number of objects created: "+Triangle.getNumberOfObjects());
	}

}
