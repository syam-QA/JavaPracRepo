package Assigmnents;

public class PrintingSeriesOfNumbers
    {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		float j=10.0f;
		for(float i=1.0f;i<=j;i=i+1.0f)
		{
			System.out.println(i);
		}
		System.out.println("While Loop");
		float w=1.0f;
		while(w<=j)
		{
			System.out.println(w);
			w=w+1.0f;
		}
	   System.out.println(" For Loop 09 table ");
	   
	   int m=0,k=9,l=11;
	   for(int i=0;i<=l;i++)
	   {
		   System.out.println(i*k);
	   }
     System.out.println("While Loop 09 Table");
     
     while(m<=l)
     {
    	 System.out.println(m*k);
    	 m++;
     }

	}

}
