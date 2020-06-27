/**
 * 
 */

/**
 * @author apple
 *
 */
public class Not5And3 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int count = 0;//一行的计数器
		int m =0;
		for(int i=1; i<=10000 ; i++)
		{
			
			if(i%3==0 || i%5==0) continue;
			else
			{
				System.out.print(i);
				System.out.print('\t');
				count++;
			}
			
			if(count == 20)
			{
				System.out.print('\n');
				count=0;//归零
			}
		}

	}

}
