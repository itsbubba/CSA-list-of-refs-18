//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		
		setList("");
	}
	

	public NumberAnalyzer(String numbers)
	{
		setList(numbers);
		
	}
	
	public void setList(String numbers)
	{
		list = new ArrayList<Number>();
		Scanner scan = new Scanner(numbers);
		
		while(scan.hasNextInt()) 
		{
			list.add(new Number(scan.nextInt()));
		}
	}


	public int countOdds()
	{
      int odds=0;
      
		for(int x = 0; x < list.size(); x++) 
		{
			if(list.get(x).isOdd())
			{
				odds++;
			}
		}
      return odds;
	}

	public int countEvens()
	{
		
      int evens=0;
      
		for(int j = 0; j < list.size(); j++) 
		{
			if(!list.get(j).isOdd())
			{
				 evens++;
			}
		}
      return evens;
	}

	public int countPerfects()
	{
		int perfects=0;
		
		for(int j = 0; j < list.size(); j++)
		{
			if(list.get(j).isPerfect()) 
			{
				perfects++;
			}
		}
      return perfects;
	}
	
	public String toString( )
	{
		return "" + list;
	}
}