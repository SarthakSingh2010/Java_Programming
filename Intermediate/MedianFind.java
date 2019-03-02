import java.util.Arrays;
import java.util.Scanner;
public class MedianFind 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("enter elements");
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.print("Median is :: ");
		if(n%2==0)
			System.out.println(a[n/2]+" "+a[(n/2)+1]);
		else
			System.out.println(a[(n+1)/2]);
		sc.close();
	}

}
