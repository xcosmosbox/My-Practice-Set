
public class CSO 
{

	public static void main(String[] args) 
	
	{
		int n = 9;
		if(n<9)
		{
			System.out.print(n);
			yyy(7);
		}
		else
		{
			yyy(2);
			System.out.print(n);
		}
	}
	
	public static void yyy(int n)
	{
		if(n<5)
		{
			System.out.print(n);
			zzz(6);
		}
		else
		{
			zzz(5);
		}
	}
	
	public static void zzz(int n)
	{
		if(n==5)
		{
			System.out.print(7);
		}
		else
		{
			System.out.print(8);
		}
	}

}
