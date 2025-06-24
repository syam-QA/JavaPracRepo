package ArrayPrac;

public class CreatingAArray 
{

	public static void main(String[] args) 
	{
        //  Single Array declaration and assigning values Method One    
		int []i= {1,3,5};
		
		System.out.println(i[0]);
		System.out.println(i[1]);		
		System.out.println(i[2]);	
		
		//Single array declaration and assigning the values Method two.
		int [] j = new int[3];
		j[0]=23;
		j[1]=35;
		j[2]=13;
		
		System.out.println(j[0]);
		System.out.println(j[1]);		
		System.out.println(j[2]);
		
		
	}

}
