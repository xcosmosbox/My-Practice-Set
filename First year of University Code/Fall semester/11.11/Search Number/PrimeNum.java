/**
 * 
 */

/**
 * @author apple
 *
 */
public class PrimeNum 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
    {
        int count = 0;
        int time = 0;
        int lineTimes =0;
        
        for(int n=2;n<=10000;n++)
        {
            boolean isTrue = true;
            for(int t=n-1;t>1;t--)
            {
                if(n%t==0)
                {
                    isTrue = false;
                }
            }
            if(isTrue==true)
            {
                count++;
                System.out.print(n);
                System.out.print('\t');
                time += 1;
                lineTimes +=1;
            }
            if(time == 10)
            {
                System.out.print('\n');
                time = 0;
            }
            
            if(lineTimes == 50) break;
        }
        System.out.print('\n');
        System.out.println("count is "+count);
    }

}
