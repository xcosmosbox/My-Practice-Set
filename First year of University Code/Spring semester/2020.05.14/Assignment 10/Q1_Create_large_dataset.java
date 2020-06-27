import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 * This program can output the information of 1000 employees to a specified text file, and the salary is a random value within the specified range.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/05/14
 * @version 1.0
 * @teacher Mike , Tim
 */
public class Q1_Create_large_dataset 
{
	public static void main(String[] args) throws Exception 
	{
		//create a file
		File file = new File("Salary.txt");
		
		//Verify that the file exists
		if(file.exists())
		{
			System.out.println("File already exists");
			System.exit(1);
		}
		
		//Create output stream
		PrintWriter output = new PrintWriter(file);
		
		//Start calling method to create employee information and output flow
		int line = 1;
		for(int i=0; i<1000; i++)
		{
			int staff = (int)(Math.random()*3);
			output.println(randomStaff(line,staff));
			line++;
		}
		
		//Close flow
		output.close();
		System.out.println("Table created!");
		
	}
	
	/**
	 *	This method can judge which employee information should be created by the received parameters 
	 */
	public static String randomStaff(int line, int staff)
	{
		if(staff == 0)
		{
			return randomAssistant(line);
		}
		else if(staff == 1)
		{
			return randomAssociate(line);
		}
		else
		{
			return randomFull(line);
		}
	}
	
	//Three ways to create the specified employee information
	//Using the decimalformat method to create a floating-point number of specified digits
	public static String randomAssistant(int line)
	{
		double salary = Math.random()*30000+50000;
        DecimalFormat endSalary = new DecimalFormat("#####.##");
        String str = endSalary.format(salary);
       
        return ("FirstName"+line+" LastName"+line+" assistant "+str);
	}
	public static String randomAssociate(int line)
	{
		double salary = Math.random()*50000+60000;
        DecimalFormat endSalary = new DecimalFormat("#####.##");
        String str = endSalary.format(salary);
        
        return ("FirstName"+line+" LastName"+line+" associate "+str);
	}
	public static String randomFull(int line)
	{
		double salary = Math.random()*55000+75000;
        DecimalFormat endSalary = new DecimalFormat("#####.##");
        String str = endSalary.format(salary);

        return ("FirstName"+line+" LastName"+line+" Full "+str);
	}

}
