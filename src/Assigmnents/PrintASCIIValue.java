package Assigmnents;

public class PrintASCIIValue 
{

	public static void main(String[] args)
	{
	 int j=(char)'Z';
	 for(int i=(char)'A';i<=j;i++)
	 
	 {
	 System.out.println((char)i +" " +i);
	 }
	 //Type caste
	 
	 int d=(char)'a',e=(char)'z';
	 
	 while(d<=e)
	 {
	 System.out.println((char)d + " " +d);
	 d++;
	 }
     
	 int z=(char)'0',n=(char)'9';
	 do 
	 {
		System.out.println((char)z + " " +z );
		z++;
	 }
	 while(z<=n);
	 
	}

}
