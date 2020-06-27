package ReflectionTest;

public class Person 
{
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	
	public void eat()
	{
		System.out.println("eat¡­¡­");
	}
	
	public void eat(String food)
	{
		System.out.println("eat¡­¡­"+food);
	}
}
