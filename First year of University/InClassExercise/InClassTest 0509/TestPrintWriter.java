import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/09
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestPrintWriter 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("test2.txt");
		if(file.exists())
		{
			System.out.println("File already exists");
			System.exit(1);
		}
		
		PrintWriter output = new PrintWriter(file);
		
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);	
		output.println(85.4343);
		output.print(true);	
		output.println('a');
		output.print(file);	
		
		output.close();
	}

}
