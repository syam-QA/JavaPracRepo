package Encapsulation;

public class LoginDetailsEncaCalss 
{
      private String userId;
      private String password;
      
	public String getUserId()
	{
		return userId;
	}
	
	public void setUserId(String userId)
	{
		if(userId== null)
		{
			System.out.println("User Id shouldn't be Null");
		}
		this.userId = userId;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		if(password.length()>=10)
		{
			this.password = password;
		}
		else
		{	
		System.out.println("Enter password is invalid ");
		}
	}  
		
      
      
}
