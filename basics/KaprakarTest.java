import java.util.Scanner;
public class KaprakarTest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check(n));
		sc.close();
	}

	public static boolean check(int n) 
	{
		String sq=Integer.toString(n*n);
		int a=Integer.parseInt(sq.substring(0,sq.length()/2));
		int b=Integer.parseInt(sq.substring(sq.length()/2));
		System.out.println(a+" + "+b);
		if(a+b==n)
			return true;
		return false;
	}
}
