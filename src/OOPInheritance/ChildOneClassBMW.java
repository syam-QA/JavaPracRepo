package OOPInheritance;

public class ChildOneClassBMW extends ParentOneClassCar
{
	 //Method Overriding 
		//When child class is having the method name same as the parent class method then it is method overriding 
	    //1. with same name
		//2.with the same number of parameters
		//3.with the  same return type
		
	@Override
	public void start()
	{
		System.out.println("BMW_Start");
	}
	public void autoPark()
	{
		System.out.println("BMW Auto Park");
	}
}
