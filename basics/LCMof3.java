import java.util.*;
public class LCMof3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements::");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements for LCM computing::");
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLong();
		long lcm=arr[0];
		for(int i=1;i<n;i++)
			lcm=LCM(lcm,arr[i]);
		System.out.println("LCM is :: "+lcm);
		sc.close();
	}
	private static long LCM(long a,long b)
	{
		return (a*b)/HCF(a,b);
	}
	private static long HCF(long a,long b)
	{
		for(long i=Math.max(a, b);i>=1;i--)
			if(a%i==0 && b%i==0)
				return i;
		return 1;
	}

}