package io;

import java.io.FileReader;
import java.io.FileWriter;

public class Test02 
{
	public static void main(String[] args)
	{
		copyFile("C:\\Users\\apple\\Desktop\\name1.txt","C:\\Users\\apple\\Desktop\\cc\\tt5.txt");
	}
	
	/**
	 *�ļ��ַ������� 
	 */
	public static void testFileReader(String inPath)
	{
		try 
		{
			//�����ļ��ַ��������Ķ���
			FileReader fr = new FileReader(inPath);
			
			//������ʱ������ݵ��ַ�����
			char[] ch = new char[10];
			
			int len = 0;
			while((len = fr.read(ch)) != -1)
			{
				System.out.println(new String(ch, 0, len));	
			}
		
			//�ر���
			fr.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *�ļ��ַ������ 
	 */
	public static void testFileWriter(String text, String outPath)
	{
		try 
		{
			FileWriter fw = new FileWriter(outPath);
			
			//д���ڴ���
			fw.write(text);
			
			//���ڴ������ˢ��Ӳ��
			fw.flush();
			
			//�ر���
			fw.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * �ַ��������ļ�
	 * �ַ���ֻ�ʺϲ����������ַ����ļ�
	 */
	public static void copyFile(String inPath, String outPath) 
	{
		
		try 
		{
			FileReader fr = new FileReader(inPath);
			FileWriter fw = new FileWriter(outPath);
			
			char[] ch = new char[10];
			
			//��ȡ����
			int len = 0;
			while((len = fr.read(ch)) != -1)
			{
				fw.write(ch,0,len);//д������
			}
			
			fw.flush();
			
			fw.close();
			fr.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}