//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int s;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		s = size;
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int t = 0;
		for(int j = 1; j < s; j++)
		{
			if(pups[j].getAge()>pups[t].getAge())
			{
				t = j;
			}
		}
		return pups[t].getName();
	}

	public String getNameOfYoungest()
	{
		int t = 0;
		for(int j = 1; j < s; j++)
		{
			if(pups[j].getAge()<pups[t].getAge())
			{
				t = j;
			}
		}
		return pups[t].getName();
	}
	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}