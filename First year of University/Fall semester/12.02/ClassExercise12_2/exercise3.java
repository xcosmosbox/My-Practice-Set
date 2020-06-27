public class exercise3 
{
	public static void main(String[] args)
	{
		double[][] numberArray = new double[2][3];
		initialize(numberArray);
		double[] minimumAndIndex = min(numberArray);
		double sum = add(numberArray);
		
		System.out.println("The minimum of this array is: "+minimumAndIndex[0]);
		System.out.println("The minimum index of this array is: "+"("+(int)minimumAndIndex[1]+","+(int)minimumAndIndex[2]+")");
		System.out.println("The sum of this array is: "+sum);
		
		
	}
	
	public static void initialize(double[][] numberArray)
	{
		System.out.println("Please input 2x3 array:");
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				numberArray[i][j] = input.nextDouble();
			}
		}
	}
	
	public static double[] min(double[][] numberArray)
	{
		double[] minimumAndIndex = new double[3];
		double min = numberArray[0][0];
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				if(numberArray[i][j] < min)
				{
					min = numberArray[i][j];
					minimumAndIndex[1] = i;
					minimumAndIndex[2] = j;
				}
			}
		}
		minimumAndIndex[0] = min;
		return minimumAndIndex;
	}
	
	public static double add(double[][] numberArray)
	{
		double sum = 0;
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				sum = sum + numberArray[i][j];
			}
		}
		return sum;
	}
}
