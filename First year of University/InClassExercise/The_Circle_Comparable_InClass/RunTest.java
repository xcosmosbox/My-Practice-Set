/**
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/23
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) throws Exception
	{
		Circle circle_1 = new Circle(5);
		Circle circle_2 = new Circle(10);
		
		System.out.println("The circle 1 area is: "+circle_1.getArea());
		System.out.println("The circle 2 area is: "+circle_2.getArea());
		System.out.println("The circle 1 perimeter is: "+circle_1.getPerimeter());
		System.out.println("The circle 2 perimeter is: "+circle_2.getPerimeter());
		
		System.out.println(circle_1.compareTo(circle_2));
		System.out.println(circle_1.equals(circle_2));
		
		Circle circle_3 = (Circle)circle_1.clone();
		Object circle_4 = circle_1.clone();
		
		System.out.println(circle_1.compareTo(circle_3));
		System.out.println(circle_1.equals(circle_3));
		
		System.out.println(circle_1.compareTo((Circle)circle_4));
		System.out.println(circle_1.equals(circle_4));
	}

}
