package ArrayPrac;

public class AscendingOrderArray
{

	public static void main(String[] args) 
	{
	  int temp=0,i,j;
	  int[] arr= { 34,56,43,21,23};
	  System.out.println("Ascending Order :");
	  for(i=0;i<arr.length;i++)
	  {
		  for(j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]<arr[j])
				  
			  {
			  temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  }
		  }
      System.out.println(arr[i]);			  
			  
		  }
	  }
	  
		
}


