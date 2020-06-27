/**
 *This program can print out my information.
 */

/**
 * @author Yuxiang Feng (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 2
 * @date 2019/9/19
 * @version 1.0
 */
public class DisplayInfo_YuxiangFeng 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//输出使用说明
		System.out.println("欢迎查看信息，以下为使用说明：");
        System.out.println("说明1：0代表基本信息，1代表额外信息。");
        System.out.println("说明2：在额外信息中：");
        System.out.print('\t');
        System.out.println("0代表我对CST的理解，1代表神秘信息。");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print('\n');
        
        //键入使用
        System.out.print("请输入您想了解的信息：");
        int info_first = scanner.nextInt();
        
        int 人 = 1;
        //判断键入的信息是否合法
        if(info_first != 0 & info_first != 1)
        {
            System.out.println("您输入的信息查询目录有误！");
            return;
        }
        
        
        //键入信息合法则按类别输出
        if(info_first == 0)
        {
            System.out.println("Pinyin Name：Yuxiang FENG");
            System.out.println("Student ID：194602104858");
            System.out.println("Session ID：2");
            System.out.println("One of my Hobbies：Play badminton.");
            System.out.print("One of my Expectations about this course:");           
            System.out.println("I hope I can quickly learn how to write a complete APP in this course.");
        }
        else if(info_first == 1)
        {
        	System.out.print("请输入您想了解的额外信息：");
            int info_secondly = scanner.nextInt();
            
            if(info_secondly != 0 & info_secondly != 1)
            {
                System.out.println("您输入的信息查询目录有误！");
                return;
            }
            
            if(info_secondly == 0 )
            {
            	System.out.println("My understanding of CST: the use of computer science and technology to solve all problems of the discipline.");
            }
            else
            {
            	System.out.println("I hope I can get full marks in this assignment. :)");
            }
        }
        
	}

}
