public class Test02
{
	public static void main(String[] agrs)
	{
		//Season.SPRING���ִ�о��ǻ�ȡһ��Season����
		Season spring = Season.SPRING;
		spring.showInfo();
		
		Season summer = Season.SUMMER;
		summer.showInfo();
		
		Season spring_01 = Season.SPRING;
		//�˴�֤��ÿ������Season.SPRING��������ͬһ������
		System.out.println(spring.equals(spring_01));
	}
}

enum Season
{
	SPRING("����","��ů����"),//�˴��൱���ڵ����вε�˽�й���
	SUMMER("����","��������");
	
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






