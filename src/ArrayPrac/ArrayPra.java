package ArrayPrac;
import java.util.Arrays;
public class ArrayPra 
{

	public static void main(String[] args) 
	{
	//Array declaration method 1 
		int [] arr= new int[4];
		int temp=0;  
	arr[0]=13;
	arr[1]=4;
	arr[2]=-3;
	arr[3]=60;
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
		
	}
	
	System.out.println("Sort logic");
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
		
		
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		}
		  System.out.println(arr[i]);	
		
	}
	
	String a[]= new String [5];
	a[0]="Syam";
		System.out.println(Arrays.toString(a));
	
		float Floa[]=new float[5];
	Floa[0]=2;
	Floa[1]=77f;
	Floa[2]=77f;
	Floa[3]=44;
	Floa[4]=66f;
	
	System.out.println(Floa[0]);
		Arrays.sort(Floa);
		
		for(float flo:Floa )
			System.out.println(flo);
		
		
		
	
	}

}