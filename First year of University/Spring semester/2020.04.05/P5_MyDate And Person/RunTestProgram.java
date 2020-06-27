/**
 * This is a test class. This class will create student objects, staff objects and faculty objects, 
 * and finally output information using the overridden toString method.
 */

/**
 * @author Yuxiang FENG (Xavier Frankland)
 * @studentID 194602104858
 * @sessionID 1
 * @date 2020/04/03
 * @version 1.0
 * @teacher Mike , Tim
 */
public class RunTestProgram 
{
	public static void main(String[] args) 
	{
		//Create Student object
		Student student_1 = new Student("FENG Yuxiang","Chengdu","13982012239","1904858@cgt.bitzh.edu.cn", 1);
		
		//Create Faculty object
		Faculty faculty_1 = new Faculty("FENG Yuxiang","Chengdu","13982012239","1904858@cgt.bitzh.edu.cn","QA304",10000,"Monday 8~18","worker");
		Faculty faculty_2 = new Faculty("FENG Yuxiang","Chengdu","13982012239","1904858@cgt.bitzh.edu.cn","QA304",10000,2017,9,1,"Monday 8~18","worker");
		
		//Create Staff object
		Staff staff_1 = new Staff("FENG Yuxiang","Chengdu","13982012239","1904858@cgt.bitzh.edu.cn","QC110",3000,"TA");
		Staff staff_2 = new Staff("FENG Yuxiang","Chengdu","13982012239","1904858@cgt.bitzh.edu.cn","QC110",3000,2018,9,1,"TA");
		
		//Output all information
		System.out.println(student_1+"\n"+faculty_1+"\n"+faculty_2+"\n"+staff_1+"\n"+staff_2+"\n");
	}

}
