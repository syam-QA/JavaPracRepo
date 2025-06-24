package Assigmnents;

public class PrintMultiOf5in1To100
{

	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("For Loop");
		for(int i=1;i<=100;i++)
		{
			if(i%n==0)
				System.out.println(i);
				
		}
		System.out.println("While");
		int j=1;
		while(j<=100)
		{
			if(j%n==0)
				System.out.println(j);
			j++;
		}
		System.out.println("Do While ");
		int d=1;
		do
		{
			if(d%n==0)
				System.out.println(d);
			d++;
		}
		while(d<=100);

	}
  	
}
