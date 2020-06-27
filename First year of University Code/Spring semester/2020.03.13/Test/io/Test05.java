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
		//创建一个接收键盘输入数据的输入流
		InputStreamReader is = new InputStreamReader(System.in);
		
		//把输入流放入到缓冲流里
		BufferedReader br = new BufferedReader(is);
		
		//定义一个临时接收数据的字符串
		String str = "";
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
	}
	
	/**
	 *把控制台的输入的内容，写到指定的txt文件中，当接收到字符串over，结束程序 
	 */
	public static void write2TXT() throws Exception
	{
		//创建一个接收键盘输入数据的输入流
		InputStreamReader is = new InputStreamReader(System.in);
		
		//把输入流放入到缓冲流里
		BufferedReader br = new BufferedReader(is);
		
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\apple\\Desktop\\cc\\tt7.txt"));
		
		String line = "";
		
		while((line = br.readLine()) != null )
		{
			if(line.equals("over"))
			{
				break;
			}
			//读取每一行，都写入到指定的txt文件 
			out.write(line);
		}
		
		out.flush();
		
		out.close();
		br.close();
		is.close();
		
	}
}
