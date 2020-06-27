import java.util.Scanner;

/**
 * This program can specify the output of an array of subscripts, and can receive and throw array subscript exceptions
 */

/**
 * @author apple
 *
 */
public class TestArrayIndexOutOfBoundsException 
{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException 
	{
		//Randomly create an array of length 100
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		for(int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()*100+1);
		}
		
		//Pass array
		searchArray(array);
	}
	
	//Method that can output specified subscript array
	public static void searchArray(int[] array) throws ArrayIndexOutOfBoundsException
	{
		//Prompt user for subscript to search
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		
		//Throw and receive exceptions by judging statements
		if(index <= array.length-1)
		{
			System.out.println("The element is "+array[index]);
		}
		else
		{
			System.out.println(new ArrayIndexOutOfBoundsException(index));
			searchArray(array);
		}
	}

}
