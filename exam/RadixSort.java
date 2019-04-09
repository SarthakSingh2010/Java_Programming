/**
 ** Java Program to Implement Radix Sort
 **/
 
import java.util.Scanner;
 
/** Class RadixSort **/
public class RadixSort 
{
    /** Radix Sort function **/
    public static void sort( int[] a)
    {
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }    
    /** Main method **/
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Radix Sort Test\n");
        int n, i;
        /** Accept number of elements **/
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /** Create integer array on n elements **/
        int arr[] = new int[ n ];
        /** Accept elements **/
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /** Call method sort **/
        sort(arr);
        /** Print sorted Array **/
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();                     
    }    
}





/****************************************************************************
 * Author: Isai Damier
 * Title: Radix Sort
 * Project: geekviewpoint
 * Package: algorithms
 *
 * Statement:
 *   Given a disordered list of integers, rearrange them in natural order.
 *
 * Sample Input: {18,5,100,3,1,19,6,0,7,4,2}
 *
 * Sample Output: {0,1,2,3,4,5,6,7,18,19,100}
 *
 * Time Complexity of Solution:
 *   Best Case O(k*n); Average Case O(k*n); Worst Case O(k*n),
 *   where k is the length of the longest number and n is the
 *   size of the input array.
 *
 *   Note: if k is greater than log(n) then an n*log(n) algorithm would be a
 *         better fit. In reality we can always change the radix to make k
 *         less than log(n).
 *
 * Approach:
 *   radix sort, like counting sort and bucket sort, is an integer based
 *   algorithm (i.e. the values of the input array are assumed to be
 *   integers). Hence radix sort is among the fastest sorting algorithms
 *   around, in theory. The particular distinction for radix sort is that it
 *   creates a bucket for each cipher (i.e. digit); as such, similar to
 *   bucket sort, each bucket in radix sort must be a growable list that may
 *   admit different keys.
 *
 *   For decimal values, the number of buckets is 10, as the decimal system
 *   has 10 numerals/cyphers (i.e. 0,1,2,3,4,5,6,7,8,9). Then the keys are
 *   continuously sorted by significant digits.
 ***************************************************************************/