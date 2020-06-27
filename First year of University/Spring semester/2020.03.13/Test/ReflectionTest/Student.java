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
		System.out.println("学校是："+this.school);
	}
	
	@Override
	public void studyInfo() 
	{
		System.out.println("学大学知识");
	}

	@Override
	public void moveInfo() 
	{
		System.out.println("骑自行车");
	}
	
	private void test(String name)
	{
		
	}

	private String getSchool()
	{
		return this.school;
	}
}
