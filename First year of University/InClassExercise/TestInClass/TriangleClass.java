
public class TriangleClass extends GcometricObject
{
	private double side_1;
	private double side_2;
	private double side_3;
	
	public TriangleClass() 
	{
		super();
	}

	public TriangleClass(double side_1, double side_2, double side_3) 
	{
		super();
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.side_3 = side_3;
	}

	public TriangleClass(double side_1, double side_2, double side_3, String color, boolean filled) 
	{
		super();
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.side_3 = side_3;
		super.setColor(color);
		super.setFilled(filled);
	}

	public double getSide_1() {
		return side_1;
	}

	public void setSide_1(double side_1) {
		this.side_1 = side_1;
	}

	public double getSide_2() {
		return side_2;
	}

	public void setSide_2(double side_2) {
		this.side_2 = side_2;
	}

	public double getSide_3() {
		return side_3;
	}

	public void setSide_3(double side_3) {
		this.side_3 = side_3;
	}
	
	private double heronMath()
	{
		return ((side_1 + side_2 + side_3)/2);
	}
	
	public double getArea()
	{
		return Math.sqrt(heronMath()*(heronMath() - side_1)*(heronMath() - side_2)*(heronMath() - side_3));
	}
	
	public double getPerimeter()
	{
		return (side_1 + side_2 + side_3);
	}
	
	
	
	
	
	
	
}
