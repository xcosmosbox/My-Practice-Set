public class MathExercise
{
	public static void main(String[] args)
	{
//		java.util.Scanner input = new java.util.Scanner(System.in);
//		int wrongNum = 0;
//		int correctNum = 0;
//		
//		for(int times=0; times<100; times++)
//		{
//			int number01 = (int)(Math.random()*10);
//			int number02 = (int)(Math.random()*10);
//			System.out.print("What is "+number01+" + "+number02+" ?"+'\n'+"Please input your aswer: ");
//			int answer = input.nextInt();
//			
//			if(number01+number02 == answer)
//			{
//				System.out.println("You got it!");
//				correctNum++;
//			}
//			else
//			{
//				System.out.println("Wrong answer! Try again!");
//				wrongNum++;
//			}
//		}
//		String c = "";
//		char a = 'A';
//		int b = a;
//		
//		System.out.println(c);
//		System.out.println(b);
		
		first:   for(int i=0; i<5 ;i++)
		{
			System.out.println("ͬ־�Ǻã�ͬ־�������ˣ�");
			for(int j=0; j<3 ;j++)
			{
				System.out.println("�׳��ã�������!");
			}
			System.out.println("-------------------------");
		}
		
		
		second:for(int i=0; i<5 ;i++)
		{
			System.out.println("ͬ־�Ǻã�ͬ־�������ˣ�");
			int j =0;
			while(j<3)
			{
				j++;
				System.out.println("�׳��ã�������!");
			}
			System.out.println("-------------------------");
		}
		
		
		third:for(int i=0; i<5 ;i++)
		{
			System.out.println("ͬ־�Ǻã�ͬ־��������!");
			int j =0;
			do 
			{
				
				System.out.println("�׳��ã�������! ");
				j++;
			}
			while(j<3);
				
			System.out.println("-------------------------");
		}
		
		
	}
}