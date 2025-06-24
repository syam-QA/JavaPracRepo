package Encapsulation;

public class UserDetailClasCons
{
	private String name;
	private int age;
	private float salary;
	private boolean active;
	
	
	public UserDetailClasCons(String name, int age, float salary, boolean active)
	{
     	if(name==null)
     	{
     		System.out.println("Name should not be null");
     	}
     	else {
		this.name = name;
		 }
     	if (age >= 18)
		{
			this.age = age;
		}
		else
		{
			System.out.println("age is not valid");
		}
		
		this.salary = salary;
		
		 this.active = active;

			System.out.println(name +" "+ age +" "+ salary +" "+ active);
		 
	}
	public void setName(String name)
	{
		if(name==null)
		{
			System.out.println("Name can't be Null");
		}
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		if(age>=18)
		{
			System.out.println("User is not ela");
		}
		else
		{
			this.age=age;
		}
	}
	public int getAge()
	{
		return age;
	}
	public void setSalary(float salary) 
	{
		if(salary==0)
		{
			System.err.println("Salary can't be null");
		}
		else
		{
			this.salary=salary;
		}
	}
	public float getSalary()
	{
		return salary;
	}
	public void setActive(boolean active)
	{
		this.active=active;
	}
	public boolean getActive()
	{
		return active;
	}
}
