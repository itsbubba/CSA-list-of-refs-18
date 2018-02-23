//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

public class Number
{
	private Integer number;

	public Number()
	{
	}

	public Number(int num)
	{
		number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		boolean x = true;
		if(number%2 == 0)
		{
			 x = false;
		}
	return x;
	}

	public boolean isPerfect()
	{
		boolean y = true;
		int total=0;
		for(int j = 1; j < number; j++)
		{
			if(number%j == 0)
			{
				total = total + j;
			}
		}
		return (number==total);
	}
	
	public String toString()
	{
		return number.toString();
	}
}