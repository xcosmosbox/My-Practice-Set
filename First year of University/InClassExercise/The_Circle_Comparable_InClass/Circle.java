
public class Circle extends GeometricObject implements Cloneable, Comparable<GeometricObject> 
{
	private double radius;

	public Circle() 
	{
		super();
		
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}

	//Getter and Setter about radius
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		
		this.radius = radius;
	}
	
	//
	@Override
	public double getArea() 
	{
		return Math.pow(this.getRadius(), 2)*Math.PI;
	}

	//
	@Override
	public double getPerimeter() 
	{
		return 2*Math.PI*this.getRadius();
	}
	
	//
	@Override
	public boolean equals(Object obj)  
	{  
		return this.getRadius() == ((Circle)obj).getRadius();  
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Circle cloneClass = new Circle(this.getRadius());
		return cloneClass;
	}
	
	@Override
	public int compareTo(GeometricObject o)
	{
		if(this.getPerimeter() > ((Circle)o).getPerimeter()) return 1;
		else if(this.getPerimeter() == ((Circle)o).getPerimeter()) return 0;
		else return -1;
	}

}
