//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words=new ArrayList<Word>();
		Scanner scan = new Scanner(wordList);
		while(scan.hasNext())
		{
			words.add(new Word (scan.next()));
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int count = 0;
		
		for(int j = 0;j<words.size();j++)
		{
				if(words.get(j).getLength()==size)
				{
					count++;
				}
		}
      	return count;
	}
	
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int count = 0;
		
		for (int j=0;j<words.size();j++)
			{
			if (words.get(j).getLength()==size)
				{
					count = count+words.get(j).getNumVowels();
					words.remove(j);
					j--;
				}
		}
		return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		
		for(int j=0;j<words.size();j++)
		{
				if(words.get(j).getNumVowels()==numVowels)
				{
					count++;
				}
		}
      	return count;
	}
	
	public String toString()
	{
	   return "" + words;
	}
}