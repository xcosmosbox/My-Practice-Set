/**
 *This program can picking a card from a deck of 52 cards.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/10/15
 * @version 1.0
 */ 
public class PickCard_9 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//random picking a card 
		int card = (int)(Math.random()*13+1);
		int number = (int)(Math.random()*4+1);
		String cardWord = null;
		String numberWord = null;
		
		//output result
		switch(card)
		{
			case 1:cardWord = "Ace";break;
			case 2:cardWord = "1";break;
			case 3:cardWord = "2";break;
			case 4:cardWord = "3";break;
			case 5:cardWord = "4";break;
			case 6:cardWord = "5";break;
			case 7:cardWord = "6";break;
			case 8:cardWord = "7";break;
			case 9:cardWord = "8";break;
			case 10:cardWord = "9";break;
			case 11:cardWord = "Jack";break;
			case 12:cardWord = "Queen";break;
			case 13:cardWord = "King";break;		
		}
		switch(number)
		{
			case 1:numberWord = "Clubs";break;
			case 2:numberWord = "Diamonds";break;
			case 3:numberWord = "Hearts";break;
			case 4:numberWord = "Spades";break;
		}
		
		System.out.println("The card you picked is "+cardWord+" of "+numberWord);

	}

}
