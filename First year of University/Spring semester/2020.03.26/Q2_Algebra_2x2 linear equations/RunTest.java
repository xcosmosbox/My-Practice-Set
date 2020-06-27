/**
 * This program can create linear equation class. 
 * After inputting the data, we can judge whether there is a solution to the equation. 
 * Finally, we get the solution of the equation about X and y.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/20
 * @version 1.0
 * @teacher Mike , Tim
 */
import java.util.Scanner;

public class RunTest 
{
	public static void main(String[] args) 
	{
		//Read user input and create a linear equation object.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		LinearEquation linearEquation = new LinearEquation( input.nextDouble(),input.nextDouble(),
															input.nextDouble(),input.nextDouble(),
															input.nextDouble(),input.nextDouble());
		
		//Judge whether there is a solution and output the result
		if(linearEquation.isSolvable() == false)
		{
			System.out.println("The equation has no solution");
		}
		else
		{
			System.out.println("x is "+linearEquation.getX()+" and y is "+linearEquation.getY());
		}
		
	}

}
