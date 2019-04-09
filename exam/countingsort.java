/* there is a drawback of counting sort
 * Counting sort is a very fast sorting algorithm. Unfortunately it can't be always used because of the initial conditions needed.
   Input: A[1...n] with the assumption that 0 <= A[i] <= k for a certain k. If k is too large, the algorithm 
   becomes inefficient in terms either of running time or of memory usage.
   Output: B[1...n] sorted.
 */
import java.util.Arrays;
 class countingsort{
public static void countingSort(int[] a, int low, int high)
{
    int[] counts = new int[high - low + 1]; // this will hold all possible values, from low to high
    for (int x : a)
        counts[x - low]++; // - low so the lowest possible value is always 0
 
    int current = 0;
    for (int i = 0; i < counts.length; i++)
    {
        Arrays.fill(a, current, current + counts[i], i + low); // fills counts[i] elements of value i + low in current
        current += counts[i]; // leap forward by counts[i] steps
    }
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
}
}




/*
 * Let me start with counting sort. 

Counting sort is different from the normal sorting approach (like Merge Sort, Quick Sort, Heap sort etc.) generally known as comparison sort. The worst case for any comparison sort is O(n log(n)).

Counting sort does the sorting of elements in linear time O(n). Generally any sorting which can be accomplished in linear time makes some assumption on the data provided. In case of counting sort, The assumption made is that the max value in a given set of “n” items is “k”, (where k = O(n)) then the sort runs in linear time.

Let’s see some example.

Consider i/p array as “A”.
A = [0, 3, 1, 0, 5, 2, 4, 5, 2]

We have o/p array as “B” and “C” as temp work storage.

Algorithm
.     Initialize “B” with size same a A.

.     Get the max element from the array. (O (n)). Here max element for array A is 5.

.     Initialize the temp work storage array of size that of max element found in step 1.
      Hence size of array is 5.

.     Iterate over array “A” and keep the count of items in array “C” for every element in A”.
      (for ex i/p (A) contains 2 0’s. Hence C[0] = 2. Similarly C[1] = 1). This step can be one
      in O(n). After this step C = [2, 1, 2, 1, 1, 2].

.     Now iterate over C and add the elements such that any index of C contains the sum of
      the elements at index “i” and its previous elements. After this step we have 
      C = [2, 3, 5, 6, 7, 9]. Hence now, c[i] = (count of elements in A <= i).


.     Now iterate over array “A” in reverse (i.e. from A.length to 1) and do the following.
                                           for i=A.length to 1
                                                B[C[A[i]] = A[i];
                                                C[A[i]] = C[A[i]] – 1;

Now let's have a look at the code.

 */