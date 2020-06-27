import java.util.ArrayList;
import java.util.Scanner;

public class CombineLists {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list_1 = new ArrayList<>();
		System.out.print("Enter 5 integer for list1: ");
		for(int i=0; i<5; i++)
		{
			list_1.add(input.nextInt());
		}
		ArrayList<Integer> list_2 = new ArrayList<>();
		System.out.print("Enter 5 integer for list2: ");
		for(int i=0; i<5; i++)
		{
			list_2.add(input.nextInt());
		}
		
		ArrayList<Integer> list_3 = union(list_1,list_2);
		System.out.print("The combined list is ");
		for(int i=0; i<list_3.size(); i++)
		{
			System.out.print(list_3.get(i)+" ");
		}
	}
	
	public static ArrayList<Integer> union ( ArrayList<Integer> list_1, ArrayList<Integer> list_2 )
	{
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<list_1.size(); i++)
		{
			result.add(list_1.get(i));
		}
		
		for(int i=0; i<list_2.size(); i++)
		{
			result.add(list_2.get(i));
		}
		return result;
	}
	
}
