package ArrayPrac;

public class sortArrayString {

	
	public static String[] stringsSortFunctio(String[] arrayOfStrings)
	{
		int arrayLenght=arrayOfStrings.length;
		System.out.println("Before sorting the array :");
		for(String StrinValues:arrayOfStrings)
		{
			System.out.println(StrinValues);
		}		
		for(int i=0;i<=arrayLenght;i++)
		{
			for(int j=i+1;j<arrayLenght;j++)
			{
			if(arrayOfStrings[i].compareTo(arrayOfStrings[j])>0)
				{
					String temp=arrayOfStrings[i];
					arrayOfStrings[i]=arrayOfStrings[j];
					arrayOfStrings[j]=temp;
				}
			}
		}
		 return arrayOfStrings;
    }
	
	public static void main(String[] args) 
	{
		String[] names= {"Syam","Veena","Kumar","Vijaya","Pavani"};
		stringsSortFunctio(names);
		 System.out.println("\nAfter sorting:");
	        for (String name :names ) {
	            System.out.println(name);
	        }
		
	}

}
