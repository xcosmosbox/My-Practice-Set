/**
 * 
 */

/**
 * @author apple
 *
 */
public class RunTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		GoldenDelicious golden = new GoldenDelicious();
		McIntosh mc = new McIntosh();
		
		System.out.println(fruit instanceof Fruit);
		System.out.println(fruit instanceof Orange);
		System.out.println(fruit instanceof Apple);
		System.out.println(fruit instanceof GoldenDelicious);
		System.out.println(fruit instanceof McIntosh);
		System.out.println(orange instanceof Orange);
		System.out.println(orange instanceof Fruit);
		//System.out.println(orange instanceof Apple); 前后必须有继承或接口的关系
		
		// fruit.makeAppleCider(); It's error//
		((Apple)fruit).makeAppleCider(); 
		
		McIntosh p = (McIntosh) new Apple();
		Apple a = new McIntosh();
		
		

	}

}
