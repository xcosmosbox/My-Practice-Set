import java.util.Scanner;

/**
 * This program can create two complex numbers and output various calculation results between them
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/07
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestProgram
{
	public static void main(String[] args) 
	{
		//Prompts you to enter two complex numbers and creates them
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first complex number: ");
		Complex firstComplex = new Complex(input.nextDouble(),input.nextDouble());
		System.out.print("Enter the second complex number: ");
		Complex secondComplex = new Complex(input.nextDouble(),input.nextDouble());
		
		//Output results
		firstComplex.add(secondComplex);
		firstComplex.subtract(secondComplex);
		firstComplex.multiply(secondComplex);
		firstComplex.divide(secondComplex);
		firstComplex.abs();
		System.out.println(firstComplex.toString());
		System.out.println(secondComplex.toString());
		
		
		
		
	}

}
