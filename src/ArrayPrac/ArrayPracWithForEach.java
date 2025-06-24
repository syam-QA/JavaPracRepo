package ArrayPrac;

public class ArrayPracWithForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = new int[5];
		number[0]=109;
		number[1]=110;
		number[2]=111;
		number[3]=112;
		number[4]=113;
		//number[5]=113;
		System.err.println(number.length);
		for(int n:number)
		{
			System.out.println(n);
		}
		
		System.out.println("Printing the array in reverse order using for each loop");
		int reve =number.length-1;
		for(int r : number)
		{
			r=reve;
			System.out.println(number[r]);
			reve--;
		}
		

	}

}
