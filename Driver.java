
/*
Erica's Fans and kats (EFH) -- kats Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS
Lab04 -- Never Fear, Big O is Here!
2022-01-07
*/

import java.util.ArrayList;

public class Driver{

	/*
	public static ArrayList populateOrdered( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
			//     offset + rand int on interval [lo,hi]
			retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
			size--;
		}
		return retAL;
	}
	*/

	public static ArrayList populateOrdered( int size ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			retAL.add(i);
		}
		return retAL;
	}

//NEW STUFF
/*
	public static ArrayList orderedPop(int size, int lo, int hi){
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		retAL.populateOrdered(size, lo, hi);
		Sorts.optimizedBubble(retAL);
	}
*/

/*
public static ArrayList orderedPop()
*/
	public static String arrayToString(int[] a) {
		String out = "";
		for (int e : a) {
			out += ","+e;
		}
		return "{" + out.substring(1) + "}";
	}

	public static String arrayToString(ArrayList<Integer> a) {
	String out = "";
	for (int e : a) {
		out += ","+e;
	}
	return "{" + out.substring(1) + "}";
}

/*
HELP
1) I tried to populateOrdered an ordered array before optimizedBubbleProof but I got cannot find symbol
errors (see orderedPop)
2) I also tried creating an ordered array completely outside of every method. I still
got cannot find symbol method. (You can probably try this again, just populateOrdered with a for loop)
I might've done it wrong
3) I tried moving the print statement after the second optimizedBubble sort and the numbers came out different.
I left it like this so you can compare it. Maybe im just blind
*/

	public static void optimizedBubbleProof() {
		System.out.println("Start of optimizedBubbleProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {


			// NEW STUFF
			ArrayList kats = populateOrdered(lengths[length]);

			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: \n");
			Sorts.optimizedBubble(kats);

		// Worst case

		for (int i = 0; i < kats.size(); i++) {
			kats.set(i, (int)kats.get(i)*-1);
		}
		//System.out.println(arrayToString(kats));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: \n");
		Sorts.optimizedBubble(kats);
	}
	System.out.println("End of optimizedBubbleProof");

	}

	public static void insertionProof() {
		System.out.println("Start of insertionProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList kats = populateOrdered(lengths[length]);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: \n");
			Sorts.insertion(kats);

		// Worst case

		for (int i = 0; i < kats.size(); i++) {
			kats.set(i, (int)kats.get(i)*-1);
		}
		//System.out.println(arrayToString(kats));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: \n");
		Sorts.insertion(kats);
	}
	System.out.println("End of insertionProof");

	}

	public static void selectionProof() {
		System.out.println("Start of selectionProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList kats = populateOrdered(lengths[length]);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: \n");
			Sorts.selection(kats);

		// Worst case

		for (int i = 0; i < kats.size(); i++) {
			kats.set(i, (int)kats.get(i)*-1);
		}
		//System.out.println(arrayToString(kats));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: \n");
		Sorts.selection(kats);
	}
	System.out.println("End of selectionProof");

	}

	public static void main(String[] args) {
		optimizedBubbleProof();
		insertionProof();
		selectionProof();
	}

}
