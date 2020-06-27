package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test06 
{
	public static void main(String[] args)
	{
		try 
		{
			testDataOutputStream();
			testDataInputStream();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *数据输出流
	 *用数据输出流写到文件中的基本数据类型的数据，是乱码的，不能直接辨认出来
	 *需要数据输入流进行读取
	 *DataOutputStream
	 */
	public static void testDataOutputStream() throws Exception
	{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
		
		//向文本中输出以下数据
		//但是直接打开会是乱码
		out.writeBoolean(true);
		out.writeDouble(1.35d);
		out.writeInt(1);
		
		out.flush();
		out.close();
	}
	
	/**
	 *数据输入流
	 *用数据输出流写到文件中的基本数据类型的数据，是乱码的，不能直接辨认出来
	 *需要数据输入流进行读取,读取时要保证读取的数据和当时写的数据类型要一致
	 */
	public static void testDataInputStream() throws Exception
	{
		//引用输出流输出的文本，创建输入对象
		//将对象中的值利用输入流在控制台打开
		//这样才不会出现乱码
		DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
	
		//向控制台输出可辨识的数据
		//输出的顺序和类型要与输出流一致
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readInt());
		
		in.close();
	}
}
