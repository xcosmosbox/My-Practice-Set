/**
 *This program can display the population for each of the next five years
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/25
 * @version 1.0
 */ 
public class PopulationProjection_5 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Define variables and the number of seconds in a year.
		double population = 312032486.0;

		double One_year_seconds = 31536000.0; 
		double birth;
		double death;
		double immigrant;
		
		//Output results using continuous loops
		for (int Year = 1; Year < 6; Year++) 
		{
			/*The birth, death and immigration population were calculated 
			  and the variables were assigned.
			 */
			birth = One_year_seconds / 7;
			death = One_year_seconds / 13;
			immigrant = One_year_seconds / 45;
			population = population + birth - death  +immigrant;
			
			//Output of the results using selection statements
			if (Year == 1) 
			{
				System.out.println("1st year: "+population);
			}
			else if (Year ==2)
			{
				System.out.println("2nd year: "+population);
			}
			else if (Year ==3)
			{
				System.out.println("3rd year: "+population);
			}
			else if (Year ==4)
			{
				System.out.println("4th year: "+population);
			}
			else if (Year ==5)
			{
				System.out.println("5th year: "+population);
			}

		}
		
	}

}
