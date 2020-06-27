/**
 * This is a staff class, a subclass of employee. 
 * Have position attributes, and finally be able to output. 
 */
class Staff extends Employee
{
	private String title;
	
	//A method of parametric construction without time
	Staff(String name,String address,String phoneNum,String email,String office,double salary,String title)
	{
		super(name,address,phoneNum,email,office,salary);
		this.title = title;
	}
	
	//Parametric construction method with time
	Staff(String name,String address,String phoneNum,String email,String office,double salary,int year,int month,int day,String title)
	{
		super(name,address,phoneNum,email,office,salary,year,month,day);
		this.title = title;
	}
	 
	//Output the staff information
	@Override
	public String toString()
	{
		return super.toString()+
				"class name: Staff"+
				"\n title: "+this.title+"\n";
	}
}