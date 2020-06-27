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
			System.out.println(file.getAbsolutePath()+"是文件");
		}
		else
		{
			System.out.println(file.getAbsolutePath()+"是文件夹");
			//如果是文件夹，这个文件夹里就可能有子文件夹或者文件
			File[] fs = file.listFiles();//获取当前文件夹下的子文件夹或者文件的file对象
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




////此时对象f0、f1和f2都是name.txt
//File f0 = new File("C:\\Users\\apple\\Desktop\\name.txt");
//File f1 = new File("C:\\Users","apple\\Desktop\\name.txt");
//File f2 = new File("C:"+File.separator+"Users\\apple\\Desktop\\name.txt");
////File.separator也可以作为文件分隔符
//
//
//File f3 = new File("C:\\Users\\apple\\Desktop\\name1.txt");
//System.out.println(f3.exists());//查询文件是否存在
//System.out.println(f3.canWrite());//查询文件是否可写
//System.out.println(f3.canRead());//查询文件是否可读
//System.out.println(f3.isFile());//查询是否为文件
//System.out.println(f3.isDirectory());//查询是否为文件夹
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
