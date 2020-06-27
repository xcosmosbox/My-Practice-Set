/**
 * This is a student class, which is a subclass of the person class. 
 * Be able to express and output a student's status and grade. 
 */
class Student extends Person
{
	//Use constants to create four intrinsic grades.
	private final String[] CLASS_STATUS = {"freshman","sophomore","junior","senior"};
	private int grade;
	
	//The construction method with parameters including grade
	Student(String name, String address, String phoneNum, String email, int grade)
	{
		super(name, address, phoneNum, email);
		this.grade = grade-1;
	}
	
	//Able to output a student's status and grade
	@Override
	public String toString()
	{
		return super.toString()+
				"class name: Student"+
				"\n grade: "+CLASS_STATUS[grade]+"\n";
	}
}