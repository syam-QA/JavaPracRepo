package Assigmnents;

public class PrintEvenAndOdd
{

	public static void main(String[] args) 
	{
		int n=2;
		System.out.println("For Loop");
		for(int i=1;i<=100;i++)
		{
			if(i%n==0)
			{
				System.out.println("Even number " +i);
			}
			
		}
		for(int k=1;k<=100;k++)
		{
			if(k%n==1)
			{
				System.out.println("odd number " +k);
			}
		
		}
		
	}
  	
}
