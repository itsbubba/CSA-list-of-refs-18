//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import static java.lang.System.*;

public class Word
{
   private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		
	}

	public Word(String wrd)
	{
		word=wrd;
	}

	public void setWord(String wrd)
	{
		word=wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
		int len=word.length();
		
		vowels = "aeiouAEIOU";
		for(int j = 0;j < len;j++)
		{
			if (vowels.indexOf(word.charAt(j))>-1)
			{
				count++;
			}

		}
		return count;
	}
	
	public int getLength()
	{
		int length = word.length();
		return length; 
	}

	public String toString()
	{
	   return "" + word;
	}
}