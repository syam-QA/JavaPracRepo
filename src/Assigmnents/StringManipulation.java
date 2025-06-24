package Assigmnents;

public class StringManipulation
{

	public static void main(String[] args) 
	{
		String bag="  Hi prat the string manipulation metods i   ";
		
		System.out.println("this will print numbers of charter in a string including the spaces as well (interger value):" +bag.length());
		System.out.println( "this will print the particular character at index ppoint :"+bag.charAt(13));
		System.out.println( "this will print the code point at index ppoint :"+bag.codePointAt(13));
		System.out.println( "this will print the code point vavlue of the before character of the index value at index ppoint:"+bag.codePointBefore(13));
		System.out.println( "this will print the code point at index ppoint :"+bag.codePointCount(18, 20));
		
		System.out.println( bag.indexOf('i'));
		System.out.println( bag.indexOf('i', bag.indexOf('i')+1));
		System.out.println( bag.indexOf('i', bag.indexOf('i',bag.indexOf('i')+1)+1));
		System.out.println( bag.indexOf('i', bag.indexOf('i', bag.indexOf('i', bag.indexOf('i')+1)+1)+1));
		System.out.println( bag.indexOf('i', bag.indexOf('i', bag.indexOf('i', bag.indexOf('i', bag.indexOf('i')+1)+1)+1)+1));
		System.out.println(bag.indexOf("string"));
		
		System.out.println( bag.indexOf('Z'));
		
		System.out.println(bag.trim());
		
		System.out.println(bag.replace(' ', '_'));
		System.out.println(bag.toLowerCase());
		System.out.println(bag.toUpperCase());
		String str[]=bag.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println("******************");
			System.out.println( str[i] +" "+str[i].length());
		}
		
		String ola = "hi.escape.character";
		
		String strr[]=ola.split("\\.");
		System.out.println(strr[1]);
		
        String successMessg = "your order id is 12345";
		
		System.out.println(successMessg.substring(6));
		System.out.println(successMessg.substring(17));
		System.out.println(successMessg.substring(successMessg.indexOf("is")+3,successMessg.length()));
		
		
		
		
		//
		
		
	}

}
