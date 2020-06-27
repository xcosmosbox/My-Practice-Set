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
	 *文件字符输入流 
	 */
	public static void testFileReader(String inPath)
	{
		try 
		{
			//创建文件字符输入流的对象
			FileReader fr = new FileReader(inPath);
			
			//创建临时存放数据的字符数组
			char[] ch = new char[10];
			
			int len = 0;
			while((len = fr.read(ch)) != -1)
			{
				System.out.println(new String(ch, 0, len));	
			}
		
			//关闭流
			fr.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *文件字符输出流 
	 */
	public static void testFileWriter(String text, String outPath)
	{
		try 
		{
			FileWriter fw = new FileWriter(outPath);
			
			//写到内存中
			fw.write(text);
			
			//把内存的数据刷到硬盘
			fw.flush();
			
			//关闭流
			fw.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 字符流拷贝文件
	 * 字符流只适合操作内容是字符的文件
	 */
	public static void copyFile(String inPath, String outPath) 
	{
		
		try 
		{
			FileReader fr = new FileReader(inPath);
			FileWriter fw = new FileWriter(outPath);
			
			char[] ch = new char[10];
			
			//读取数据
			int len = 0;
			while((len = fr.read(ch)) != -1)
			{
				fw.write(ch,0,len);//写入数据
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