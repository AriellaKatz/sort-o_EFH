# sort-o_EFH
Erica's Fans and Hugo (EFH): Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple  
Song of the Week: Somebody That I Used To Know by Gotye
## BubbleSort (optimized)
* Best case: Already sorted
  * Runtime complexity: *O(n)*  
  As described below, if the list is already sorted in ascending order, it makes one pass with 0 swaps (this is because our code for BubbleSort only continues onto additional passes if a swap has been made in the most recent pass), regardless of the length of the list. The number of compares will be n-1, since during this single pass, the rightmost element will be compared with each of the other elements, so increasing n by 1 increases the number of compares by 1. As the length increases, the runtime complexity is linear because the number of passes is constant (1), the number of swaps is constant (0), and the number of compares is linear (n-1), so the total number of procedures is linear:  
  *1 + 0 + (n-1)*  
  *n*  
  This is linear.
  * We tested this using array sizes of 20, 100, 1000, 10000. Our results showed that to sort arrays of these sizes, the sum of passes, swaps, and compares were as follows:  
  *{20, 100, 1000, 10000}*
  * This fits our hypothesis that while the array is in ascending order, there is a linear, 1-to-1 ratio between array size and total opperations. 
![Handwritten_2022-01-10_164610](https://user-images.githubusercontent.com/90857207/148844920-efaa5ef6-7513-4c45-aaff-b8719356e2da.jpg)

* Worse case: Arranged entirely in descending order  

  * Runtime complexity: *O(n^2)*  
 
  * Suppose you have an list, A, of length n. As described below, an array of length n+1, B, will have n+1 passes (n passes to walk all but the greatest element to the other side of the list, plus one more pass afterwards that requires no swaps/walking, telling the program the sort is over). All of the passes in A will require the same number of swaps as in B, except for the first pass in B, which requires one more swap (an n number of swaps), since it has another element. Thus, increasing the length of a list by 1 increases the number of passes by 1 and the number of swaps by n, the previous length of the list. A list has the following number of swaps:  
  
  *(n-1) + (n-2) + (n-3) + (n-4) + ... + (n-n)*  
  *n * n - (1+2+3+4+...+n)*  
  *n * n - (n+1)n/2*  
  *n^2 - (n^2 + n)/2*  
  *n^2/2 - n/2*  
  
  The number of compares is equal to the number of swaps, since every compare dictates a swap (this is what makes descending order the worst case). Then, we add the number of passes (n), the number of swaps (n^2/2 - n/2), and the number of compares (n^2/2 - n/2) for the total number of procedures in one sort:  
  
  *(n) + (n^2/2 - n/2) + (n^2/2 - n/2)*  
  *(n) + 2(n^2/2 - n/2)*  
  *n + n^2 - n*  
  *n^2*  
  This is on the order of n^2.  
   * The number of passes depends on how quickly the array is sorted, as the program stops making passes if the previous pass employed no swaps. (This is what makes our implementation of BubbleSort optimized, rather than "vanilla".) If the list is already sorted, no swaps will be made during the first pass, and no further passes will be made. This is the minimal amount of swaps and passes (0 swaps and 1 pass), and requires a minimal amount of time and memory. If the list is entirely in descending order, with each pass, the minimum must be "walked" from one end to the other, similarly to with insertionSort. This is the maximum number of swaps per pass. The maximum number of passes will be made as well, since a pass must be made for each element in order to walk it to the other side. This requires the maximum amount of time and memory.  

   * We tested this using array sizes of 20, 100, 1000, 10000. Our results showed that to sort arrays of these sizes, the sum of passes, swaps, and compares were as follows:  
   *{400, 10000, 1000000, 100000000}*  
   * This fits the prediction that BubbleSort is on the order of n^2, as the sums grow quadratically.  
  
## InsertionSort
* Best case: Already sorted
  * Runtime complexity: *O(n)*  
  As described below, given a list of length n, n-1 passes are made regardless of the arrangement of elements, so increasing n by 1 increases the number of passes by 1, linearly. Since it is already in ascending order, however, still no swaps will be made during the added pass, and the total number of swaps remains constant (0). The number of compares is equal to the number of passes, n-1. Adding the number of passes, swaps, and compares gives:  
  *(n-1) + 0 + (n-1)*  
  *2n-2*  
 This is linear.  
  * We tested this using array sizes of 20, 100, 1000, 10000. Our results showed that to sort arrays of these sizes, the sum of passes, swaps, and compares were as follows:  
  *{38, 198, 1998, 19998}* 
  * This fits our hypothesis that while the array is in ascending order, there is a linear, 1-to-1 ratio between array size and total opperations. 
   
* Worst case: Arranged entirely in descending order  
  * Runtime complexity: *O(n^2)*  
  Again, increasing the length by 1 increases the number of passes by 1. If the list is in descending order, the number of swaps per pass, if there are m elements within the partition, is equal to m-1. With every pass, m increases by 1, so the number of swaps increases by 1 as well. So, increasing n by 1 adds m swaps, where m was the number of elements in the largest partition; m = the previous n, so a list of length n+1 has the number of swaps of a list of length n, plus n. Thus, a list has the following number of swaps:  
  *0 + 1 + 2 + 3 + 4 + ... + (n-1)*  
  *(n-1)n/2*  
  *n^2/2 - n/2*  
  The number of compares is equal to the number of swaps, because every compare dictates a swap (this is what makes it the worst case). Then, we add the number of passes (n-1), the number of swaps (n^2/2 - n/2), and the number of compares (n^2/2 - n/2) for the total number of procedures in one sort:  
  *(n-1) + (n^2/2 - n/2) + (n^2/2 - n/2)*  
  *n^2 - 1*  
  This is on the order of n^2.
  * Regardless of the initial arrangement of elements, the same number of passes will be made, since the partition must be set the same amount of times, each time adding an element to the sorted region, and it is the moving of a partition (and the following "walk") that constitutes a pass. However, if it is already in ascending order, no swaps will be made during the pass, and a minimal amount of time and memory will be used. If it is entirely in descending order, the minimum element must be swapped with all of the other elements in order to walk it to its place; this is the maximum number of swaps per pass, and requires the maximum amount of time and memory.
  * We tested this using array sizes of 20, 100, 1000, 10000. Our results showed that to sort arrays of these sizes, the sum of passes, swaps, and compares were as follows:  
  *{399, 9999, 999999, 99999999}* 
  * This fits the prediction that InsertionSort is on the order of n^2, as the sums grow quadratically.  
## SelectionSort
* Best case: N/A
  * Runtime complexity: *O(n^2)*  
  As described below, given a list of length n, n passes are made. Thus, increasing n by 1 increases the number of passes by 1. Within each pass, a linear search is made to find the maximum value, and exactly 1 swap is made, to swap the maximum to the position farthest to the right, even if this means swapping the maximum element with itself. So, with 1 swap per pass, there are n swaps per sort. For compares, n compares are made in the first pass to find the maximum of the entire list, then n-1 compares are made in the next pass to find the maximum of the list excluding the maximum already found, the n-2, and so forth, until 1 compare is made in the last pass (the leftmost element with itself): the total number of compares is equal to:  
  *n + (n-1) + (n-2) + (n-3) + (n-(n-1))*  
  *n * n - (0+1+2+3+...+(n-1))*  
  *n^2 - (n-1)n/2*  
  *n^2/2 + n/2*  
Adding the number of passes, swaps, and compares gives:  
*n + n + (n^2/2 + n/2)*  
*n^2/2 + 3n/2*  
This is on the order of n^2.
* Worst case: N/A  
  * Runtime complexity: *O(n^2)*  
  As described below, the number of passes, swaps, and compares is the same regardless of the case (best, worst, or somewhere in between), so the runtime complexity is also the same for the best and worst cases. 
  * There is no best or worst case for selection sort. It makes a set number of passes, regardless of the initial arrangement of the elements (in our code, n passes are made, where there are n elements in the list). It makes a set number of swaps per pass: 1. In our code, if the maximum value is already in its place, it is effectively swapped with itself. It makes a set number of compares per pass as well, as the compares are used to find the maximum and the same process is used to find the maximum regardless of arrangement. It uses the same process, and thus the same memory and time, so this must still be counted as a swap. So, the same number of passes and swaps will be made regardless of the arrangement of the elements.
* We tested this using array sizes of 20, 100, 1000, 10000. Our results showed that to sort arrays of these sizes, the sum of passes, swaps, and compares were as follows:  
*{250, 5250, 502500, 50025000}*
* This supports our hypothesis that for SelectionSort, the amount of total opperations vs. time is on the order of n^2, as the sums grow quadratically. 
