package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test03 
{
	public static void main(String[] args)
	{
		try 
		{
			testBufferedInputStream();
			testBufferedOutputStream();
			copyFile();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *�����ֽ�������
	 *BufferedInputStream 
	 * @throws FileNotFoundException 
	 */
	public static void testBufferedInputStream() throws Exception
	{
		//�ļ��ֽ�����������
		FileInputStream in = new FileInputStream("C:\\Users\\apple\\Desktop\\name1.txt");
		
		//���ļ��ֽ��������ŵ������ֽ�����������
		BufferedInputStream br = new BufferedInputStream(in);
		
		byte[] b = new byte[10];
		int len = 0;
		while((len = br.read(b)) != -1)
		{
			System.out.println(new String(b,0,len));
		}
		
		//�ر���
		br.close();
		in.close();
	}
	
	/**
	 *�����ֽ������
	 *BufferedOutputStream 
	 * @throws FileNotFoundException 
	 */
	public static void testBufferedOutputStream() throws Exception
	{
		//�����ֽ��������
		FileOutputStream fo = new FileOutputStream("C:\\Users\\apple\\Desktop\\out.txt");
		
		//���ֽ����������ŵ������ֽ��������
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		String s = "world";
		
		//д���ڴ���
		bo.write(s.getBytes());
		
		//ˢ��Ӳ����
		bo.flush();
		
		//�ر���
		bo.close();
		fo.close();		
	}
	
	/**
	 *������ʵ���ļ��ĸ���
	 * @throws FileNotFoundException 
	 */
	public static void copyFile() throws Exception
	{
		//����������
		BufferedInputStream br = new BufferedInputStream(new FileInputStream("C:\\Users\\apple\\Desktop\\out.txt"));
	
		//���������
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\apple\\Desktop\\cc\\tt6.txt"));
		
		byte[] b = new byte[10];
		int len = 0;//����һ��ÿ�ζ�ȡ�������ݵĳ��ȣ�ֱ��br.read����ִ�е���󣨱����и�hello world��Ҫ��ȡ��d֮�󣬲����������
		while((len=br.read(b)) != -1)
		{
			//д���ڴ���
			bo.write(b,0,len);
		}
		
		//ˢ��Ӳ����
		bo.flush();
		
		//�ر���
		bo.close();
		br.close();
		
		
	
	}
}
