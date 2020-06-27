package ReflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;
import java.lang.reflect.Field;


public class Test02 
{
	public static void main(String[] args)
	{
		/**
		 * 	ִ�з�����
		 * 		Object invoke(Object obj, Object���� args)
		 * 	��ȡ���������ƣ�
		 * 		String getName:��ȡ������
		 */
		try 
		{
			test();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception
	{
		//��ȡPerson��class����
		Class personClazz = Person.class;
		Method[] ms = personClazz.getMethods();
		for(Method m : ms)
		{
			Class[] pos = m.getParameterTypes();
			if((pos != null) && (pos.length > 0))
			{
				for(Class pc : pos)
				{
					System.out.println("��������:"+pc.getName());
				}
			}
		}
		
	}
}


////��ȡ����Ĺ��й���
//Constructor[] cons = cla.getConstructors();
//for(Constructor c : cons)
//{
//	System.out.println("----------------------------");
//	System.out.println("���췽���ǣ�" + c.getName());
//	//��������1����public
//	System.out.println("���췽���ģ�" + c.getName()+" ���η��ǣ�"+c.getModifiers());
//	
//	Class[] paramCla = c.getParameterTypes();
//	for(Class pc : paramCla)
//	{
//		System.out.println("���췽����"+c.getName()+"�Ĳ��������ǣ�"+pc.getName());
//	}
//	System.out.println("----------------------------");
//}
//
////��ȡ������й��췽���������������˽����
//Constructor[] cons1 = cla.getDeclaredConstructors();
//for(Constructor c : cons1)
//{
//	System.out.println("----------------------------");
//	System.out.println("���췽���ǣ�" + c.getName());
//	//����2����private
//	System.out.println("���췽���ģ�" + c.getName()+" ���η��ǣ�"+c.getModifiers());
//	Class[] paramCla = c.getParameterTypes();
//	for(Class pc : paramCla)
//	{
//		System.out.println("���췽����"+c.getName()+"�Ĳ��������ǣ�"+pc.getName());
//	}
//	System.out.println("----------------------------");
//}
	
	
	
	
	
	
	
	
	//����÷���Ĺ��췽������������
//	try 
//	{
//		//��ʱ�൱�ڵ���Student����޲ι��еĹ��췽��
//		Object obj = cla.getDeclaredConstructor().newInstance();
//		Student stu = (Student)obj;
//		
//		//ָ����ȡһ���в�������ΪString���͵Ĺ��й��췽��
//		Constructor c = cla.getConstructor(String.class);
//		Student stu1 = (Student)c.newInstance("Hh");//newInstanceʵ�����˶���
//		System.out.print(stu1.school);
//		
//		//ͨ��������ƣ�����ǿ�Ƶ���˽�еĹ��췽��
//		//ָ����ȡ������������˽�й��췽��
//		Constructor c1 = cla.getDeclaredConstructor(String.class,int.class);
//		//�˲���Ϊ���˽�з�װ������Ϳ��Զ����˽�з���ǿ�Ƶ���
//		c1.setAccessible(true);
//		Student stu2 = (Student)c1.newInstance("Hh",12);
//		System.out.print(stu2.name);
//		System.out.println(""+stu.age);
//	} 
//	catch(Exception e)
//	{
//		e.printStackTrace();
//	} 	
//} 
//catch (ClassNotFoundException e) 
//{
//	e.printStackTrace();
//}
