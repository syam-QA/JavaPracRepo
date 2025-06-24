package Assigmnents;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SeparateLowerAndUpperAndNumberInString 
{

	public static void main(String[] args) 
	{
	String Letter="sNcaM58";
	//charAt
	List<Character> sLetter = new ArrayList<>();
	List<Character> cLetter = new ArrayList<>();
	List<Character> dLetter =new ArrayList<>();
	
	System.out.println(Letter);
	for(int i=0; i<Letter.length();i++)
	{
		
			if(Character.isLowerCase(Letter.charAt(i)))
		
	{
		
		sLetter.add(Letter.charAt(i));
		
	}
	else if (Character.isUpperCase(Letter.charAt(i)))
	{
		cLetter.add(Letter.charAt(i));
	}
	else if (Character.isDigit(Letter.charAt(i)))
	{
		dLetter.add(Letter.charAt(i));
	}
		
	}
	 StringBuilder builder = new StringBuilder();  
	  for (Character ch : sLetter) 
	  {  
          builder.append(ch);  
      }  
	  String strl=builder.toString();
     System.out.println(strl);
	 StringBuilder builderC = new StringBuilder(); 
	  for (Character ch:cLetter) 
	  {  
          builderC.append(ch);  
      }  
	  String strc=builderC.toString();
	System.out.println(strc);
	
	StringBuilder builderD = new StringBuilder(); 
	  for (Character ch:dLetter) 
	  {  
        builderD.append(ch);  
    }  
	  String strd=builderD.toString();
	System.out.println(strd);
	
	}

}
 