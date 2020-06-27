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
	 *缓冲字节输入流
	 *BufferedInputStream 
	 * @throws FileNotFoundException 
	 */
	public static void testBufferedInputStream() throws Exception
	{
		//文件字节输入流对象
		FileInputStream in = new FileInputStream("C:\\Users\\apple\\Desktop\\name1.txt");
		
		//把文件字节输入流放到缓冲字节输入流对象
		BufferedInputStream br = new BufferedInputStream(in);
		
		byte[] b = new byte[10];
		int len = 0;
		while((len = br.read(b)) != -1)
		{
			System.out.println(new String(b,0,len));
		}
		
		//关闭流
		br.close();
		in.close();
	}
	
	/**
	 *缓冲字节输出流
	 *BufferedOutputStream 
	 * @throws FileNotFoundException 
	 */
	public static void testBufferedOutputStream() throws Exception
	{
		//创建字节输出对象
		FileOutputStream fo = new FileOutputStream("C:\\Users\\apple\\Desktop\\out.txt");
		
		//把字节输出流对象放到缓冲字节输出流中
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		String s = "world";
		
		//写到内存中
		bo.write(s.getBytes());
		
		//刷到硬盘上
		bo.flush();
		
		//关闭流
		bo.close();
		fo.close();		
	}
	
	/**
	 *缓冲流实现文件的复制
	 * @throws FileNotFoundException 
	 */
	public static void copyFile() throws Exception
	{
		//缓冲输入流
		BufferedInputStream br = new BufferedInputStream(new FileInputStream("C:\\Users\\apple\\Desktop\\out.txt"));
	
		//缓冲输出流
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\apple\\Desktop\\cc\\tt6.txt"));
		
		byte[] b = new byte[10];
		int len = 0;//设置一个每次读取到的数据的长度，直达br.read方法执行到最后（比如有个hello world，要读取到d之后，才能算是最后）
		while((len=br.read(b)) != -1)
		{
			//写到内存中
			bo.write(b,0,len);
		}
		
		//刷到硬盘中
		bo.flush();
		
		//关闭流
		bo.close();
		br.close();
		
		
	
	}
}
