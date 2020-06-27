/**
 *This program can display the one with the better price
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/15
 * @version 1.0
 */ 
public class CompareCosts_11 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double weight_01 = input.nextDouble();
		double price_01 = input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		double weight_02 = input.nextDouble();
		double price_02 = input.nextDouble();
		
		double endPrice = (weight_01*price_01)-(weight_02*price_02);
		
		//output result
		if(endPrice >0)
		{
			System.out.println("Package 2 has a better price.");
		}
		else if(endPrice <0)
		{
			System.out.println("Package 1 has a better price.");
		}
		else if(endPrice == 0)
		{
			System.out.println("Two package hava the same price.");
		}
		
		
	}

}
