import java.util.Scanner;
public class PrimeFactors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factors are::");
		int i=2;
		while(n!=0)
		{
			if(prime(i))
			{
				if(n%i==0)
				{
					System.out.print(i+" ");
					n=n/i;i--;
				}
			}
			i++;
		}
		sc.close();
	}
	public static boolean prime(int n)
	{
		if(n<2)
			return false;
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}