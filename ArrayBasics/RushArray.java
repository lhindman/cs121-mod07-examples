
/**
 * Demonstrates the use of an Arrays vs ArrayList object.
 * 
 * @author Luke Hindman
 * 
 */
public class RushArray
{
	/**
	 * Stores and modifies a list of band members.
	 * @param args
	 */
	public static void main(String[] args)
	{
		/* Declare a reference variable named bandArray that
		*   holds a reference to the newly instanciated Array object.
		*   Declare a separate variable to track the number of elements
		*   that have been added to the array. */
		String[] bandArray = new String[3];
		int numBandMembers = 0;
 
		/* Clear the VSCode terminal, only tested with Linux based Boise State Budgie VM*/
		System.out.print("\033[H\033[2J");  
		System.out.flush();

		/* Added band members at fixed indices */
		bandArray[0] = "Geddy Lee";
		numBandMembers++;
		bandArray[1] = "Alex Lifeson";
		numBandMembers++;
		bandArray[2] = "Neil Peart";
		numBandMembers++;
		
		
		/* Display some stats for the data structure */
		System.out.println("Size of the bandArray: " + bandArray.length);
		System.out.println("Number of band members: " + numBandMembers);

		/* Display the array using a for loop with indexing */
		System.out.println("Band Roster using for loop");
		for (int index = 0; index < bandArray.length; index++) {
			System.out.println("\t" + bandArray[index]);
		}
		System.out.println("\n");
		
		/* Display the array using a for-each loop */
		System.out.println("Band Roster using for-each loop");
		for (String member: bandArray) {
				System.out.println( "\t" + member );
		}
		System.out.println("\n");


		/* Implementation of indexOf operation to locate index
		 *  of band member to remove, -1 if member not found in band. */
		int location = -1;
		String memberToRemove = "Neil Peart";
		for (int i = 0; i < numBandMembers; i++) {
			if (bandArray[i].equals(memberToRemove)) {
				location = i;
				break;
			}
		}

		/* Perform bounds checking on location to ensure it is a valid location
		 *  in the array.  Then shift all array elements down one position (to the left)
		 *  to remove the specified item. Then overwrite the last position with null
		 *  and decrement the number of band members.
		 */
		if (location >= 0 && location < bandArray.length) {
			for (int i = location; i < numBandMembers - 1; i++) {
				bandArray[i] = bandArray[i+1];
			}
		}
		bandArray[numBandMembers-1] = null;
		numBandMembers--;

		/* Display some stats for the data structure */
		System.out.println(memberToRemove + " left the band... :(");
		System.out.println("Size of the bandArray: " + bandArray.length);
		System.out.println("Number of band members: " + numBandMembers);
		System.out.println("\n");

		System.out.println("The day the music died: January 7, 2020");
		System.out.println("Thank you for the memories, goodbye my friend");
		System.out.println("Band Roster after death of The Professor");
		for (String member: bandArray) {
			System.out.println("\t" + member);
		}	
		System.out.println("\n");

		/* The array is now larger than the number of band members, so lets use
		 *   index based for loop and the numBandMembers variable to we do not
		 *   see the null element. */
		System.out.println("Band Roster using for loop");
		for (int index = 0; index < numBandMembers; index++) {
			System.out.println("\t" + bandArray[index]);
		}
		System.out.println("\n");

	}
	
}
