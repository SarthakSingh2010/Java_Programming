import java.io.*;
import java.lang.*;
public class RecursiveDemo
{
    public void main()throws IOException
    {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter main string");
        String str=br.readLine();
        //System.out.println("Enter sub string");
        //String str1=br.readLine();
        //int pos=str.indexOf(str1);
        //System.out.println(pos);
        //Reverse String With Recursive Method Example
        System.out.println();
        System.out.println("Example of Reverse String With Recursive Method");
        System.out.println("Main String is '"+ str + "' and Reverse String is '" + reverse(str) + "'");*/

        System.out.println();
        System.out.println("Example of Calculate sum numbers using Recursive Method");
        int arr[] = {2,5,6,8,10,12,15};
        for (int i=0;i<arr.length;i++)
        {
            if (i==0)
                System.out.print("Sum = " + arr[i] + "+");
            else if (i == (arr.length-1))
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + "+");
        }
        System.out.println(" = " + recursiveSum(arr, 0));

        System.out.println();
        System.out.println("Example of Binary Search using Recursive Method");
        for (int i=0;i<arr.length;i++)
        {
            if (i==0)
                System.out.print("int arr[] = {" + arr[i] + ",");
            else if (i == (arr.length-1))
                System.out.println(arr[i] + "} And Search For 12");
            else
                System.out.print(arr[i] + ",");
        }
        int noFound = binarysearch(arr, 12, 0, (arr.length-1));
        if (noFound == -1)
            System.out.println("Not found");
        else
            System.out.println("The element is at position " + (noFound + 1));

        System.out.println();
        System.out.println("Example of Insertion Sort using Recursive Method");
        int arr1[] = {2,6,1,5,19,12,4,8};
        System.out.println("Before sort array position");
        for (int i=0;i<arr1.length;i++)
        {
            if (i==0)
                System.out.print("int arr1[] = {" + arr1[i] + ",");
            else if (i == (arr1.length-1))
                System.out.println(arr1[i] + "}");
            else
                System.out.print(arr1[i] + ",");
        }
        insertionSort(arr1, 0);
        
        System.out.println();
        int arr2[] = {2,6,1,5,19,12,4,8};
        bubbleSort(arr2, 0);
    }
    
    public String reverse(String arg)
    {
        String tmp = null;
        if (arg.length() == 1)
        {
            return arg;
        }
        else
        {
            String lastChar = arg.substring(arg.length()-1,arg.length());
            String remainingString = arg.substring(0, arg.length() -1);
            //System.out.println(remainingString+"   "+lastChar);
            tmp = lastChar + reverse(remainingString);
            return tmp;
        }
    }
    
    public int recursiveSum(int[] numbers, int index)
    {
        int result;
        if (index < numbers.length)
        {
            result = numbers[index]; // processing
            result = result + recursiveSum(numbers, ++index); // recursive call
        }
        else
        {
            result = 0;
        }
        return result;
    }
    
    public int binarysearch(int a[], int n, int low, int high)
	{
	    int mid;
	    if (low > high)
	       return -1; //System.out.println("Not found");
	    mid = (low + high)/2;
	    //if(n == a[mid])
	        //return mid; //System.out.println("The element is at position " + (mid+1));
	    if(n < a[mid])
	    {
	        high = mid - 1;
	        return binarysearch(a, n, low, high);
	    }
	    else if(n > a[mid])
	    {
	        low = mid + 1;
	        return binarysearch(a, n, low, high);
	    }
	    else
	       return mid;
	 }
	 
	 public void insertionSort(int[] array, int index)
	 {
	     if(array.length == index)
	     {
	         System.out.println("After sort array position");
	         for (int i=0;i<array.length;i++)
	         {
	             if (i==0)
	                   System.out.print("int arr1[] = {" + array[i] + ",");
	             else if (i == (array.length-1))
	                   System.out.println(array[i] + "}");
	             else
	                   System.out.print(array[i] + ",");
	         }
	          return;
	      }
	      else
	      {
	          int j = index - 1;  //initialize j!!!
	          int key = array[index];   //take value
	          while((j >= 0) && (array[j] > key))   //(a[j].compareTo(key) > 0))
	          {
	              array[j+1] = array[j];
	              j--;
	          }
	          array[j + 1] = key;
	          insertionSort(array, ++index);
	       }
	 }
	 
	 public void bubbleSort(int[] array, int index)
	 {
	     int tmp;
	     if((array.length + 1) == index)
	     {
	         System.out.println("After sort array position");
	         for (int i=0;i<array.length;i++)
	         {
	             if (i==0)
	                   System.out.print("int arr1[] = {" + array[i] + ",");
	             else if (i == (array.length-1))
	                   System.out.println(array[i] + "}");
	             else
	                   System.out.print(array[i] + ",");
	         }
	     }
	     else
	     {
	         for(int i=0;i<array.length-1;i++)
	         {
	             if(array[i]>array[i+1])
	             {
	                 tmp = array[i];
	                 array[i]=array[i+1];
	                 array[i+1]=tmp;
	                 bubbleSort(array, ++index);
	              }
	          }
	       }
	   }
}
