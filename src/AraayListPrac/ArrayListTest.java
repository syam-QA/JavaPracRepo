package AraayListPrac;

import java.util.ArrayList;

public class ArrayListTest
{

	public static void main(String[] args)
	{
		ArrayList<String> ar= new ArrayList();
		System.out.println(ar.size());
		ar.add("syam");
		ar.add("Naveen");
		ar.add("Bharat");
		ar.add("Sravan");
		ar.add("Sai");
		System.out.println(ar.size());
		for(String arr : ar)
		{
			//System.out.println(arr);
			
			if(arr.toLowerCase().startsWith("s"))
			{
				System.out.println(arr);
			}
		}

	}

}
