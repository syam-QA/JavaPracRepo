package ArrayPrac;

public class arrayPrime {

	public static void main(String[] args) 
	{  
        int[] n={4,6,7,8,9,13};
        //int temp=0;
        for(int j=0;j<n.length;j++)
        {
            int temp=0;
            //boolean isPrime = true;
        for(int i =2;i<=n[j]/2;i++)
        {
            if(n[j]%i==0)
            {
                temp++;
                break;
                //System.out.println(temp);
            }
        }
if(temp==0)
    {
        System.out.println("Given number is prime "+ n[j]);
    }   
    else
     {
        System.out.println("Given number is  not prime "+ n[j]);
    }
    
        }
    // TODO Auto-generated method stub

	}

}
