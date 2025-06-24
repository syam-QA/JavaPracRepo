package Assigmnents;

public class PrintStringFiveTimeWithCount 
{

	public static void main(String[] args) 
	{
		String S="I am Batman";
		
		System.out.println("For Loop");
		for(int i=1; i<=9;i++)
		{
			System.out.println(S + " " + i);
		}
		
		System.out.println("While ");
		int j=1;
		
		while( j<=9)
		{
			System.out.println(S + " " + j);
			j++;
		}
		
		System.out.println("Do While");
		 int f=1;
		 do 
		 {
			 System.out.println(S + " " + f);
			 f++;
		}
		 while(f<=9);
		
	}

}
