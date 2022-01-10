/*
Erica's Fans and Hugo (EFH) -- Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS
Lab04 -- Never Fear, Big O is Here!
2022-01-07
*/

import java.util.ArrayList;

public class Sorts {

  public static String arrayToString(int[] a) {
		String out = "";
		for (int e : a) {
			out += ","+e;
		}
		return "{" + out.substring(1) + "}";
	}

  public static void optimizedBubble(ArrayList<Comparable> data) {
    int swapsoptimizedBubble = 0;
    int passesoptimizedBubble = 0;
    int comparesoptimizedBubble = 0;
    for(int passes = 0; passes < data.size(); passes++) {
      passesoptimizedBubble++;
          boolean sorted = true;
          for(int index = data.size()-1; index > passes; index--) {
            comparesoptimizedBubble++;
            if(data.get(index).compareTo(data.get(index-1)) <= 0) {
              swapsoptimizedBubble++;
              Comparable temp = data.get(index);
              data.set(index, data.get(index-1));
              data.set(index-1, temp);
              sorted = false; // basically determines whether or not a swap happens
            }
          }
          if(sorted) {
            break;
          }
        }
        int[] ret = new int[4];
        ret[0] = swapsoptimizedBubble;
        ret[1] = passesoptimizedBubble;
        ret[2] = comparesoptimizedBubble;
        ret[3] = ret[0] + ret[1] + ret[2];

        System.out.println("Swaps: "+ ret[0]);
        System.out.println("Passes: "+ ret[1]);
        System.out.println("Compares: "+ ret[2]);
        System.out.println("Swaps+Passes+Compares: "+ ret[3]);

      }


  public static void insertion(ArrayList<Comparable> data) {
    int swapsInsertion = 0;
    int passesInsertion = 0;
    int comparesInsertion = 0;

    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region
      //a pass in insertion is considered one walk through a
      // partitioned region
      passesInsertion++;

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        comparesInsertion++;
        if ((data.get(i).compareTo(data.get(i-1)))<0) {
          Comparable x = data.get(i-1);
          data.set(i-1, data.get(i));
          data.set(i, x);
          swapsInsertion++;

        }
        else
          break;
        }
      }

      int[] ret = new int[4];
      ret[0] = swapsInsertion;
      ret[1] = passesInsertion;
      ret[2] = comparesInsertion;
      ret[3] = ret[0] + ret[1] + ret[2];

      System.out.println("Swaps: "+ ret[0]);
      System.out.println("Passes: "+ ret[1]);
      System.out.println("Compares: "+ ret[2]);
      System.out.println("Swaps+Passes+Compares: "+ ret[3]);

    }


  public static void selection(ArrayList<Comparable> data) {
    int swapsSelection = 0;
    int passesSelection = 0;
    int comparesSelection = 0;
    int maxPos = 0;

    for(int pass = 0; pass < data.size(); pass++) {
        maxPos=0;
      passesSelection++;
      for(int i = 0; i < data.size()-pass; i++ ) {
        comparesSelection++;
        if (data.get(i).compareTo(data.get(maxPos))>0) {
          maxPos = i;
        }
      }
      Comparable x= data.get(data.size()-1-pass);
      data.set(data.size()-1-pass, data.get(maxPos));
      data.set(maxPos, x);
      swapsSelection++;
    //even if the swap is with itself, it requires the same
    // amount of time and memory so it must still be counted
    }


    int[] ret = new int[4];
    ret[0] = swapsSelection;
    ret[1] = passesSelection;
    ret[2] = comparesSelection;
    ret[3] = ret[0] + ret[1] + ret[2];

    System.out.println("Swaps: "+ ret[0]);
    System.out.println("Passes: "+ ret[1]);
    System.out.println("Compares: "+ ret[2]);
    System.out.println("Swaps+Passes+Compares: "+ ret[3]);
  }

}
