/**
 * This is a result class, a subclass of the Employee class. 
 * Have working time and rank variables. Finally, these attributes can be output. 
 */
class Faculty extends Employee 
{
	//Create basic variables.
	private String officeHours;
	private String rank;
	
	//A method of parametric construction without time
	Faculty(String name,String address,String phoneNum,String email,String office,double salary,String officeHours,String rank)
	{
		super(name,address,phoneNum,email,office,salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	//Parametric construction method with time
	Faculty(String name,String address,String phoneNum,String email,String office,double salary,int year,int month,int day,String officeHours,String rank)
	{
		super(name,address,phoneNum,email,office,salary,year,month,day);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	//Output basic information such as working time.
	@Override
	public String toString()
	{
		return super.toString()+
				"class name: Faculty"+
				"\n officeHours: "+this.officeHours+
				"\n rank: "+this.rank+"\n";
	}
}