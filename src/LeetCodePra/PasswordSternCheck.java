package LeetCodePra;

public class PasswordSternCheck 
{
	public static boolean passwordCheckMethod(String password)
	
	{
		if(password.length()<8)
		{
			return false;
		}
		char[] pwdChArr=password.toCharArray();
		boolean hasUpperccaseChar=false, hasLowerCaseChar=false,hasDigits=false,hasSpecialChar=false;
		for(char cha:pwdChArr)
		{
			if(Character.isUpperCase(cha))hasUpperccaseChar=true;
			else if (Character.isLowerCase(cha)) {
				hasLowerCaseChar=true;
			}
			else if (Character.isDigit(cha)) {
				hasDigits=true;
				}
			else if ("@#$%&*!".contains(String.valueOf(cha))) {
				
				hasSpecialChar=true;
			}
			
		}
		boolean result=hasUpperccaseChar && hasLowerCaseChar && hasDigits && hasSpecialChar;
		return result;
	}

	public static void main(String[] args) 
	{
		String[] passwords={"syAm0809",//false
				"Test123!",    // true
	            "testonly",    // false
	            "TESTONLY",    // false
	            "TestTest",    // false
	            "Test@123"     // true
	        };
		
		
		for(String password:passwords)
		{
		System.out.println(password +"->"+ (passwordCheckMethod(password)? "Strong": "Weak"));
		}

	}

}
