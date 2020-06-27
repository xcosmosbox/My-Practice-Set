/**
 * 
 */

/**
 * @author apple
 *
 */
public class exercise_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		char[] chars = creatArray();
		
		System.out.println("The lowercase letter are: ");
		displayArray(chars);
		
		int[] counts = countArray(chars);
		
		System.out.println();
		System.out.println("The occurrences of each letter are: ");
		displayCounts(counts);

	}
	
	public static char[] creatArray()
	{
		char[] chars = new char[100];
		for(int i=0; i<100; i++)
		{
			chars[i] = (char)(Math.random()*(123-97)+97);
		}
		return chars;
	}
	
	public static void displayArray(char[] chars)
	{
		for(int i=0; i<100; i++)
		{
			if((i+1)%20 == 0)
			{
				System.out.println(chars[i]);
			}
			else
			{
				System.out.print(chars[i]+" ");
			}
		}
	}
	
	public static int[] countArray(char[] chars)
	{
		int[] counts = new int[26];
		for(int i=0; i<chars.length; i++)
		{
			counts[chars[i] - 'a']++;
		}
		return counts;
	}
	
	public static void displayCounts(int[] counts)
	{
		for(int i=0; i<counts.length; i++)
		{
			if((i+1)%10 == 0)
			{
				System.out.println(counts[i]+" "+(char)('a'+i));
			}
			else
			{
				System.out.print(counts[i]+" "+(char)('a'+i) +"  ");
			}
		}
	}

}
