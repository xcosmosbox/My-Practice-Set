/**
 * This is a person class. Is a parent class. This class has name, address, phone number, and mailbox properties. 
 * Finally, the content of these attributes can be output by using the rewritten toString method. 
 */
public class Person 
{
	//Create name, address, phone number, and mailbox variables.
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	//Construction method with parameters including all variable parameters
	public Person(String name, String address, String phoneNum, String email) 
	{
	this.name = name;
	this.address = address;
	this.phoneNum = phoneNum;
	this.email = email;
	
	}
	
	//Output these variable
	@Override
	public String toString()
	{
		return "class name: Person"+
			   "\n name: "+this.name+
			   "\n address: "+this.address+
			   "\n phoneNum: "+this.phoneNum+
			   "\n email: "+this.email+"\n";
	}
}