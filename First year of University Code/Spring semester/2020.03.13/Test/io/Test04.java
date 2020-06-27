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
	 * 转换输入流
	 * 注意，在转换字符流的适合，设置的字符编码集要与读取的文件的数据的编码一致
	 * 不然会出现乱码
	 * */
	public static void testInputStreamReader() throws Exception
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\apple\\Desktop\\name1.txt");
	
		//把字节流转换成字符流
		//参数1是字节流，参数2是编码
		InputStreamReader in = new InputStreamReader(fs,"GBK");
	
		//
		char[] c = new char[100];
		int len = 0;
		while((len = in.read(c)) != -1)
		{
			System.out.println(new String(c,0,len));
		}
		
		//关闭流
		in.close();
		fs.close();
	}
	
	/**
	 * 转换字节输出为字符输出流
	 * 注意，在转换字符流的适合，设置的字符编码集要与读取的文件的数据的编码一致
	 * 不然会出现乱码
	 * **/
	public static void testOutputStreamWriter() throws Exception
	{
		FileOutputStream out = new FileOutputStream("C:\\Users\\apple\\Desktop\\cc\\tt7.txt");
	
		OutputStreamWriter os = new OutputStreamWriter(out,"GBK");
		
		//读入内存，刷写磁盘
		os.write("你好");
		os.flush();
		
		//关闭流
		os.close();
		out.close();
		
	
	}
}
