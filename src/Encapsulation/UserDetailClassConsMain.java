package Encapsulation;

public class UserDetailClassConsMain 
{

	public static void main(String[] args) 
	{

       UserDetailClasCons UDC=new UserDetailClasCons("Syam", 37, 58833, true);
       
       UDC.setName("Kumar");
       String uName =UDC.getName();
       System.out.println(uName);       
       
       

	}

}
