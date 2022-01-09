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

	public static void bubbleProof() {
		// Best case
		ArrayList hugo = populate(10,0,1000);
		Sorts.bubble(hugo);
		System.out.print("Sorting an ArrayList in ascending order: ");
		System.out.println(arrayToString(Sorts.bubble(hugo)));

		// Worst case
		for (int i = 0; i < hugo.size(); i++) {
			hugo.set(i, (int)hugo.get(i)*-1);
		}
		//System.out.println(arrayToString(hugo));
		System.out.print("Sorting an ArrayList in descending order: ");
		System.out.println(arrayToString(Sorts.bubble(hugo)));

	}
	public static void main(String[] args) {
		bubbleProof();
	}

}
