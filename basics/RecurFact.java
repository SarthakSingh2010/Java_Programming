import java.util.Scanner;
public class RecurFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int p=fact(a);
		System.out.println(p);
		sc.close();
	}
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		return(n*fact(n-1));
	}
}
