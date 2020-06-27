package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 
{
	public static void main(String[] args)
	{
		copyFile();
	}

	/**
	 * 复制图片到指定位置
	 * 经过使用while改良，则不用担心byte数组的长度，因为是每读取读取依次就写入依次
	 * 所以不会出现数组长度不够导致文件复制不完整的情况
	 */
	public static void copyFile()
	{
		try 
		{
			//读取的文件
			FileInputStream in = new FileInputStream("C:\\Users\\apple\\Desktop\\jg.png");
			//需要复制到的位置
			FileOutputStream out= new FileOutputStream("C:\\Users\\apple\\Desktop\\bb\\immg.jpg");
			
			//读取文件
			byte[] b = new byte[100];
//			in.read(b);//原始方法，不够灵活
			int len = 0;
			while((len = in.read(b)) != -1)
			{
				out.write(b,0,len);//参数i是写的缓冲数组，参数j是从数组的那个位置开始，参数k是获取的数组的总长度
				
			}
			
			//写入文件
//			out.write(b);//原始方法，不够灵活
			out.flush();//把写到内存的数据刷到硬盘
			/*实际上，不写flush方法，只写write方法也是同样可以成功的，
			 * flush方法的目的是保证内存中数据强制关闭，避免数据读入不完整
			 */
			
			//依次关闭输出输入流，因为输出流是后启动的，所以要先关闭
			out.close();
			in.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 文件字节输入流
	 */
	public static void testFileInputStream()
	{
		try 
		{
			FileInputStream in = new FileInputStream("C:\\Users\\apple\\Desktop\\name1.txt");
			byte[] b = new byte[10];//设置一个数组接收读取的文件内容
			
			//读取并输出文件
			in.read(b);
			System.out.println(new String(b));
			
			in.close();//注意，流在使用完毕后要关闭
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 文件字节输出流
	 */
	public static void testFileOutputStream()
	{
		try 
		{
			//指定向一个文件中输出
			FileOutputStream out= new FileOutputStream("C:\\Users\\apple\\Desktop\\out.txt");
			String str = "kkksss";
			out.write(str.getBytes());//把数据写到内存
			out.flush();//把内存中的数据刷写到硬盘
			out.close();//关闭流
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}