import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CrawlHigher 
{
	public static void main(String[] args) throws Exception 
	{
		//
		System.out.println("You will start traversing and crawling information from the following five URL: ");
		String[] url_Start = new String[5];
		File file = new File("startCrawlURL.txt");
		Scanner input = new Scanner(file);
		for(int i=0; i<url_Start.length; i++)
		{
			url_Start[i] = input.next();
			System.out.println(url_Start[i]);
		}
		System.out.println("---------------------------------------------------------------------------------");
	
		//
		for(int i=0; i<url_Start.length; i++)
		{
			crawler(url_Start[i]);
		}
		
	
	
	
	
	
	}
	
	/*
	 * 
	 */
	public static void crawler(String startingURL)
	{
		
	}
	
	

}
