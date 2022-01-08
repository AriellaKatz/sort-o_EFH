# sort-o_EFH
Erica's Fans and Hugo (EFH): Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple  
Song of the Week: Somebody That I Used To Know by Gotye
## BubbleSort
* Best case: Already sorted
  * Runtime complexity: 1  
  As described below, if the list is already sorted in ascending order, it makes one pass with 0 swaps (this is because our code for BubbleSort only continues onto additional passes if a swap has been made in the most recent pass), regardless of the length of the list. As the length increases, the runtime complexity is constant.
* Worse case: Arranged entirely in descending order  
  * Runtime complexity: n^2  
  Suppose you have an list, A, of length n. As described below, an array of length n+1, B, will have n+1 passes (n passes to walk all but the greatest element to the other side of the list, plus one more pass afterwards that requires no swaps/walking, telling the program the sort is over). All of the passes in A will require the same number of swaps as in B, except for the first pass in B, which requires one more swap (an n number of swaps), since it has another element. Thus, increasing the length of a list by 1 increases the number of passes by 1 and the number of swaps by n, the previous length of the list. A list has the following number of swaps: (n-1) + (n-2) + (n-3) + (n-4) + ... + (n-n) -> n * n - (1+2+3+4+...+n) -> n * n - (n+1)n/2 -> n^2 - (n^2 + n)/2 -> n^2/2 - n/2
* The number of passes depends on how quickly the array is sorted, as the program stops making passes if the previous pass employed no swaps. If the list is already sorted, no swaps will be made during the first pass, and no further passes will be made. This is the minimal amount of swaps and passes (0 swaps and 1 pass), and requires a minimal amount of time and memory. If the list is entirely in descending order, with each pass, the minimum must be "walked" from one end to the other, similarly to with insertionSort. This is the maximum number of swaps per pass. The maximum number of passes will be made as well, since a pass must be made for each element in order to walk it to the other side. This requires the maximum amount of time and memory.
## InsertionSort
* Best case: Already sorted
  * Runtime complexity: 1
  As described below, given a list of length n, n-1 passes are made regardless of the arrangement of elements, so increasing n by 1 increases the number of passes by 1, linearly. Since it is already in ascending order, however, still no swaps will be made during the added pass, and the total number of swaps remains constant (0).
* Worst case: Arranged entirely in descending order  
  * Runtime complexity: n^2  
  Again, increasing the length by 1 increases the number of passes by 1. If the list is in descending order, the number of swaps per pass, if there are m elements within the partition, is equal to m-1. With every pass, m increases by 1, so the number of swaps increases by 1 as well. So, increasing n by 1 adds m swaps, where m was the number of elements in the largest partition; m = the previous n, so a list of length n+1 has the number of swaps of a list of length n, plus n. Thus, a list has the following number of swaps: 0 + 1 + 2 + 3 + 4 + ... + (n-1) -> (n-1)n/2 -> n^2/2 - n/2
* Regardless of the initial arrangement of elements, the same number of passes will be made, since the partition must be set the same amount of times, each time adding an element to the sorted region, and it is the moving of a partition (and the following "walk") that constitutes a pass. However, if it is already in ascending order, no swaps will be made during the pass, and a minimal amount of time and memory will be used. If it is entirely in descending order, the minimum element must be swapped with all of the other elements in order to walk it to its place; this is the maximum number of swaps per pass, and requires the maximum amount of time and memory.
## SelectionSort
* Best case: N/A
  * Runtime complexity: n  
  As described below, given a list of length n, n-1 passes are made. Thus, increasing n by 1 increases the number of passes by 1. Within each pass, another, "inner" pass is made to find the maximum value, and exactly 1 swap is made, to swap the maximum to the position farthest to the right, even if this means swapping the maximum element with itself. Thus, with each pass, 1 swap is made, so increasing the number of "outer" passes by 1 increases the number of swaps by 1, and as follows, increasing n by 1 increases the number of swaps by 1. They have a linear relationship. 
* Worst case: N/A  
  * Runtime complexity: n  
  As described below, the number of passes and swaps is the same regardless of the case (best, worst, or somewhere in between), so the runtime complexity is also the same for the best and worst cases. 
* There is no best or worst case for selection sort. It makes a set number of passes, regardless of the initial arrangement of the elements (in our code, n-1 passes are made, where there are n elements in the list). It makes a set number of swaps per pass: 1. In our code, if the maximum value is already in its place, it is effectively swapped with itself. It uses the same process, and thus the same memory and time, so this must still be counted as a swap. So, the same number of passes and swaps will be made regardless of the arrangement of the elements.
