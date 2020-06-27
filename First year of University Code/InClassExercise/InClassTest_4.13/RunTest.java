import java.util.Scanner;

public class RunTest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Array search
		int[] a = {1,2,3,4,5,6,7,};
		int targetValue = 6;
		ListSearch(a,targetValue);
		
		//Array sort
		String[] name = {"frank","able","c","a","e"};
		Sort(name);
	}
	
	public static  void ListSearch(int[] list, int targetValue)
	{
		//List is empty
		if(list.length <= 0)
		{
			System.out.println("Declare search a failure \n" );
		}
		else
		{
			//Select the first entry in List to be TestEntry
			int testEntry = list[0];
			int i = 0;
			while(targetValue > testEntry && i<list.length-1)
			{
				//Select the next entry in List as TestEntry
				testEntry = list[i+1];
			}
				
			if(targetValue == testEntry)
			{
				System.out.print("Declare search a success \n");
			}
			else
			{
				System.out.print("Declare search a failure \n");
			}
		}
		
	}

	
	public static void Sort(String[] list)
	{
		int n = 2;
		while(n < list.length)
		{
			//Pivot = Nth entry in List
			String pivot = list[n];
			
			//Remove Nth entry leaving a hole in List
			String temp = pivot;
			
			//there is an Entry above the hole and Entry > Pivot
			while(list[n-1] != null && list[n-1].charAt(0) > pivot.charAt(0))
			{
				list[n] = list[n-1];
				//Move Entry down into the hole leaving a hole in the list above the Entry

			}
			list[n-1] = temp;
			n++;
		}
	}
	
}
