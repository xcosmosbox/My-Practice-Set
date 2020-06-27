import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is a program that can remove duplicate data from an array with a length of ten
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/14
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest
{
	public static void main(String[] args) 
	{
		//Prompt user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten integers: ");

		//Enter ten integer data
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
		{
			list.add(input.nextInt());
		}
		
		//Using remove class to delete duplicates
		RemoveDuplicates duplicates = new RemoveDuplicates();
		RemoveDuplicates.removeDuplicate(list);
		System.out.print("The distinct integers are: ");
		for(Integer arrNum : list)
		{
			System.out.print(arrNum+" ");
		}

	}

}
