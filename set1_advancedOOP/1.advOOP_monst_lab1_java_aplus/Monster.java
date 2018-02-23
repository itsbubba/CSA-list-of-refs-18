//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import static java.lang.System.*;

public class Monster
{
	private String name;
	private int howBig;	

	public Monster()
	{
	}

	public Monster(String n, int size)
	{
		name = n;
		howBig = size;	
	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
		if(howBig > other.getHowBig())
		{
			return true;
		}
	return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		if(!isBigger(other))
		{
			return true;
		}
		//call isBigger() use !
		return false;
	}

	public boolean namesTheSame(Monster other)
	{
		if(name.equals(other.getName()))
		{
			return false;
		}
		return false;
	}
	
	public String toString(Monster other)
	{
		String output = "";
		if(!isSmaller(other))
		{
			output = output + "Monster one is bigger than Monster two.";
		}
		else
		{
			output = output + "Monster one is smaller than Monster two.";
		}
		if(namesTheSame(other))
		{
			output = output + "\n";
			output = output + "Monster one has the same name as Monster two.";
		}
		else
		{
			output = output + "\n";
			output = output + "Monster one does not have the same name as Monster two.";
		}
		return output;
	}
}