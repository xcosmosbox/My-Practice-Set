import java.util.Date;
public class GcometricObject 
{
	 private String color = "white"; 
	 private boolean filled; 
	 private Date dateCreated; 
	 
	 /** Construct a default geometric object */ 
	 protected GcometricObject()
	 { 
		 dateCreated = new Date(); 
	 } 
	 
	 /** Construct a geometric object with the specified color 12 
	  * * and filled value */ 
	 protected GcometricObject(String color, boolean filled)
	 { 
		 dateCreated = new Date(); 
		 this.color = color;
		 this.filled = filled;
	 }

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean getFilled() 
	{
		return filled;
	}

	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	public Date getDateCreated() 
	{
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) 
	{
		this.dateCreated = dateCreated;
	} 
	
	/** Return a string representation of this object */ 
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + "and filled: " + filled;
	} 
	 
	
	 
}
