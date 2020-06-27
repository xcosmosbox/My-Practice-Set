/**
 *	The function of this class is to represent complex numbers in Mathematics 
 */
public class Complex implements Cloneable 
{
	//Create double variables
	private double a;
	private double b;
	
	//Parametric construction with two variables
	public Complex(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	//Parametric construction with a variable
	public Complex(double a)
	{
		this.a = a;
		this.b = 0;
	}
	//No-arg construction
	public Complex() 
	{
		this.a = 0;
		this.b = 0;
	}
	
	//Clone oneself
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Complex cloneComplex = new Complex(this.a,this.b);
		return cloneComplex;
	}
	
	//The method used to calculate the addition
	public void add(Complex secondComplex)
	{
		String a1 = ""+this.a;
		String b1 = ""+this.b;
		String a2 = ""+secondComplex.a;
		String b2 = ""+secondComplex.b;
		System.out.println("("+a1+" + "+b1+"i) + ("+a2+" + "+b2+"i) = "+(this.a+secondComplex.a)+" + "+(this.b+secondComplex.b)+"i");
	}
	
	//The method used to calculate subtraction
	public void subtract(Complex secondComplex)
	{
		String a1 = ""+this.a;
		String b1 = ""+this.b;
		String a2 = ""+secondComplex.a;
		String b2 = ""+secondComplex.b;
		System.out.println("("+a1+" + "+b1+"i) - ("+a2+" + "+b2+"i) = "+(this.a-secondComplex.a)+" + "+(this.b-secondComplex.b)+"i");
	}
	
	//The method used to calculate multiplication
	public void multiply(Complex secondComplex)
	{
		String a1 = ""+this.a;
		String b1 = ""+this.b;
		String a2 = ""+secondComplex.a;
		String b2 = ""+secondComplex.b;
		System.out.println("("+a1+" + "+b1+"i) * ("+a2+" + "+b2+"i) = "+((this.a*secondComplex.a)-(this.b*secondComplex.b))+" + "+((this.b*secondComplex.a)+(this.a*secondComplex.b))+"i");
	}
	
	//The method used to calculate Division
	public void divide(Complex secondComplex)
	{
		String a1 = ""+this.a;
		String b1 = ""+this.b;
		String a2 = ""+secondComplex.a;
		String b2 = ""+secondComplex.b;
		System.out.println("("+a1+" + "+b1+"i) / ("+a2+" + "+b2+"i) = "+(((this.a*secondComplex.a)+(this.b*secondComplex.b))/((secondComplex.a*secondComplex.a)+(secondComplex.b*secondComplex.b)))+" + "+(((this.b*secondComplex.a)-(this.a*secondComplex.b))/((secondComplex.a*secondComplex.a)+(secondComplex.b*secondComplex.b)))+"i");
	}
	
	//The method used to calculate the absolute value
	public void abs()
	{
		String a1 = ""+this.a;
		String b1 = ""+this.b;
		System.out.println("|("+a1+" + "+b1+"i)| = "+Math.sqrt(((this.a*this.a)+(this.b*this.b))));
	}
	
	//The method to get the real part
	public double getRealPart()
	{
		return this.a;
	}
	
	//The method to get the imaginary part
	public double getImaginaryPart()
	{
		return this.b;
	}
	
	//Printing basic information by override toString method
	@Override
	public String toString()
	{
		if(this.b!=0)
		{
			if(this.b>0)
			{
				return ( this.a+" + "+this.b+"i" );
			}
			else
			{
				return (this.a+" - "+Math.abs(this.b)+"i");
			}
			
		}
		else
		{
			return (a+"");
		}
	}
	
	
}
