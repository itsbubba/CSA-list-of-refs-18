//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		//instantiate monster one
		Monster one = new Monster(name1, size1);
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		//instantiate monster two
		Monster two = new Monster(name2, size2);
		System.out.println("");
		System.out.println("Monster 1 - " + name1 + " " + size1);
		System.out.println("Monster 2 - " + name2 + " " + size2);
		System.out.println(one.toString(two));
	}
}