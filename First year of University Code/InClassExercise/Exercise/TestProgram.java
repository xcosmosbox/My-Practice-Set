import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestProgram 
{

	public static void main(String[] args) throws Exception
	{
		//创建一个用来存储每一位学生的动态链表
		//动态链表的手动实现是很复杂的，我猜你那应该也有一个类似的
		//被包装好的实现（头文字）
		ArrayList<Students> stuList = new ArrayList<>();
		
		File file = new File("StudentsInputInfo.txt");
		Scanner input = new Scanner(file);//读数据
		
		//通过改变i让程序去读取时，给指定变量赋值，一行只有三个数据，
		//所以一行读取完，也就是i==3时，代表要改变为i=1，
		//这样下一行读取时才会是指定变量的赋值
		int i = 1;
		String id = "";
		String name = "";
		String faculty = "";
		while(input.hasNext())
		{
			if(i==1)
			{
				id = input.next();
				i++;
			}
			if(i==2)
			{
				name = input.next();
				i++;
			}
			if(i==3)
			{
				faculty = input.next();
				stuList.add( new Students(id,name,faculty) );
				i=1;
			}
		}
		
		//通过死循环来运行程序
		while(true)
		{
			//这个输出语句用来提示用户输出想要执行的指令
			System.out.println("1: Print a student assessment information");
			System.out.println("2: Output assessment information in the specified time period");
			System.out.println("3: Output total score sort in ascending order");
			System.out.println("4: Add assessment information of a specified student");
			System.out.println("5: Delete the assessment information of a specified student");
			System.out.println("6: Modify the assessment appraisal information of a student");
			System.out.println("7: Query the assessment assessment information of a student");
			System.out.println("8: Exit program");
			System.out.print("Please a number to you want run programming: ");
			Scanner inputNum = new Scanner(System.in);
			int TempNum = inputNum.nextInt();
			
			//通过if语句调用对应的方法，2~7如1中的if语句所示，
			//需要注意的是，6中涉及到对考核信息的修改，所有需要多加一个判断语句进行确认
			if(TempNum == 1) 
			{
				for(int m=0; m<stuList.size(); m++)
				{
					stuList.get(m).getAllAssessmentInfo();
				}
			}
			if(TempNum == 2) {}
			if(TempNum == 3) {}
			if(TempNum == 4) {}
			if(TempNum == 5) {}
			if(TempNum == 6) 
			{
				//输入想要修改的某个指定学生n的信息
				System.out.print("Want to modify the student's assessment information： ");
				int n = input.nextInt();
				
				//我猜到时候要查询的信息应该是以某个指定的信息格式，
				//到时候照着那个信息格式修改输入方法就行（利用 IO 处理txt中某个指定查询时段，并在这赋值）
				Date assessmentDate = new Date();
				int gradeNum = input.nextInt();
				PersonalAssessment setInfo = new PersonalAssessment(assessmentDate, gradeNum);
				
				//我这不知道该指定什么样的时间，所以我就随机创建一个了,记得修改
				Date date = new Date();
				
				//确认是否要修改
				System.out.print("Are you sure to modify it?(y/N): ");
				String sure = input.next();
				if(sure == "y")
				{
					stuList.get(n).assessmentInfoSet(date, setInfo);
				}
			
			}
			if(TempNum == 7) {}
			
			if(TempNum == 8)
			{
				//跳出这个while的死循环，结束程序
				break;
			}
		}

		input.close();
		
		/* return 0*/
		
		
	}

}
