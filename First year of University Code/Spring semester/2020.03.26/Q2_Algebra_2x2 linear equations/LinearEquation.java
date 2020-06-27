// Linear equation class
public class LinearEquation 
{
	//Create variables
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//The construction method with parameters of implicative variables
	public LinearEquation(double a, double b, double c, double d, double e, double f) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	//Accessors for all variables
	public double getA() 
	{
		return a;
	}

	public double getB() 
	{
		return b;
	}

	public double getC() 
	{
		return c;
	}

	public double getD() 
	{
		return d;
	}

	public double getE() 
	{
		return e;
	}

	public double getF() 
	{
		return f;
	}
	
	//Whether the return function has a solution
	public boolean isSolvable()
	{
		return ((a*d)-(b*c))==0 ? false : true ;
	}
	
	//return x value
	public double getX()
	{
		return ((e*d - b*f)/(a*d - b*c));
	}
	
	//return y value
	public double getY()
	{
		return ((a*f - e*c)/(a*d - b*c));
	}
	
}
