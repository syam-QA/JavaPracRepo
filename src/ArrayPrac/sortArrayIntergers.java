package ArrayPrac;


import java.util.Arrays;
public class sortArrayIntergers 
{

	public static void main(String[] args)
	{
		int[] arrInt= {2,4,1,5,7,3,5,7};
		int arrIntLength=arrInt.length;
		for(int i=0;i<arrIntLength;i++)
		{
			for(int j=i+1;j<arrIntLength;j++)
			{
				if(arrInt[i]>arrInt[j])
				{
					int temp=arrInt[i];
					arrInt[i]=arrInt[j];
					arrInt[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arrInt));
	

	}

}
