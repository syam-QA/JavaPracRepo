package StringPra;

public class ConvertStringToInterger {

	public static void main(String[] args)
	{
	final String number="55";
	try {
	int cNumber=Integer.parseInt(number);
	System.out.println(cNumber);
	}
	catch (NumberFormatException e) {
		System.out.println("All character Given String is not digits : " +e);
	}
	finally {
		System.out.println("finally block");
	}
	
	String name="syam";
	String name2=new String(name);
	System.out.println(name=name2);
	System.out.println(name.equalsIgnoreCase(name2));
	
	char c='e';
	int n=(int)c;
    System.out.println(n);
	}

}
