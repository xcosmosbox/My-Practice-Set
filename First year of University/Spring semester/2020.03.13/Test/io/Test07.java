package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *对象的序列化和反序列化
 *注意：序列化和反序列化使用的类必须严格一致，包名、类目、类结构等等所有都要一致
 */
public class Test07 
{
	public static void main(String[] args)
	{
		try 
		{
			testSerialize();
			textDeserialize();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *序列化对象，并将流放入到指定文件中 
	 */
	public static void testSerialize() throws Exception
	{
		//定义对象的输出流，把对象的序列化之后的流放到指定的文件中
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
	
		//将对象中的数据进行修改
		Person p = new Person();
		p.name = "zhangsna";
		p.age = 17;
		
		//将修改完成后的对象进行序列化
		out.writeObject(p);
		
		//刷写到磁盘中
		out.flush();
		
		//关闭流
		out.close();
	}
	
	/**
	 *反序列化，将指定文件中的流反序列化，并进行输出 
	 */
	public static void textDeserialize() throws Exception
	{
		//创建对象输入流，从指定的文件中把对象序列化后的流读取出来
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
	
		//读取流
		Object obj = in.readObject();

		//将流强制转换为与对象一致的数据类型
		Person p = (Person)obj;
		
		//输出以及反序列化的数据
		System.out.println(p.age);
		System.out.println(p.name);
		
		//关闭流
		in.close();
	}
}
