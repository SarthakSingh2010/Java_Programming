import java.util.Scanner;
public class MAxMInArray
 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int max,min;
		max=min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("MINIMUM :: "+min);
		System.out.println("MAXIMUM :: "+max);
		sc.close();
	}
}