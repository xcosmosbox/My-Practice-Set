/**
 * 
 */

/**
 * @author apple
 *
 */
public class RunTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		StudentClass s1 = new  StudentClass();
		s1.setAge(10);
		s1.setScore(100);
		System.out.println("The age is: "+s1.getAge());
		System.out.println("The score is: "+s1.getScore());
		System.out.println("The rate is: "+s1.getRate());
		
		
		StudentClass s2 = new  StudentClass();
		s2.setAge(20);
		s2.setScore(333);
		System.out.println("The age is: "+s2.getAge());
		System.out.println("The score is: "+s2.getScore());
		System.out.println("The rate is: "+s2.getRate());
		
		
		StudentClass s3 = new  StudentClass();
		s3.setAge(67);
		s3.setScore(92);
		System.out.println("The age is: "+s3.getAge());
		System.out.println("The score is: "+s3.getScore());
		System.out.println("The rate is: "+s3.getRate());
	}

}
