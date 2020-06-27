/**
 * This program can create a queue, add integer value to the queue, and finally output the whole queue.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/03/27
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTest 
{
	public static void main(String[] args) 
	{
		// Create queue class
		Queue<Integer> queue = new Queue<>();
		
		// Add integer number to queue
		for(int i=1; i<=20; i++)
		{
			queue.enqueue(i);
		}
		
		// Output the value of the entire queue
		System.out.print("The queue is: ");
		while(!queue.empty())
		{
			System.out.print(queue.dequeue()+" ");
		}
	}

}
