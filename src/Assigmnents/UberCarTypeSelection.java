package Assigmnents;

public class UberCarTypeSelection
{

	public static void main(String[] args)
	{
		//WAP to book the specific type of car from the Uber app using Switch - Case. Car Type: Mini, Sedan, SUV, Premium If user passes wrong car type, print please select the right car type
		
String car= "Mini";
		
		switch (car)
		{
		
		case "Mini":
		System.out.println("You Have Selected " + car);
			break;
		case "Sedan":
		
			System.out.println("You Have Selected " + car);
			break;
		case "SUV":
		
			System.out.println("You Have Selected " + car);
			break;
		case "Premium":
		
			System.out.println("You Have Selected " + car);
			break;
		
		default :
				System.out.println("select the right car type");
		break;		
		}
		

	}

}
