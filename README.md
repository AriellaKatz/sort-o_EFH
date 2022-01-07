# sort-o_EFH
Erica's Fans and Hugo (EFH): Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
Song of the Week: Somebody That I Used To Know by Gotye
## BubbleSort
* Best case: Already sorted
* Worse case: Arranged entirely in descending order  
* The number of passes depends on how quickly the array is sorted, as the program stops making passes if the previous pass employed no swaps. If the list is already sorted, no swaps will be made during the first pass, and no further passes will be made. This is the minimal amount of swaps and passes (0 swaps and 1 pass), and requires a minimal amount of time and memory. If the list is entirely in descending order, with each pass, the minimum must be "walked" from one end to the other, similarly to with insertionSort. This is the maximum number of swaps per pass. The maximum number of passes will be made as well, since a pass must be made for each element in order to walk it to the other side. This requires the maximum amount of time and memory.
## InsertionSort
* Best case: Already sorted
* Worst case: Arranged entirely in descending order  
* Regardless of the initial arrangement of elements, the same number of passes will be made, since the partition must be set the same amount of times, each time adding an element to the sorted region, and it is the moving of a partition (and the following "walk") that constitutes a pass. However, if it is already in ascending order, no swaps will be made during the pass, and a minimal amount of time and memory will be used. If it is entirely in descending order, the minimum element must be swapped with all of the other elements in order to walk it to its place; this is the maximum number of swaps per pass, and requires the maximum amount of time and memory.
## SelectionSort
* Best case: N/A
* Worst case: N/A  
* There is no best or worst case for selection sort. It makes a set number of passes, regardless of the initial arrangement of the elements (in our code, n passes are made, where there are n elements in the list). It makes a set number of swaps per pass: 1. In our code, if the maximum value is already in its place, it is effectively swapped with itself. It uses the same process, and thus the same memory and time, so this must still be counted as a swap. So, the same number of passes and swaps will be made regardless of the arrangement of the elements.
