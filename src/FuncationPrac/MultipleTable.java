package FuncationPrac;

import java.util.Scanner;

public class MultipleTable 
{

	public static void main(String[] args) 
	{
	int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Table Number : ");
		int tableNumber =input.nextInt();
		System.out.print("Enter The Mutiple Starting Number : ");
		int MutipleStartingNumber =input.nextInt();
		System.out.print("Enter The Mutiple Ending Number : ");
		int MutipleEndingNumber =input.nextInt(); 
		
		for(MutipleStartingNumber=1;MutipleStartingNumber<=MutipleEndingNumber;MutipleStartingNumber++)

		{
			System.out.println(tableNumber+"*"+MutipleStartingNumber+ "=" +(tableNumber*MutipleStartingNumber));
			
		}
	}

}
