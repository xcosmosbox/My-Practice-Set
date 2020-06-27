import java.util.ArrayList;

/**
 *	 This is a class of simulation stack
 */
public class MyStack extends ArrayList<Object>
{
	
	//Determine if the stack is empty
	public boolean isEmpty()
	{
		return super.isEmpty();
	}
	
	//Get the length of the stack
	public int getSize()
	{
		return super.size();
	}
	
	//Returns the top of stack element without deleting it
	public Object peek()
	{
		return super.get(this.getSize()-1);
	}
	
	//Return the top of stack element and delete it
	public Object pop()
	{
		Object o = super.get(this.getSize()-1);
		super.remove(this.getSize()-1);
		return o;
	}
	
	//Pressing stack
	public void push(Object o)
	{
		super.add(o);
	}
	
	//Output information
	public String toString()
	{
		return "stack: "+super.toString();
	}
}
