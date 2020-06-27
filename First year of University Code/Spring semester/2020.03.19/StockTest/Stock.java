//This is a stock object
public class Stock 
{
	//Create required variables
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	//Construction method with stock code and name
	public Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	//Return stock price change rate
	public double getChangePercent()
	{
		double percentage = ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
		return percentage;
	}
}
