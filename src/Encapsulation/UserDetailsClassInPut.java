package Encapsulation;

public class UserDetailsClassInPut
{

	public static void main(String[] args) 
	{
     UserDetailClass ur =new UserDetailClass();
     ur.setName("Syam");
     ur.getName();
     ur.setAge(20);
     int a= ur.getAge();
     System.out.println(a);
     ur.setSalary(33000);
     ur.getSalary();
    
     
	}

}
