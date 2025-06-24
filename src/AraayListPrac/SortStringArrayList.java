package AraayListPrac;

import java.util.ArrayList;

public class SortStringArrayList 
{

	public static void  stringNameFilter(ArrayList<String> nameMethod)
	{
		for(String single : nameMethod)
		{
			if(single.toLowerCase().startsWith("s"))
			{
				System.out.println(single);
			}
		}
	}
	public static void stringSort(ArrayList<String> nameMethos)
	{
		for(int i=0;i<=nameMethos.size()-1;i++)
		{
			
			for(int j=i+1;j<nameMethos.size();j++)
			{
				if(nameMethos.get(i).compareTo(nameMethos.get(j)) < 0)
				{
					String temp =nameMethos.get(i);
					nameMethos.set(i, nameMethos.get(j));
				    nameMethos.set(j, temp);
					
				}
			}
		}
		for(String sortedName:nameMethos)
		{
			System.out.println(sortedName);
		}
	}
	
	
	public static void main(String[] args) 
	{
	
		ArrayList<String> name=new ArrayList<String>();
	     name.add("Syam");
	     name.add("Kumar");
	     name.add("sai");
	     System.out.println(name);
	     stringNameFilter(name);;
	     System.out.println("----------------------------");
	     stringSort(name);
       
	}

}
