//A fan class
public class FanClass 
{
	//Three speed constants
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	//Set the default value of the variable
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	//A construction method without parameters
	public FanClass()
	{
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	//Accessors and modifiers for speed, on, color, and radius
	public int getSpeed() 
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{	if(speed  == 1)
		{
			this.speed = SLOW;
		}
		else if(speed == 2)
		{
			this.speed = MEDIUM;
		}
		else if(speed == 3)
		{
			this.speed = FAST;
		}
		else
		{
			System.out.println("The data you entered does not conform to the rules, please re-enter it.");
		}
		
	}
	public boolean isOn() 
	{
		return on;
	}
	public void setOn(boolean on) 
	{
		this.on = on;
	}
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	//String group to return fan information
	public String toString()
	{
		if(on == false)
		{
			return "The fan color is "+color+".\n"
					+"The fan radius is "+radius+".\n"
							+ "Info: "+"fan is off";
		}
		else
		{
			return "The fan speed is "+speed+".\n"
					+"The color is "+color+".\n"
							+"The fan radius is "+radius+".\n"
									+"Info: fan is on";
		}
	}
	
	
}
