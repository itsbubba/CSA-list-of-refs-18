//� A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References


import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzerRunner
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		out.println(test);
		out.println("odd count = "+test.countOdds());
		out.println("even count = "+test.countEvens());
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");	
		test = new NumberAnalyzer("5 12 3 7 28 496 81 65 33 11");
		out.println(test);
		out.println("odd count = " + test.countOdds());
		out.println("even count = " + test.countEvens());
		out.println("perfect count = " + test.countPerfects()+"\n\n\n");
		test = new NumberAnalyzer("1 2 3 4 5 6 7 8 11 13 151 16 17 18 19 20");
		out.println(test);
		out.println("odd count = " + test.countOdds());
		out.println("even count = " + test.countEvens());
		out.println("perfect count = " + test.countPerfects()+"\n\n\n");

		//add more test cases	
	}
}