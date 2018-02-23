//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

public class BlackJackCard extends Card
{
	private int value;

  	//constructors
  	public BlackJackCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		if( getFace() == 1 )
			return 11;
		if( getFace() >= 10 )
			return 10;
		return getFace();
	}

  	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }