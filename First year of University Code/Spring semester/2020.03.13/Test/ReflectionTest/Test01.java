package ReflectionTest;

public class Test01 
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//cla����Ͱ����˶���p����Person���������Ϣ
		Class cla = p.getClass(); 
		
		//����һ:
		//ͨ������.class����ָ�����Classʵ��
		Class c0 = Person.class;
			
		//��������
		//ͨ��һ�����ʵ�������getClass()��������ȡ��Ӧʵ����������Classʵ��
		Class c1 =p.getClass();
		
		//������:
		try 
		{
			//ͨ��Class�ľ�̬����forName����ȡһ�����Classʵ��
			//forName(String className)�����еĲ�������Ҫ��ȡ��Classʵ����ȫ·��
			//ȫ·������ָ����������
			Class c2 = Class.forName("ReflectionTest.Person");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
