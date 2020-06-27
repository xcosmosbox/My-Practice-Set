import java.util.ArrayList;
import java.util.Date;

public class Students
{
	//学生基本信息
	String id;
	String name;
	String faculty;
	
	//构造方法，方便初始化数据的，但没有也没差，无法就是手动写语句去赋值
	public Students(String id, String name, String faculty) 
	{
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		assessmentInfoCreat();
	}
	public Students()
	{
		//这是一个无参构造方法，Java中规定不管构造方法里是否需要初始数据
		//都得这么写，所以如果一开始创建这个类却调用这个无参构造，代表着
		//想要手动初始化数据
	}

	//用来存储一个学生多次考核信息的动态链表
	//其中的 <PersonalAssessment> 是用来限定能够被存储进这个链表中的数据规范
	//也就是说，只能存储一个包含了学生考核时间和和分数的类（结构体）
	//但说是结构体其实不标准，因为结构体里好像是不能有方法（函数）的
	//如果确实是这样，那我PersonalAssessment中的函数，你就得在main函数中去手动实现
	ArrayList<PersonalAssessment> assessmentList = new ArrayList<>();
	
	/*每考核一次，就调用这个方法去创建学生的考核信息*/
	public void assessmentInfoCreat()
	{
		//因为没有你们老师的测试文本文档，所以我就只能把每次的考核分数用随机函数新建了
		Date date = new Date();
		int number = (int)Math.random()*11;//随机分数的范围是【0，11）的整数
		
		//assessmentList.add就是动态链表用来添加信息用的
		//由上面的注释中说到，需要添加一个 PersonalAssessment类的数据，所以
		//在add的括号类 new 了一个 PersonalAssessment类
		//在new这个 PersonalAssessment类的同时，将创建好的数据传输过去
		//完成数据初始化
		assessmentList.add( new PersonalAssessment(date,number) );
	}
	
	/*提供的可以增加考评信息的函数*/
	public void assessmentInfoAdd(Date date, int number)
	{
		assessmentList.add( new PersonalAssessment(date,number) );
	}
	
	/*提供的删除考评信息的函数*/
	public void assessmentInfoDelete(int index)
	{
		//虽然我写的是index，但是你实际实现时，这里传过来的应该是一个日期
		//然后你得在这个函数里面，调用搜索函数（搜索算法）去查找 assessmentList链表中
		//是否存在这个日期，如果存在，那么就将这个日期所对应的PersonalAssessment的位置传过来
		//然后把这个指定位置index上的信息给删除了
		assessmentList.remove(index);
	}
	
	/*提供的 改 功能*/
	public void assessmentInfoSet(Date date, PersonalAssessment setInfo)
	{
		//跟上面一样，得先实现个搜索算法，找到你想要修改的那天的信息，在链表中处于什么位置
		//将获得的位置index，传到下面调用的函数中，去把那个指定位置的对象给替换了
		int index = 0;//因为我这没有可拱测试的文件，我就先这么写了，到时候把查到的位置赋值给index就行了
		assessmentList.set(index, setInfo);//这个函数的意思就是，将指定的index下标的位置所存储的对象替换成 setInfo
	}
	
	/*查*/
	public void assessmentInfoSearch()
	{
		//这个查就是上面两个方法要用到的搜索算法，加油
		//而且程序需要输出指定时间段内的考勤相信，也需要搜索算法
	}
	
	//保存不需要额外的方法，只需要在main函数中写一个if语句让用户来确定是否保存修改
	//比如一个用户想修改信息，只有当他确认保存时，assessmentInfoSet这个函数才会执行
	
	/*得到单个学生总分的方法*/
	public int getAllGrade()
	{
		//使用for循环去访问链表的指定位置i
		//将位置i处的PersonalAssessment进行访问
		//调用PersonalAssessment中的gradeNum变量的值
		int allGrade = 0;
		for(int i=0; i<assessmentList.size(); i++)
		{
			allGrade = allGrade + assessmentList.get(i).gradeNum;
		}
		
		return allGrade;
	}
	//对于所有学生的总分喝到课率的排序和查询方法，都应该在main方法中写，而不是这里

	
	//这个方法用来方便输出所包含的考核信息
	public void getAllAssessmentInfo()
	{
		for(int i=0; i<assessmentList.size(); i++)
		{
			System.out.println(assessmentList.get(i).toString());
		}
	}
	
}
