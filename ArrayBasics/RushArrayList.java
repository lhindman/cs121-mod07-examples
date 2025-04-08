import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demonstrates the use of an ArrayList object.
 * 
 * @author Lewis/Loftus/Jain/Hindman
 * 
 */
public class RushArrayList
{
	/**
	 * Stores and modifies a list of band members.
	 * @param args
	 */
	public static void main(String[] args)
	{
		/* Declare a reference variable named band that
		*   holds a reference to the newly instanciated ArrayList object */
		ArrayList<String> band = new ArrayList<String>();

		/* Clear the VSCode terminal, only tested with Linux based Boise State Budgie VM*/
		System.out.print("\033[H\033[2J");  
		System.out.flush();

		band.add("Geddy Lee");
		band.add("Alex Lifeson");
		band.add("Neil Peart");
		
		System.out.println("Size of the band: " + band.size());
		System.out.println("Band Roster using for loop");
		
		//Iterate over the band members using a for loop. 
		for (int index = 0; index < band.size(); index++) {
			System.out.println("\t" + band.get(index));
		}
		System.out.println("\n");
		
		//Iterate over the band members using a for-each loop
		//Note that the for-each loop is simpler than a normal for loop
		System.out.println("Band Roster using for-each loop");
		for (String member: band) {
				System.out.println( "\t" + member );
		}
		System.out.println("\n");

		//Searching for a member and removing it. 
		int location = band.indexOf("Neil Peart");
		band.remove(location);
		
		//Iterate over the band members
		System.out.println("The day the music died: January 7, 2020");
		System.out.println("Thank you for the memories, goodbye my friend");
		System.out.println("Band Roster after death of The Professor");
		for (String member: band) {
			System.out.println("\t" + member);
		}	
		System.out.println("\n");


	}
}
