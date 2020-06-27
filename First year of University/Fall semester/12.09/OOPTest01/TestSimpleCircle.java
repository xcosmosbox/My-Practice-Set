public class TestSimpleCircle 
{
	public static void main(String[] args) 
	{
		SimpleCircle circle_01 = new SimpleCircle();
		System.out.print("The circle area is "+circle_01.getArea());//1
		
		SimpleCircle circle_02 = new SimpleCircle(25);
		System.out.print("The circle area is "+circle_02.getArea());//625*PI
		
		SimpleCircle circle_03 = new SimpleCircle(125);
		System.out.print("The circle perimeter is "+circle_03.getPerimeter());//250*PI
		
		SimpleCircle circle_04 = new SimpleCircle();
		circle_04.setRadius(25);
		System.out.print("The circle area is "+circle_04.getArea());//625*PI

	}

}
