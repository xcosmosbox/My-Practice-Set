package io;

import java.io.File;

public class Test 
{
	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\apple\\Desktop");
		new Test().test(f);
	}
	
	public void test(File file)
	{
		if(file.isFile())
		{
			System.out.println(file.getAbsolutePath()+"���ļ�");
		}
		else
		{
			System.out.println(file.getAbsolutePath()+"���ļ���");
			//������ļ��У�����ļ�����Ϳ��������ļ��л����ļ�
			File[] fs = file.listFiles();//��ȡ��ǰ�ļ����µ����ļ��л����ļ���file����
			if(fs != null && fs.length>0)
			{
				for(File ff : fs)
				{
					test(ff);
				}
			}
		}
	}
}




////��ʱ����f0��f1��f2����name.txt
//File f0 = new File("C:\\Users\\apple\\Desktop\\name.txt");
//File f1 = new File("C:\\Users","apple\\Desktop\\name.txt");
//File f2 = new File("C:"+File.separator+"Users\\apple\\Desktop\\name.txt");
////File.separatorҲ������Ϊ�ļ��ָ���
//
//
//File f3 = new File("C:\\Users\\apple\\Desktop\\name1.txt");
//System.out.println(f3.exists());//��ѯ�ļ��Ƿ����
//System.out.println(f3.canWrite());//��ѯ�ļ��Ƿ��д
//System.out.println(f3.canRead());//��ѯ�ļ��Ƿ�ɶ�
//System.out.println(f3.isFile());//��ѯ�Ƿ�Ϊ�ļ�
//System.out.println(f3.isDirectory());//��ѯ�Ƿ�Ϊ�ļ���
//
//System.out.println(f3.lastModified());
//System.out.println(f3.length());
//
//File f3 = new File("C:\\Users\\apple\\Desktop\\cc");
//f3.mkdir();
//
//File f4 = new File("C:\\Users\\apple\\Desktop");
//String[] f5 = f4.list();
//for(String s : f5)
//{
//	System.out.println(s);
//}
//
//File[] f6 = f4.listFiles();
//for(File f : f6)
//{
//	System.out.println(f);
//}
