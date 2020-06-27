/**
 * This is an employee class, a subclass of the person class. 
 * This class can output information such as office and salary. 
 */
class Employee extends Person
{
	//Create the initial variable
	private String office;
	private double salary;
	private MyDate dateHired;
	
	//A method of parametric construction without time
	Employee(String name,String address,String phoneNum,String email,
			String office,double salary)
	{
		super(name,address,phoneNum,email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate(); 
		
	}
	
	//Parametric construction method with time
	Employee(String name,String address,String phoneNum,String email,
			String office,double salary,int year,int month,int day)
	{
		super(name,address,phoneNum,email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate(year,month,day);
		
	}
	
	//It can output the basic information of this class.
	@Override
	public String toString()
	{
		return super.toString()+
				"class name: Employee"+
				"\n office: "+this.office+
				"\n salary: "+this.salary+
				"\n date of hired: "+this.dateHired+"\n";
	}
}