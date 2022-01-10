/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS
Lab04 -- Never Fear, Big O is Here!
2022-01-07
*/

import java.util.ArrayList;

/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
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

  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

/*
        public static void best_worstProof() {
                ArrayList bubbleBest = new ArrayList(5);
                ArrayList bubbleWorst = new ArrayList(5);
                ArrayList insertionBest = new ArrayList(5);
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
	return "{" + out.substring(1) + "}";/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS
/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
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

  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

/*
        public static void best_worstProof() {
                ArrayList bubbleBest = new ArrayList(5);
                ArrayList bubbleWorst = new ArrayList(5);
                ArrayList insertionBest = new ArrayList(5);
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

  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

/*
        public static void best_worstProof() {
                ArrayList bubbleBest = new ArrayList(5);
                ArrayList bubbleWorst = new ArrayList(5);
                ArrayList insertionBest = new ArrayList(5);

}

  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
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

	public static int factorial(int n) {
		int product = 1;
		for (int x = 1; x <= int; x++) {
			product = product*x
		}
		return product;
	}

//Case proofs
	public static void bubbleCProof(){
		System.out.println("populating array... ");
		int [] lengths = {20, 100, 1000, 10000};
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList cats = populate(lengths[length],0,lengths[length]);
			int minops = Sort.bubble(cats);
			int maxops = Sort.bubble(cats);
			Arraylist bestCase = new Arraylist(cats.length)
			Arraylist worstCase = new Arraylist(cats.length)
			for (int x = 0; x < 5*factorial(cats.length); x++) {
				shuffle(cats);
				if (Sort.bubble(cats) <= minops) { bestCase = cats };
				else if (Sort.bubble(cats) > maxops) { worstCase = cats };
				else { continue; }
			}
			System.out.println("Bubble BestCase for length " + cats.length + ": " +
				arrayToString(bestCase) + " for " + minops + " operations ");
			System.out.println("Bubble WorstCase for length " + cats.length + ": " +
				arrayToString(worstCase) + " for " + maxops + " operatiions ");
		}
	}

        public static void insertionCProof(){
                System.out.println("populating array... ");
                int [] lengths = {20, 100, 1000, 10000};
                for (int length = 0; length < lengths.length; length ++) {
                        ArrayList cats = populate(lengths[length],0,lengths[length]);
                        int minops = Sort.insertion(cats);
                        int maxops = Sort.insertion(cats);
                        Arraylist bestCase = new Arraylist(cats.length)
                        Arraylist worstCase = new Arraylist(cats.length)
                        for (int x = 0; x < 5*factorial(cats.length); x++) {
                                shuffle(cats);
                                if (Sort.insertion(cats) <= minops) { bestCase = cats };
                                else if (Sort.insertion(cats) > maxops) { worstCase = cats };
                                else { continue; }
                        }
                        System.out.println("Insertion BestCase for length " + cats.length + ": " + 
                                arrayToString(bestCase) + " for " + minops + " operations ");
                        System.out.println("Insertion WorstCase for length " + cats.length + ": " +
                                arrayToString(worstCase) + " for " + maxops + " operatiions ");
                }
        }

        public static void selectionCProof(){
                System.out.println("populating array... ");
                int [] lengths = {20, 100, 1000, 10000};
                for (int length = 0; length < lengths.length; length ++) {
                        ArrayList cats = populate(lengths[length],0,lengths[length]);
                        int minops = Sort.bubble(cats);
                        int maxops = Sort.bubble(cats);
                        Arraylist bestCase = new Arraylist(cats.length)
                        Arraylist worstCase = new Arraylist(cats.length)
                        for (int x = 0; x < 5*factorial(cats.length); x++) {
                                shuffle(cats);
                                if (Sort.bubble(cats) <= minops) { bestCase = cats };
                                else if (Sort.bubble(cats) > maxops) { worstCase = cats };
                                else { continue; }
                        }
                        System.out.println("BestCase for length " + cats.length + ": " + 
                                arrayToString(bestCase) + " for " + minops + " operations ");
                        System.out.println("WorstCase for length " + cats.length + ": " +
                                arrayToString(worstCase) + " for " + maxops + " operatiions ");
                }
        }





//Runtime proofs
	public static void bubbleProof() {
		System.out.println("Start of bubbleProof");
		int[] lengths = {20, 100, 1000, 10000};
		// Best case
		for (int length = 0; length < lengths.length; length ++) {
			ArrayList hugo = populate(lengths[length],0,1000);
			Sorts.bubble(hugo);
			System.out.println("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
			System.out.println(arrayToString(Sorts.bubble(hugo)));

		// Worst case

		for (int i = 0; i < hugo.size(); i++) {
			hugo.set(i, (int)hugo.get(i)*-1);
		}
		//System.out.println(arrayToString(hugo));
		System.out.print("Sorting an ArrayList of size " + lengths[length] + " in descending order: ");
		System.out.println(arrayTo/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
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

  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

/*
        public static void best_worstProof() {
                ArrayList bubbleBest = new ArrayList(5);
                ArrayList bubbleWorst = new ArrayList(5);
                ArrayList insertionBest = new ArrayList(5);
String(Sorts.bubble(hugo)));
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
			System.out.println("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
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
			System.out.println("Sorting an ArrayList of size " + lengths[length] + " in ascending order: ");
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
