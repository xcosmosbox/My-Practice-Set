/**
 * 
 */

/**
 * @author apple
 *
 */
public class JudgePassword 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		String word = input.nextLine();
		if(word.length() != 8)
		{
			System.out.println("You input data is error! Please input again!");
			return;
		}
		
		boolean upLett = false;
		boolean lowLett = false;
		boolean number = false;
		
		if(Character.isDigit(word.charAt(0))) number = true;
		if(Character.isDigit(word.charAt(1))) number = true;
		if(Character.isDigit(word.charAt(2))) number = true;
		if(Character.isDigit(word.charAt(3))) number = true;
		if(Character.isDigit(word.charAt(4))) number = true;
		if(Character.isDigit(word.charAt(5))) number = true;
		if(Character.isDigit(word.charAt(6))) number = true;
		if(Character.isDigit(word.charAt(7))) number = true;

		if(Character.isUpperCase(word.charAt(0))) upLett = true;
		if(Character.isUpperCase(word.charAt(1))) upLett = true;
		if(Character.isUpperCase(word.charAt(2))) upLett = true;
		if(Character.isUpperCase(word.charAt(3))) upLett = true;
		if(Character.isUpperCase(word.charAt(4))) upLett = true;
		if(Character.isUpperCase(word.charAt(5))) upLett = true;
		if(Character.isUpperCase(word.charAt(6))) upLett = true;
		if(Character.isUpperCase(word.charAt(7))) upLett = true;
		
		if(Character.isLowerCase(word.charAt(0))) lowLett = true;
		if(Character.isLowerCase(word.charAt(1))) lowLett = true;
		if(Character.isLowerCase(word.charAt(2))) lowLett = true;
		if(Character.isLowerCase(word.charAt(3))) lowLett = true;
		if(Character.isLowerCase(word.charAt(4))) lowLett = true;
		if(Character.isLowerCase(word.charAt(5))) lowLett = true;
		if(Character.isLowerCase(word.charAt(6))) lowLett = true;
		if(Character.isLowerCase(word.charAt(7))) lowLett = true;
		
		//output result
		if(lowLett == true && number == true && upLett ==true)
		{
			System.out.println("Your password is right!");
		}
		else
		{
			System.out.println("Your password is wrong!");
		}
		
	}

}
