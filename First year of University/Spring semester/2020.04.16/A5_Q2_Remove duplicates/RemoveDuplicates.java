import java.util.ArrayList;

/**
 *	 This is a class that can remove duplicates from the array list
 */
public class RemoveDuplicates 
{
	//no-args construction method
	public RemoveDuplicates() {}

	//Remove duplicates numbers
	public static void removeDuplicate (ArrayList<Integer> list)
	{
		for(int i=0; i<list.size()-1; i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i) == list.get(j))
				{
					list.remove(j);
				}
			}
		}
	}

}
