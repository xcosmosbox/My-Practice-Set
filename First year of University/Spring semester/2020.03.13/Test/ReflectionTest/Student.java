package ReflectionTest;

public class Student extends Person implements Move,Study 
{
	public Student()
	{
		System.out.print("1");
	}
	
	public Student(String school)
	{
		this.school = school;
		System.out.print("2");
	}
	
	private Student(String name, int age)
	{
		System.out.print("3");
		this.name = name;
		this.age = age;
	}
	
	String school;
	public void showInfo()
	{
		System.out.println("ѧУ�ǣ�"+this.school);
	}
	
	@Override
	public void studyInfo() 
	{
		System.out.println("ѧ��ѧ֪ʶ");
	}

	@Override
	public void moveInfo() 
	{
		System.out.println("�����г�");
	}
	
	private void test(String name)
	{
		
	}

	private String getSchool()
	{
		return this.school;
	}
}
