package Assigmnents;

public class EnviromentCheck 
{

	public static void main(String[] args) 
	{
		// WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		
		String s= "Syam";
		
		switch (s)
		{
		
		case "Dev":
		System.out.println("Dev Environment");
			break;
		case "QA":
		
			System.out.println("QA Environment");
			break;
		case "UAT":
		
			System.out.println("UAT Environment");
			break;
		case "Stage":
		
			System.out.println("Stage Environment");
			break;
		case "Prod":
		
			System.out.println("Prod Environment");
			break;
		default :
				System.out.println("Enter Proper Environment");
		break;		
		}
		

	}

}
