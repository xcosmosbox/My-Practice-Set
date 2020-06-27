
public class JudgePassword 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		String word = input.nextLine();
		
		int lenthWord = word.length();
		if(word.length() != 8)
		{
			System.out.println("You input data is error! Please input again!");
			return;
		}
		
		char[] letter = new char[8];
		boolean upLett = false;
		boolean lowLett = false;
		boolean number = false;
		
		letter[0] = word.charAt(0);
		letter[1] = word.charAt(1);
		letter[2] = word.charAt(2);
		letter[3] = word.charAt(3);
		letter[4] = word.charAt(4);
		letter[5] = word.charAt(5);
		letter[6] = word.charAt(6);
		letter[7] = word.charAt(7);
		
		
		
		if('0' <= letter[0] | letter[0] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[1] | letter[1] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[2] | letter[2] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[3] | letter[3] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[4] | letter[4] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[5] | letter[5] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[6] | letter[6] <= '9' )
		{
			number = true;
		}
		if('0' <= letter[7] | letter[7] <= '9' )
		{
			number = true;
		}
		
		//two parts
		if('A' <= letter[0] | letter[0]<= 'Z' )
		{
			upLett = true;
		}
		if('A' <= letter[1] | letter[1]<= 'Z' )
		{
			upLett = true;
		}
		if('A' <= letter[2] | letter[2]<= 'Z')
		{
			upLett = true;
		}
		if('A' <= letter[3] | letter[3]<= 'Z' )
		{
			upLett = true;
		}
		if('A' <= letter[4] | letter[4]<= 'Z')
		{
			upLett = true;
		}
		if('A' <= letter[5] | letter[5]<= 'Z' )
		{
			upLett = true;
		}
		if('A' <= letter[6] | letter[6]<= 'Z' )
		{
			upLett = true;
		}
		if('A' <= letter[7] | letter[7]<= 'Z')
		{
			upLett = true;
		}
		
		
		if('a' <= letter[0] |letter[0] <= 'z' )
		{
			lowLett = true;
		}
		if('a' <= letter[1] |letter[1] <= 'z' )
		{
			lowLett = true;
		}
		if('a' <= letter[2] |letter[2] <= 'z')
		{
			lowLett = true;
		}
		if('a' <= letter[3] |letter[3] <= 'z' )
		{
			lowLett = true;
		}
		if('a' <= letter[4] |letter[4] <= 'z')
		{
			lowLett = true;
		}
		if('a' <= letter[5] |letter[5] <= 'z')
		{
			lowLett = true;
		}
		if('a' <= letter[6] |letter[6] <= 'z' )
		{
			lowLett = true;
		}
		if('a' <= letter[7] |letter[7] <= 'z')
		{
			lowLett = true;
		}
		
		
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
