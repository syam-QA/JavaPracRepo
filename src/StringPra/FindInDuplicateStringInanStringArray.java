package StringPra;

public class FindInDuplicateStringInanStringArray {

	public static void main(String[] args) 
	{
	String [] stringArray= {"syam","Kumar","veena","dhari","ravi","syam"};
	int stringArrayLenght=stringArray.length-1;
	System.out.println(stringArrayLenght);
	for(int i=0;i<=stringArrayLenght;i++)
	{         
		for(int j=i+1;j<=stringArrayLenght;j++)
		{
			//System.out.println(stringArray[j]);
			if(stringArray[i].equals(stringArray[j]))
			{
				System.out.println(stringArray[i]);
			}
		}
		
	}
	
	}

}
