import java.util.Arrays;
import java.util.Scanner;

public class Kth_MaxMin_Array 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter lenght of array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("enter elements :");
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter the kth position");
		int k=sc.nextInt();
		approachOne(arr, k);
		approachTwoMax(arr, k);
		approachTwoMin(arr, k);
		sort(arr);
		printArray(arr);
		sc.close();
	}
	public static void approachOne(int a[],int k) //O(n*log n)
	{
		Arrays.sort(a);
		System.out.println("Approach 1 "+k+"th max : "+a[a.length-k]);
		System.out.println("Approach 1 "+k+"th min : "+a[k-1]);
	}
	public static void approachTwoMax(int a[],int k) //O(n*k)
	{
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println("Approach 2 "+k+"th max : "+a[a.length-k]);
	}
	public static void approachTwoMin(int a[],int k) //O(n*k)
	{
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println("Approach 2 "+k+"th min : "+a[a.length-k]);
	}
	public static void sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
	}
	public static void printArray(int arr[])
	{
		System.out.println("printing array:");
		for(int a:arr)
			System.out.print(a+" ");
		System.out.println();
	}
}
