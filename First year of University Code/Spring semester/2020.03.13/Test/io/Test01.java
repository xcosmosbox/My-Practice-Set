package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 
{
	public static void main(String[] args)
	{
		copyFile();
	}

	/**
	 * ����ͼƬ��ָ��λ��
	 * ����ʹ��while���������õ���byte����ĳ��ȣ���Ϊ��ÿ��ȡ��ȡ���ξ�д������
	 * ���Բ���������鳤�Ȳ��������ļ����Ʋ����������
	 */
	public static void copyFile()
	{
		try 
		{
			//��ȡ���ļ�
			FileInputStream in = new FileInputStream("C:\\Users\\apple\\Desktop\\jg.png");
			//��Ҫ���Ƶ���λ��
			FileOutputStream out= new FileOutputStream("C:\\Users\\apple\\Desktop\\bb\\immg.jpg");
			
			//��ȡ�ļ�
			byte[] b = new byte[100];
//			in.read(b);//ԭʼ�������������
			int len = 0;
			while((len = in.read(b)) != -1)
			{
				out.write(b,0,len);//����i��д�Ļ������飬����j�Ǵ�������Ǹ�λ�ÿ�ʼ������k�ǻ�ȡ��������ܳ���
				
			}
			
			//д���ļ�
//			out.write(b);//ԭʼ�������������
			out.flush();//��д���ڴ������ˢ��Ӳ��
			/*ʵ���ϣ���дflush������ֻдwrite����Ҳ��ͬ�����Գɹ��ģ�
			 * flush������Ŀ���Ǳ�֤�ڴ�������ǿ�ƹرգ��������ݶ��벻����
			 */
			
			//���ιر��������������Ϊ������Ǻ������ģ�����Ҫ�ȹر�
			out.close();
			in.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * �ļ��ֽ�������
	 */
	public static void testFileInputStream()
	{
		try 
		{
			FileInputStream in = new FileInputStream("C:\\Users\\apple\\Desktop\\name1.txt");
			byte[] b = new byte[10];//����һ��������ն�ȡ���ļ�����
			
			//��ȡ������ļ�
			in.read(b);
			System.out.println(new String(b));
			
			in.close();//ע�⣬����ʹ����Ϻ�Ҫ�ر�
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * �ļ��ֽ������
	 */
	public static void testFileOutputStream()
	{
		try 
		{
			//ָ����һ���ļ������
			FileOutputStream out= new FileOutputStream("C:\\Users\\apple\\Desktop\\out.txt");
			String str = "kkksss";
			out.write(str.getBytes());//������д���ڴ�
			out.flush();//���ڴ��е�����ˢд��Ӳ��
			out.close();//�ر���
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}