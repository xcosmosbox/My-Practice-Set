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
		//���ʹ��˵��
		System.out.println("��ӭ�鿴��Ϣ������Ϊʹ��˵����");
        System.out.println("˵��1��0���������Ϣ��1���������Ϣ��");
        System.out.println("˵��2���ڶ�����Ϣ�У�");
        System.out.print('\t');
        System.out.println("0�����Ҷ�CST����⣬1����������Ϣ��");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print('\n');
        
        //����ʹ��
        System.out.print("�����������˽����Ϣ��");
        int info_first = scanner.nextInt();
        
        int �� = 1;
        //�жϼ������Ϣ�Ƿ�Ϸ�
        if(info_first != 0 & info_first != 1)
        {
            System.out.println("���������Ϣ��ѯĿ¼����");
            return;
        }
        
        
        //������Ϣ�Ϸ���������
        if(info_first == 0)
        {
            System.out.println("Pinyin Name��Yuxiang FENG");
            System.out.println("Student ID��194602104858");
            System.out.println("Session ID��2");
            System.out.println("One of my Hobbies��Play badminton.");
            System.out.print("One of my Expectations about this course:");           
            System.out.println("I hope I can quickly learn how to write a complete APP in this course.");
        }
        else if(info_first == 1)
        {
        	System.out.print("�����������˽�Ķ�����Ϣ��");
            int info_secondly = scanner.nextInt();
            
            if(info_secondly != 0 & info_secondly != 1)
            {
                System.out.println("���������Ϣ��ѯĿ¼����");
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
