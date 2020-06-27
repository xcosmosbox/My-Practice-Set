/**
 * 
 */

/**
 * @author apple
 *
 */
public class RunTest 
{

	public static void main(String[] args) 
	{
		Object[] object = {new Celery(), new Cabbage()};
		for(int i=0; i<object.length; i++)
		{
			if(object[i] instanceof Edible)
			{
				System.out.println(((Edible) object[i]).howToEat());
				System.out.println(((Edible) object[i]).howToMake());
			}
			
			if(object[i] instanceof Vegetatbles)
			{
				System.out.println(((Vegetatbles) object[i]).access());
			}
		}
		
		
		Vagetable vegetatbles = new Vagetable();
		Fruit fruit = new Fruit();
		System.out.println(vegetatbles instanceof Edible);
	}

}
