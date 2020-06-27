public class Test02
{
	public static void main(String[] agrs)
	{
		//Season.SPRING这段执行就是获取一个Season对象
		Season spring = Season.SPRING;
		spring.showInfo();
		
		Season summer = Season.SUMMER;
		summer.showInfo();
		
		Season spring_01 = Season.SPRING;
		//此处证明每次运行Season.SPRING创建的是同一个对象
		System.out.println(spring.equals(spring_01));
	}
}

enum Season
{
	SPRING("春天","春暖花开"),//此处相当于在调用有参的私有构造
	SUMMER("夏天","夏日炎炎");
	
	private final String name;
	private final String desc;
	
	private Season(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
	}
	
	public void showInfo()
	{
		System.out.println(this.name+": "+this.desc);
	}
}






