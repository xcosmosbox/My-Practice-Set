public class RunTestTriangle 
{
	public static void main(String[] args) 
	{
		// Create two geometric objects
		Circle circle_1 = new Circle(5); 
		Rectangle rectangle_1 = new Rectangle(5, 3);
		
		System.out.println("The two objects have the same area? " +
				 equalArea(circle_1, rectangle_1)); 
		 
		// Display circle
		displayCircleObject(circle_1);
		
		// Display rectangle
		displayRectangleObject(rectangle_1);
		 
	}

	/** A method for comparing the areas of Circle between and Rectangle */
	private static boolean equalArea(Circle obj_1, Rectangle obj_2)
	{
		return obj_1.getArea() == obj_2.getArea();
	}
	
	/** A method for displaying a Circle object */
	public static void displayCircleObject(Circle circle)
	{
		System.out.println();
		System.out.println("The area is "+circle.getArea());
		System.out.println("The perimeter is "+circle.getPerimeter());
	}
	/** A method for displaying a Rectangle object */
	public static void displayRectangleObject(Rectangle rectangle)
	{
		System.out.println();
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	}
	
}
