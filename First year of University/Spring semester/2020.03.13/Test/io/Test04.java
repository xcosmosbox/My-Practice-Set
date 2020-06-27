package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test04 
{
	public static void main(String[] args)
	{
		try 
		{
			testInputStreamReader();
			testOutputStreamWriter();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ת��������
	 * ע�⣬��ת���ַ������ʺϣ����õ��ַ����뼯Ҫ���ȡ���ļ������ݵı���һ��
	 * ��Ȼ���������
	 * */
	public static void testInputStreamReader() throws Exception
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\apple\\Desktop\\name1.txt");
	
		//���ֽ���ת�����ַ���
		//����1���ֽ���������2�Ǳ���
		InputStreamReader in = new InputStreamReader(fs,"GBK");
	
		//
		char[] c = new char[100];
		int len = 0;
		while((len = in.read(c)) != -1)
		{
			System.out.println(new String(c,0,len));
		}
		
		//�ر���
		in.close();
		fs.close();
	}
	
	/**
	 * ת���ֽ����Ϊ�ַ������
	 * ע�⣬��ת���ַ������ʺϣ����õ��ַ����뼯Ҫ���ȡ���ļ������ݵı���һ��
	 * ��Ȼ���������
	 * **/
	public static void testOutputStreamWriter() throws Exception
	{
		FileOutputStream out = new FileOutputStream("C:\\Users\\apple\\Desktop\\cc\\tt7.txt");
	
		OutputStreamWriter os = new OutputStreamWriter(out,"GBK");
		
		//�����ڴ棬ˢд����
		os.write("���");
		os.flush();
		
		//�ر���
		os.close();
		out.close();
		
	
	}
}
