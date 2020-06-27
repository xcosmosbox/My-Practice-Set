import java.util.Date;

public class PersonalAssessment 
{
	//课堂考核的时间和当时的那次考核的分数
	//Date数据类型是Java中以及包装好的一个时间类，我不确定C/C++里面有没有类似的
	//应该不会让学生手动实现Date类的功能吧…………
	Date assessmentDate;
	int gradeNum;
	
	//以下两个函数的功能跟Students类里面是一样的
	public PersonalAssessment(Date assessmentDate, int gradeNum) 
	{
		this.assessmentDate = assessmentDate;
		this.gradeNum = gradeNum;
	}
	public PersonalAssessment() 
	{
	}
	
	//这个方法会以指定格式传递一个包含变量信息的值
	public String toString()
	{
		return assessmentDate+"    "+gradeNum;
	}
}
