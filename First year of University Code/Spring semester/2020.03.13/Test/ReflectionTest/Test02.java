package ReflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;
import java.lang.reflect.Field;


public class Test02 
{
	public static void main(String[] args)
	{
		/**
		 * 	执行方法：
		 * 		Object invoke(Object obj, Object…… args)
		 * 	获取方法的名称：
		 * 		String getName:获取方法名
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
		//获取Person的class对象
		Class personClazz = Person.class;
		Method[] ms = personClazz.getMethods();
		for(Method m : ms)
		{
			Class[] pos = m.getParameterTypes();
			if((pos != null) && (pos.length > 0))
			{
				for(Class pc : pos)
				{
					System.out.println("参数类型:"+pc.getName());
				}
			}
		}
		
	}
}


////获取到类的公有构造
//Constructor[] cons = cla.getConstructors();
//for(Constructor c : cons)
//{
//	System.out.println("----------------------------");
//	System.out.println("构造方法是：" + c.getName());
//	//返回数字1代表public
//	System.out.println("构造方法的：" + c.getName()+" 修饰符是："+c.getModifiers());
//	
//	Class[] paramCla = c.getParameterTypes();
//	for(Class pc : paramCla)
//	{
//		System.out.println("构造方法："+c.getName()+"的参数类型是："+pc.getName());
//	}
//	System.out.println("----------------------------");
//}
//
////获取类的所有构造方法，包含公有类和私有类
//Constructor[] cons1 = cla.getDeclaredConstructors();
//for(Constructor c : cons1)
//{
//	System.out.println("----------------------------");
//	System.out.println("构造方法是：" + c.getName());
//	//返回2代表private
//	System.out.println("构造方法的：" + c.getName()+" 修饰符是："+c.getModifiers());
//	Class[] paramCla = c.getParameterTypes();
//	for(Class pc : paramCla)
//	{
//		System.out.println("构造方法："+c.getName()+"的参数类型是："+pc.getName());
//	}
//	System.out.println("----------------------------");
//}
	
	
	
	
	
	
	
	
	//如何用反射的构造方法来创建对象
//	try 
//	{
//		//此时相当于调用Student类的无参公有的构造方法
//		Object obj = cla.getDeclaredConstructor().newInstance();
//		Student stu = (Student)obj;
//		
//		//指定获取一个有参数并且为String类型的公有构造方法
//		Constructor c = cla.getConstructor(String.class);
//		Student stu1 = (Student)c.newInstance("Hh");//newInstance实例化了对象
//		System.out.print(stu1.school);
//		
//		//通过反射机制，可以强制调用私有的构造方法
//		//指定获取有两个参数的私有构造方法
//		Constructor c1 = cla.getDeclaredConstructor(String.class,int.class);
//		//此步骤为解除私有封装，下面就可以对这个私有方法强制调用
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
