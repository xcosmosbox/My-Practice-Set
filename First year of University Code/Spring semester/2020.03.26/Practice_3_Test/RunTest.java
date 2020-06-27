/**
 * This program can create a fan class. 
 * This program can set the color, radius, speed and switch of the fan class. 
 * Finally, we can get the basic information.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/19
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		//First fan class
		FanClass fan_01 = new FanClass();
		fan_01.setSpeed(fan_01.FAST);
		fan_01.setRadius(10);
		fan_01.setColor("yellow");
		fan_01.setOn(true);
		System.out.println(fan_01.toString());
		
		//Space next line
		System.out.println();
		
		//Second fan class
		FanClass fan_02 = new FanClass();
		fan_02.setSpeed(fan_02.MEDIUM);
		fan_02.setRadius(5);
		fan_02.setColor("blue");
		System.out.println(fan_02.toString());
		
	}

}
