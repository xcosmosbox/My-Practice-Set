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
	 *���������
	 *�����������д���ļ��еĻ����������͵����ݣ�������ģ�����ֱ�ӱ��ϳ���
	 *��Ҫ�������������ж�ȡ
	 *DataOutputStream
	 */
	public static void testDataOutputStream() throws Exception
	{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
		
		//���ı��������������
		//����ֱ�Ӵ򿪻�������
		out.writeBoolean(true);
		out.writeDouble(1.35d);
		out.writeInt(1);
		
		out.flush();
		out.close();
	}
	
	/**
	 *����������
	 *�����������д���ļ��еĻ����������͵����ݣ�������ģ�����ֱ�ӱ��ϳ���
	 *��Ҫ�������������ж�ȡ,��ȡʱҪ��֤��ȡ�����ݺ͵�ʱд����������Ҫһ��
	 */
	public static void testDataInputStream() throws Exception
	{
		//���������������ı��������������
		//�������е�ֵ�����������ڿ���̨��
		//�����Ų����������
		DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\apple\\Desktop\\tt7.txt"));
	
		//�����̨����ɱ�ʶ������
		//�����˳�������Ҫ�������һ��
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readInt());
		
		in.close();
	}
}
