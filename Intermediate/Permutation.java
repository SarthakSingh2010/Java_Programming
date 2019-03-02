import java.util.Scanner;
public class Permutation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		permute(s.toCharArray(),0,s.length());
		sc.close();
	}
	public static void permute(char arr[],int k,int n)
	{
		if(k==n)
			display(arr);
		else
			for(int i=k;i<n;i++)
			{
				char t1=arr[k];
				arr[k]=arr[i];
				arr[i]=t1;
				
				permute(arr,k+1,n);
				
				char t2=arr[k];
				arr[k]=arr[i];
				arr[i]=t2;
				
			}
	}
	public static void display(char s[])
	{
		for(char a:s)
			System.out.print(a);
		System.out.println();
	}
}
