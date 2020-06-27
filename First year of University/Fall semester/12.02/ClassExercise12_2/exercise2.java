public class exercise2 
{
	public static void main(String[] args) 
	{
		double[][] numberArray = initialization();
		
		input(numberArray);
		
		sum(numberArray);
		

	}
	
	public static double[][] initialization()
	{
		double[][] numberArray = new double[2][3];
		return numberArray;
	}
	
	public static double[][] input(double[][] numberArray)
	{
		System.out.println("Please input a 2x3 array:");
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				numberArray[i][j] = input.nextDouble();
			}
		}
		return numberArray;
	}
	
	public static void sum(double[][] numberArray)
	{
		double sum = 0;
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				sum = sum + numberArray[i][j];
			}
		}
		System.out.print("The array sum is "+sum);
	}

}
