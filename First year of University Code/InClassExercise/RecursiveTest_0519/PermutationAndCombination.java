import java.util.ArrayList;
import java.util.Scanner;

public class PermutationAndCombination 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please input string: ");
		String str = input.next();
		permutation(str);
	}
	
	public static void permutation(String str)
	{
		ArrayList<String> list = new ArrayList<>();
		char[] chToStr = str.toCharArray();
		combination(chToStr,0,list);
		
		for(String s : list)
		{
			System.out.println(s);
		}
	}
	
	public static void combination(char[] chToStr, int i, ArrayList<String> list)
	{
		if(i == chToStr.length-2)
		{
			String temp = "";
			for(int m=0; m<chToStr.length-2; m++)
			{
				temp += chToStr[m];
			}
			
			list.add(temp+chToStr[chToStr.length-2]+chToStr[chToStr.length-1]);
			list.add(temp+chToStr[chToStr.length-1]+chToStr[chToStr.length-2]);
		}
		else
		{
			for(int j=i; j<chToStr.length; j++)
			{
				char temp = chToStr[j];
				chToStr[j] = chToStr[i];
				chToStr[i] = temp;
				
				combination(chToStr,i+1,list);
				
				temp = chToStr[j];
				chToStr[j] = chToStr[i];
				chToStr[i] = temp;
			}
		}
	}

}
