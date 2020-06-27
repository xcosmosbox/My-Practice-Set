package ReflectionTest;

public class Test01 
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//cla对象就包含了对象p所属Person类的所有信息
		Class cla = p.getClass(); 
		
		//方法一:
		//通过类名.class创建指定类的Class实例
		Class c0 = Person.class;
			
		//方法二：
		//通过一个类的实例对象的getClass()方法，获取对应实例对象的类的Class实例
		Class c1 =p.getClass();
		
		//方法三:
		try 
		{
			//通过Class的静态方法forName来获取一个类的Class实例
			//forName(String className)方法中的参数是你要获取的Class实例的全路径
			//全路径就是指包名、类名
			Class c2 = Class.forName("ReflectionTest.Person");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
