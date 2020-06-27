/**The program cna judge the winning or losing of scissors and stone cloth
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/14
 * @version 1.0
 */ 
public class ScissorRockPaper_4 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		//read user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Instruction and defining variables
		System.out.print("scissor(0), rock(1), paper(2): ");
		int userNum =input.nextInt();
		int computerNum = (int)(Math.random()*3);
		String computer = null;
		String user = null;
		String reSovle = null;
		
		//Check the validity of the value entered by the user
		if(userNum > 2 | userNum < 0) 
		{
			System.out.println("The data you entered is not valid!");
			return;
		}

		
		//Enter content into String variables
		switch(computerNum)
		{
			case 0: computer = "scissor"; break;
			case 1: computer = "rock"; break;
			case 2: computer = "paper"; break;
		}
		switch(userNum)
		{
			case 0: user = "scissor"; break;
			case 1: user = "rock"; break;
			case 2: user = "paper"; break;
		}
		
		//calculating result
		int number = userNum - computerNum; 
		switch(number)
		{
			case -2:reSovle = " You won!";break;
			case 1:reSovle = " You won!";break;
			case -1:reSovle = " You lost!";break;
			case 2:reSovle = " You lost!";break;
		}
		
		//Output result
		if(userNum == computerNum)
		{
			System.out.println("The computer is "+computer+" . "+"You are "+user+" too. It is a draw");
		}
		else
		{
			System.out.println("The computer is "+computer+" . "+"You are "+user+". "+reSovle);
		}
		

	}

}
