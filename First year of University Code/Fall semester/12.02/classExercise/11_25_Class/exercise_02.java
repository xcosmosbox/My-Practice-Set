/**
 * 
 */

/**
 * @author apple
 *
 */
import java.math.*;
public class exercise_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Read user input
		System.out.print("Enter the integers between 1 and 100: \n");
		int[] integersNum = new int[100];
		for(int i=0; i<100; i++) 
		{
			integersNum[i] = (int)(Math.random()*(122-97)+97); 
		}
		
		//Sorting arrays with functions
		java.util.Arrays.sort(integersNum);
		
		
		//Use for loop to calculate and output results
		System.out.print("The occurrences of each letter are: \n");
		int times = 1;
		for(int i=0; i<integersNum.length; i++)
		{
			if(integersNum[i] == 0)	continue;
			for(int j=i+1; j<integersNum.length; j++)
			{
				if(integersNum[j] == 0)	continue;
				if(integersNum[i] == integersNum[j])
				{
					times++;
					integersNum[j] = 0;
				}
			}
			//Display result
			System.out.println(times+" "+(char)(integersNum[i])+"  ");
			times = 1;
		}

	}

}
