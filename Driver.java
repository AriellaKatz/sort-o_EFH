/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS
Lab04 -- Never Fear, Big O is Here!
01-07-2021
*/

import java.util.ArrayList;

public class Driver{
	public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
			//     offset + rand int on interval [lo,hi]
			retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
			size--;
		}
		return retAL;
	}

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
	public static void best_worstProof() {
		ArrayList bubbleBest = new ArrayList(5);
		ArrayList bubbleWorst = new ArrayList(5);
		ArrayList insertionBest = new ArrayList(5);
		ArrayList insertionWorst = new ArrayList(5);
		ArrayList selectionBest = new ArrayList(5);
		ArrayList selectionWorst = new ArrayList(5);
		ArrayList hugo = new ArrayList(5);
		hugo.add(1);
		hugo.add(3);

		hugo.add

	}
	*/

	public static void bubbleProof() {
		System.out.println("Start of bubbleProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList hugo = populate(lengths[length],0,1000);
			Sorts.bubble(hugo);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			System.out.println(arrayToString(Sorts.bubble(hugo)));

		// Worst case

		for (int i = 0; i < hugo.size(); i++) {
			hugo.set(i, (int)hugo.get(i)*-1);
		}
		//System.out.println(arrayToString(hugo));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		System.out.println(arrayToString(Sorts.bubble(hugo)));
	}
	System.out.println("End of bubbleProof");

	}

	public static void insertionProof() {
		System.out.println("Start of insertionProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList hugo = populate(lengths[length],0,1000);
			Sorts.insertion(hugo);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			System.out.println(arrayToString(Sorts.insertion(hugo)));

		// Worst case

		for (int i = 0; i < hugo.size(); i++) {
			hugo.set(i, (int)hugo.get(i)*-1);
		}
		//System.out.println(arrayToString(hugo));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		System.out.println(arrayToString(Sorts.insertion(hugo)));
	}
	System.out.println("End of insertionProof");

	}

	public static void selectionProof() {
		System.out.println("Start of selectionProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList hugo = populate(lengths[length],0,1000);
			Sorts.selection(hugo);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			System.out.println(arrayToString(Sorts.selection(hugo)));

		// Worst case

		for (int i = 0; i < hugo.size(); i++) {
			hugo.set(i, (int)hugo.get(i)*-1);
		}
		//System.out.println(arrayToString(hugo));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		System.out.println(arrayToString(Sorts.selection(hugo)));
	}
	System.out.println("End of selectionProof");

	}

	public static void main(String[] args) {
		bubbleProof();
		insertionProof();
		selectionProof();
	}

}
