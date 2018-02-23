//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot] = m;
		//put m in the Monster array at [spot]
	}

	public Monster getLargest( )
	{
		int yuge = 0;
		int place = 0;
		for(int j = 0; j < myMonsters.length; j++)
		{
			if(myMonsters[j].getHt() > yuge)
			{
				yuge = myMonsters[j].getHt();
				place = j;
			}	
		}
		return myMonsters[place];
	}

	public Monster getSmallest( )
	{
		int small = Integer.MAX_VALUE;
		int place = 0;
		for(int j = 0; j < myMonsters.length; j++)
		{
			if(myMonsters[j].getHt() > small)
			{
				small = myMonsters[j].getHt();
				place = j;
			}	
		}
		return myMonsters[place];
	}

	public String toString()
	{
		return Arrays.toString(myMonsters);
	}
}