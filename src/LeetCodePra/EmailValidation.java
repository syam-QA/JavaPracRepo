package LeetCodePra;

public class EmailValidation {

	public static boolean validEmail(String emails)
	{
		int atIndex=emails.indexOf('@');
		int LastAtIndex=emails.lastIndexOf('@');
		int dotIndex=emails.indexOf('.', atIndex);
		if(atIndex<=0||atIndex!=LastAtIndex)
			return false;
		
		if (dotIndex<=0)
			return false;
		
		if (emails.contains(" ")) 
			return false;
		return true;
	}
	public static void main(String[] args) 
	{
		String[] emails={"Syam@gaim.com",
				"user@example.com",
	            "userexample.com",
	            "user@@example.com",
	            "user@domain",
	            "user@domain.com",
	            "user@domain com"
	        };
		
		for(String email:emails)
		{
			 System.out.println(email + " => " + (validEmail(email) ? "Valid" : "Invalid"));
		}		
		// TODO Auto-generated method stub

	}

}
