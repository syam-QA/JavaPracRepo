package ArrayPrac;

public class DecendingOrderArray 
{

	public static void main(String[] args) 
	{
	
int temp=0,i,j;
int [] Darr= new int[5];
Darr[0]=105;
Darr[1]=1007;
Darr[2]=05;
Darr[3]=2098;
Darr[4]=2305;
System.out.println("Decending Order Array :");
for(i=0;i<Darr.length;i++)
{
	for(j=i+1;j<Darr.length;j++)
	{
		if(Darr[i]<Darr[j])
		{
			temp=Darr[i];
			Darr[i]=Darr[j];
			Darr[j]=temp;
					
		}
	}
	System.out.println(Darr[i]);
}

	}

}
