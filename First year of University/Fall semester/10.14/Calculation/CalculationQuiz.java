import java.util.Scanner;
/**This program can compute (num1-num2+num3) result
 * 
 */

/**
 * @author Yuxiang FENG
 *
 */

public class CalculationQuiz 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		int temp;
		
		if(num1>num2) 
		{
		}
		else
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.println("What is "+num1+"-"+num2+"+"+num3+"?");
		
		java.util.Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(num3<0)
		{
			System.out.println("Try again!");
		}
		
		if(answer == (num1-num2+num3))
		{
			System.out.println("You are correct!");
		}
		else
		{
			System.out.println("You answer is wrong!");
			System.out.println(num1+"-"+num2+"+"+num3+"="+(num1-num2+num3));
		}
	}

}
