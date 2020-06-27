package io;

import java.io.RandomAccessFile;

/**
 *文件的随机读写
 *程序可以直接跳到文件的任意位置进行读写文件 
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
	 *随机读文件
	 */
	
	public static void testRandomAccessFileRead() throws Exception
	{
		//RandomAccessFile的构造有两个参数，参数1是读写的文件的路径
		//参数2是RandomAccessFile的访问模式
		RandomAccessFile ra = new RandomAccessFile("C:\\Users\\apple\\Desktop\\tt7.txt","r");
		
		//设置读取文件内容的起始点
		ra.seek(8);//通过设置读取文件内容的起始点，来达到从文件的任意位置读取
		
		
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
	
		//设置写的起始点
		//0代表从开头写
		//ra.seek(0);
		//注意，如果是从文件开头或中间的某个位置开始写的话，就会用写的内容覆盖掉等长度的原内容
		
		//设置写的起始点，ra.length()代表从文件的最后结尾写，也就是文件的追加
		ra.seek(ra.length());
		
		ra.write("你好".getBytes());
		
		ra.close();
		
	}
}
