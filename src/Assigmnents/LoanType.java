package Assigmnents;

public class LoanType
{

	public static void main(String[] args) 
	{
		// WAP to define the interest rate on the basis of Loan type using Switch Case
        //Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
       //For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		String LoanType="EL";
		int Salary=6000;
		float interestRate = 0 ;
		
		switch (LoanType)
		{
		
		case "HL":
			if(Salary<=35000)
			{
		System.out.println(" NOT APPLICABLE FOR Housing Loan");
		break;
			}
			else
				interestRate= 6.9f;
				System.out.println("HL interestRate is: " +interestRate);
			break;
		case "PL":
		
			interestRate= 11.9f;
			System.out.println("PL interestRate is: " +interestRate);
			break;
		case "CL":
			interestRate= 13.9f;
			System.out.println("CL interestRate is: " +interestRate);
			break;
		case "EL":
			interestRate= 29f;
			System.out.println("EL interestRate is: " +interestRate);
			break;
		
		default :
				System.out.println("Please select correct Loan Type");
		break;		
		}

	}

}
