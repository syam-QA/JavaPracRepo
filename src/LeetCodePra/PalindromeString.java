package LeetCodePra;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		String word="Syam";
		int wordLength=word.length()-1;
		String wordTemp="";

		String lowserCaseWord=word.toLowerCase();
		System.out.println(word + " and " +lowserCaseWord+ " and "+wordLength);
		for(int i=wordLength;i>=0;i--)
		{
			wordTemp = wordTemp+word.charAt(i);
		}
		System.out.println(wordTemp);
	       
	}

}
