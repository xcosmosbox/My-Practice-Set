package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Test05 
{
	public static void main(String[] args)
	{
		try 
		{
			testSystemIn();
			write2TXT();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void testSystemIn() throws Exception
	{
		//����һ�����ռ����������ݵ�������
		InputStreamReader is = new InputStreamReader(System.in);
		
		//�����������뵽��������
		BufferedReader br = new BufferedReader(is);
		
		//����һ����ʱ�������ݵ��ַ���
		String str = "";
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
	}
	
	/**
	 *�ѿ���̨����������ݣ�д��ָ����txt�ļ��У������յ��ַ���over���������� 
	 */
	public static void write2TXT() throws Exception
	{
		//����һ�����ռ����������ݵ�������
		InputStreamReader is = new InputStreamReader(System.in);
		
		//�����������뵽��������
		BufferedReader br = new BufferedReader(is);
		
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\apple\\Desktop\\cc\\tt7.txt"));
		
		String line = "";
		
		while((line = br.readLine()) != null )
		{
			if(line.equals("over"))
			{
				break;
			}
			//��ȡÿһ�У���д�뵽ָ����txt�ļ� 
			out.write(line);
		}
		
		out.flush();
		
		out.close();
		br.close();
		is.close();
		
	}
}
