//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/2/2017
//Class - 3rd Period
//Lab  - References

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		System.out.println("");
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
			//ask for ht
			System.out.print("Enter the ht :: ");
			int ht = keyboard.nextInt();
			//ask for wt
			System.out.print("Enter the wt :: ");
			int wt = keyboard.nextInt();
			//ask for age
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			System.out.println("");
			//instantiate a new Monster() and add it to the herd
			Monster fluffy = new Monster(ht, wt, age);
			herd.add(i,fluffy);			
			
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		System.out.println("SMALLEST :: " + herd.getSmallest());
		System.out.println("LARGEST :: " + herd.getLargest());
		//print out the other stats
			
	}		
}