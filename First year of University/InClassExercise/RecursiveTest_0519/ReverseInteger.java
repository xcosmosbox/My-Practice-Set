import java.util.Scanner;

public class ReverseInteger
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		reverseInteger(num);
	}
	
	public static void reverseInteger(int num)
	{
		if(num < 10)
		{
			System.out.println(num);
		}
		else
		{
			System.out.print(num%10);
			reverseInteger(num/10);
		}
	}

}
