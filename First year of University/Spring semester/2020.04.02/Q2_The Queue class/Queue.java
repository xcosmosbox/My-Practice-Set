// This is a queue class. This class uses generics to ensure the security of data transfer.
public class Queue<Integer>
{
	//set variable
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
	
	//No-arg construction method, initializing array
	public Queue()
	{
		this.elements = new int[DEFAULT_CAPACITY];
	}
	
	//Add an integer to the queue
	public void enqueue(int v)
	{
		//Expand the array if the length exceeds the size of the array
		if(this.size >= this.elements.length)
		{
			int[] temp = new int[2*this.elements.length];
			System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
			this.elements = temp;
		}
		
		this.elements[this.size++] = v;
	}
	
	//Returns the value of the first bit of the queue and moves the entire queue one bit to the left.
	public int dequeue()
	{
		int tempValue = this.elements[0];
		
		for(int i=0; i<this.size-1; i++)
		{
			this.elements[i] = this.elements[i+1];
		}
		this.size -= 1;
		
		return tempValue;
	}
	
	//Judge whether the queue is empty
	public boolean empty()
	{
		return this.size==0;
	}
	
	//Get the length of the queue
	public int getSize()
	{
		return this.size;
	}
	
	
}
