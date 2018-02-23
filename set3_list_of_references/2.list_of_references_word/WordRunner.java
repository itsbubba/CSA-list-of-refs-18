//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word fowl = new Word("Fowl");
		out.println(fowl);
		
		out.println("Number of vowels:  "+fowl.getNumVowels());
		out.println("Number of characters:  "+fowl.getLength()+"\n");
		
		
		fowl = new Word("Chicken");
		out.println(fowl);
		
		out.println("Number of vowels:  "+fowl.getNumVowels());
		out.println("Number of characters:  "+fowl.getLength()+"\n");
		
		
		fowl = new Word("Alligator");
		out.println(fowl);
		
		out.println("Number of vowels:  "+fowl.getNumVowels());
		out.println("Number of characters:  "+fowl.getLength()+"\n");
		
		
		fowl = new Word("Elephant");
		out.println(fowl);
		
		out.println("Number of vowels:  "+fowl.getNumVowels());
		out.println("Number of characters:  "+fowl.getLength());
	}
}