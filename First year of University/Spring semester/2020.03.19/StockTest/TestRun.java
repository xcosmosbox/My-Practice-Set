/**
 * This program can create a stock object and get the change rate of a stock.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/13
 * @version 1.0
 * @teacher Mike , Tim
 */
public class TestRun 
{
	public static void main(String[] args) 
	{
		//Creat stock object
		Stock stock_01 = new Stock("ORCL","Oracle Corporation");
		stock_01.previousClosingPrice = 34.5;
		stock_01.currentPrice = 34.35;
		
		//Change rate of output stock price
		System.out.println( "The stock code is: "+stock_01.symbol+"\n"+
							"The name of this stock is: "+stock_01.name);
		System.out.printf("%s%f%s","Its price change rate is: ",stock_01.getChangePercent(),"%");
				
	}

}
