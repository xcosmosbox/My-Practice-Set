/**
 *This program can solve quadratic equations
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/28
 * @version 1.0
 */ 
public class QuadraticEquations 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Explain
		System.out.println("Welcome to use this system!");
		System.out.println("Note: Input a, b, c to output root!");
		
		//Read user input
		java.util.Scanner letter = new java.util.Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double letterA = letter.nextDouble();
		double letterB = letter.nextDouble();			
		double letterC = letter.nextDouble();
		
		//Check the validity of the value entered by the user
		if( ((letterB*letterB) - (4*letterA*letterC))>= 0) {}
		else 
		{	
			System.out.println("The equation has no real roots!");
			return;
		}
		
		//Calculation results
		double delta = (letterB*letterB) - (4*letterA*letterC);
		double root = Math.pow(delta,0.5);
		double molecule_01 = (0-letterB) - root;
		double molecule_02 = (0-letterB) + root;
		double x_01 = molecule_01 / (2*letterA);
		double x_02 = molecule_02 / (2*letterA);
		
		//Number of test roots
		if(x_01 == x_02)
		{
			System.out.println("The equation has one root "+ x_01);
		}
		else
		{
			System.out.println("The equation has two roots "+ x_01 +" and "+ x_02);
		}
		
		
		
		
		
		

	}

}
