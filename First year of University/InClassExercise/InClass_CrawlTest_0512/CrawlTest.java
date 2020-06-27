import java.util.Scanner;

public class CrawlTest 
{
	public static void main(String[] args) 
	{
		//
		System.out.print("Enter a URL: ");
		String URLString = new Scanner(System.in).next();
		System.out.print("Enter you want to know word: ");
		String word = new Scanner(System.in).next();
		int count = 0;
		
		//
		try 
		{
			java.net.URL url = new java.net.URL(URLString);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext())
			{
				String line = input.next();
				if(line.indexOf(word) != -1)
				{
					count++;
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
