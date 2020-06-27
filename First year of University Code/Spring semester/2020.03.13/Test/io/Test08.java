package io;

import java.io.RandomAccessFile;

/**
 *�ļ��������д
 *�������ֱ�������ļ�������λ�ý��ж�д�ļ� 
 */
public class Test08 
{
	public static void main(String[] args)
	{
		try 
		{
			//testRandomAccessFileRead();
			testRandomAccessFileWrite();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *������ļ�
	 */
	
	public static void testRandomAccessFileRead() throws Exception
	{
		//RandomAccessFile�Ĺ�������������������1�Ƕ�д���ļ���·��
		//����2��RandomAccessFile�ķ���ģʽ
		RandomAccessFile ra = new RandomAccessFile("C:\\Users\\apple\\Desktop\\tt7.txt","r");
		
		//���ö�ȡ�ļ����ݵ���ʼ��
		ra.seek(8);//ͨ�����ö�ȡ�ļ����ݵ���ʼ�㣬���ﵽ���ļ�������λ�ö�ȡ
		
		
		byte[] b =new byte[10];
		
		int len = 0;
		
		while((len = ra.read(b)) != -1)
		{
			System.out.println(new String(b,0,len));
		}
		
		ra.close();
	}
	
	public static void testRandomAccessFileWrite() throws Exception
	{
		RandomAccessFile ra = new RandomAccessFile("C:\\Users\\apple\\Desktop\\tt7.txt","rw");
	
		//����д����ʼ��
		//0����ӿ�ͷд
		//ra.seek(0);
		//ע�⣬����Ǵ��ļ���ͷ���м��ĳ��λ�ÿ�ʼд�Ļ����ͻ���д�����ݸ��ǵ��ȳ��ȵ�ԭ����
		
		//����д����ʼ�㣬ra.length()������ļ�������βд��Ҳ�����ļ���׷��
		ra.seek(ra.length());
		
		ra.write("���".getBytes());
		
		ra.close();
		
	}
}
