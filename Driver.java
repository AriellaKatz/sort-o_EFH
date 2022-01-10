/*
Erica's Fans and kats (EFH) -- kats Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS
Lab04 -- Never Fear, Big O is Here!
2022-01-07
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


	public static void bubbleProof() {
		System.out.println("Start of bubbleProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList kats = populate(lengths[length],0,1000);
			Sorts.bubble(kats);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			Sorts.bubble(kats);

		// Worst case

		for (int i = 0; i < kats.size(); i++) {
			kats.set(i, (int)kats.get(i)*-1);
		}
		//System.out.println(arrayToString(kats));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		Sorts.bubble(kats);
	}
	System.out.println("End of bubbleProof");

	}

	public static void insertionProof() {
		System.out.println("Start of insertionProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList kats = populate(lengths[length],0,1000);
			Sorts.insertion(kats);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			Sorts.insertion(kats);

		// Worst case

		for (int i = 0; i < kats.size(); i++) {
			kats.set(i, (int)kats.get(i)*-1);
		}
		//System.out.println(arrayToString(kats));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		Sorts.insertion(kats);
	}
	System.out.println("End of insertionProof");

	}

	public static void selectionProof() {
		System.out.println("Start of selectionProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList kats = populate(lengths[length],0,1000);
			Sorts.selection(kats);
			System.out.print("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			Sorts.selection(kats);

		// Worst case

		for (int i = 0; i < kats.size(); i++) {
			kats.set(i, (int)kats.get(i)*-1);
		}
		//System.out.println(arrayToString(kats));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		Sorts.selection(kats);
	}
	System.out.println("End of selectionProof");

	}

	public static void main(String[] args) {
		bubbleProof();
		insertionProof();
		selectionProof();
	}

}
