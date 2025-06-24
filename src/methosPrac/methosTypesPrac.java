package methosPrac;

public class methosTypesPrac 
{

	public void name()
	{
		System.out.println("No return and No inmput ");
		int a=19,b=34,c=56,total;
		total=a+b+c;  
	}
	 
	public String crossBrowser(String url) 
	{
		System.out.println(" return and No inmput ");
		if(url.equals(null))
		{
			System.out.println("Url can't be Null");
		}
			
		if(url.equals("chrome"))
		{
			System.out.println("Chrome browser");
		}
		return url;
			
	}
	public void noReturnType(int a,int b)
	{
		
	}
	public static void main(String[] args) 
	{
	
		methosTypesPrac M =new methosTypesPrac();
		M.name();
		M.crossBrowser("chrome");
		
	}

}
