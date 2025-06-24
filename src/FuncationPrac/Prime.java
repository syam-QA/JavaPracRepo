package FuncationPrac;

public class Prime 
{

	public static void main(String[] args) 
	{
		int o,p,c=0,n=150;
		for (o=50;o<=n;o++)
		{
					for(p=2;p<=o/2;p++)
				{	
					if(o%p==0)
					{
						c=c+1;
					}
				}
		if(c==0)
		{
			System.out.println(o);
		}
        else
		{
		c=0;
		}
		}
	}	
}
