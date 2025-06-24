package Assigmnents;

public class LaunchBrowsersUsingIfElse 
{

	public static void main(String[] args) 
	{
		//Launch the browser using if else 
		
		String browser="FF";
		
		if(browser=="Chrome"||browser =="FF"||browser=="safari"||browser =="IE")
			System.out.println("you have selected " +browser);
		else 
			System.out.println("Please select correct browser");
		
		System.out.println("Switch case");
		
		switch (browser)
		{
		
		case "Chrome":
		System.out.println("you have selected " +browser);
			break;
		case "FF":
		
			System.out.println("you have selected " +browser);
			break;
		case "safari":
		
			System.out.println("you have selected " +browser);
			break;
		case "IE":
		
			System.out.println("you have selected " +browser);
			break;
		
		default :
				System.out.println("Please select correct browser");
		break;		
		}
		

	}

}
