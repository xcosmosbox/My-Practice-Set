package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *��������л��ͷ����л�
 *ע�⣺���л��ͷ����л�ʹ�õ�������ϸ�һ�£���������Ŀ����ṹ�ȵ����ж�Ҫһ��
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
	 *���л����󣬲��������뵽ָ���ļ��� 
	 */
	public static void testSerialize() throws Exception
	{
		//����������������Ѷ�������л�֮������ŵ�ָ�����ļ���
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
	
		//�������е����ݽ����޸�
		Person p = new Person();
		p.name = "zhangsna";
		p.age = 17;
		
		//���޸���ɺ�Ķ���������л�
		out.writeObject(p);
		
		//ˢд��������
		out.flush();
		
		//�ر���
		out.close();
	}
	
	/**
	 *�����л�����ָ���ļ��е��������л������������ 
	 */
	public static void textDeserialize() throws Exception
	{
		//������������������ָ�����ļ��аѶ������л��������ȡ����
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
	
		//��ȡ��
		Object obj = in.readObject();

		//����ǿ��ת��Ϊ�����һ�µ���������
		Person p = (Person)obj;
		
		//����Լ������л�������
		System.out.println(p.age);
		System.out.println(p.name);
		
		//�ر���
		in.close();
	}
}
