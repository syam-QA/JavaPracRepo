package ArrayPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RemoveSecondLargestElement {

	public static void main(String[] args)
	{
	Integer[] numberSer= {23,34,1,35,23,34};
	ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(numberSer));
    //ArrayList<Integer> numbersd = new ArrayList<>(Arrays.asList(numberSer));
    Collections.sort(numbers);
	int largeNUmber=numbers.get(numbers.size()-1);
	int secondLargest = Integer.MIN_VALUE;
	System.out.println(secondLargest);
	for(int i=numberSer.length-2;i>=0;i--)
	{
		if(numbers.get(i)<largeNUmber)
		{
		secondLargest=numbers.get(i);
		 System.out.println("Second largest: " + secondLargest);
         break;
		
		}
	}
	  numbers.removeAll(Collections.singleton(secondLargest));

      System.out.println("Array after removing all second largest: " + numbers);
	}

	
}
