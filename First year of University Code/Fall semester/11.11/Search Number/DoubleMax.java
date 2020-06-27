/**
 * 
 */

/**
 * @author apple
 *
 */
public class DoubleMax 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double a = 1.112;
		double b = 2.333;
		double c = 3.222;
		float e = 3.222F;
		float f = 47.323F;
		int g = 4;
		
		double result_01 = max(a,b);
		float result_02 = max(e,f,g);
		
		System.out.println(result_01);
		System.out.println(result_02);

	}
	
	//Max double method
	public static double max(double num1 , double num2)
	{
		double result = 0;
		if(num1>num2)
		{
			result =  num1;
		}
		else if(num2>num1)
		{
			result = num2;
		}
		else	
		{
			System.out.print("null");
		}
		
		return result;
	}
	
	//Max float method
	public static float max(float num1 , float num2 , float num3)
	{
		float result = 0;
		if(num1>num2 && num1>num3)
		{
			result = num1;
		}
		else if(num2>num1 && num2>num3)
		{
			result = num2;
		}
		else if(num3>num1 && num3>num2)
		{
			result = num3;
		}
		
		return result;
		
	}

}
