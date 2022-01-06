import java.util.ArrayList;
public class Sorts {

  public int swapsBubble = 0;
  public int passesBubble = 0;
  public int swapsSelection = 0;
  public int passesSelection = 0;
  public int swapsInsertion = 0;
  public int passesInsertion = 0;

  public void bubble(ArrayList<Comparable> data) {
    boolean cont = true;
    for(int i=data.size()-1; i>0; i--){
      if((data.get(i).compareTo(data.get(i-1))) < 0){
        cont = true;
        Comparable x= data.get(i);
        data.set(i, data.get(i-1));
        data.set(i-1, x);
      }
    }
    if (cont) bubble(data);
  }

  public void insertion(ArrayList<Comparable> data) {
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region


      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ((data.get(i).compareTo(data.get(i-1)))<0) {
          Comparable x = data.get(i-1);
          data.set(i-1, data.get(i));
          data.set(i, x);


        }
        else
          break;
        }
      }
    }

  public void selection(ArrayList<Comparable> data) {
    int maxPos = 0;

    for(int pass = 0; pass < data.size(); pass++) {
        maxPos=0;

      for(int i = 0; i < data.size()-pass; i++ ) {
        if (data.get(i).compareTo(data.get(maxPos))>0) {
          maxPos = i;
        }


      }
      Comparable x= data.get(data.size()-1-pass);
      data.set(data.size()-1-pass, data.get(maxPos));
      data.set(maxPos, x);


    }
  }
}
