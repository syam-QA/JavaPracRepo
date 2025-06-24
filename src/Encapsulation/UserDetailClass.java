package Encapsulation;

public class UserDetailClass
{
	
	private String name;
	private int age;
	private float salary;
	private boolean active;
	
	public void setName(String name)
	{	
		if(name == null) {
		System.out.println("name can not be null");
	}
	this.name = name;
    }
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		if(age>=21)
		{
			this.age=age;
		}
		this.age=-1;
	}
	public int getAge()
	{
		return age;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
		
	}
	public float getSalary()
	{
		return salary;
	}
	public void setActive(boolean active)
	{
		this.active=active;
	}
	public boolean getActive ()
	{
		return active;
	}
	
}
