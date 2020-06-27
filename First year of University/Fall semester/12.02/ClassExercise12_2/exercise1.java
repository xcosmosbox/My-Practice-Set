
public class exercise1
{
	public static void main(String[] args) 
	{
		//
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] numberArray = new double[2][3];
		System.out.println("Please input a 2x3 array:");
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				numberArray[i][j] = input.nextDouble();
			}
		}
		
		//
		double min = numberArray[0][0];
		String sub = "";
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=0; j<numberArray[i].length; j++)
			{
				if(numberArray[i][j] < min)
				{
					min = numberArray[i][j];
					sub = "("+i+","+j+")";
				}
			}
		}
		
		//
		System.out.println("The min number in the array: "+min);
		System.out.println("The subscript is "+sub);

	}

}
