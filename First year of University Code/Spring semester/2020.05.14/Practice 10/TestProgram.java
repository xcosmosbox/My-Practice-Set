import java.io.File;
import java.net.URL;
import java.util.Scanner;

/**
 *	The program searches for the number of times the word "computer" appears in five Web addresses. 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/14
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestProgram 
{
	public static void main(String[] args) throws Exception 
	{
		//Read web address in Notepad
		File file = new File("urls.txt");
		Scanner input = new Scanner(file);
		
		//Search for the specified word
		while(input.hasNext())
		{
			String startURL = input.nextLine();
			System.out.println("The URL: "+startURL+" will be searched computer word.");
			search(startURL,"computer");
		}
	}
	
	//This method can be used to search for specific words
	public static void search(String startURL, String target)
	{
		try 
		{
			//Initialize variables and open web address
			URL url = new URL(startURL);
			Scanner input = new Scanner(url.openStream());
			int count = 0;
			int index = 0;
			while(input.hasNext())
			{
				String str = input.next();
				
				//Use indexof method to intercept the position of each occurrence, and add one times
				while((index = str.indexOf(target,index)) != -1)
				{
					count++;
					index += target.length();
				}
			}
			System.out.println("This word appears "+count+" times");
		}
		catch(java.net.MalformedURLException e)
		{
			System.out.println("Invalid URL");
		}
		catch(java.io.IOException e)
		{
			System.out.println("I/O Errors: no such file");
		}
	}

}
