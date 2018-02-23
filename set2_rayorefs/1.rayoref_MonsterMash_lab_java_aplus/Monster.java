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
	private int height;
	private int weight;
	private int age;

	public Monster()
	{
	}

	public Monster(int ht, int wt, int num)
	{
		height = ht;
		weight = wt;
		age = num;
	}
	public int getHt()
	{
		return height;
	}
	public String toString()
	{
		return height + " " + weight + " " + age;
	}
}
