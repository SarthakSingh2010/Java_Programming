import java.util.ArrayList;
import java.util.Scanner;

public class AllSubStringOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String subs[]=new String[(n*(n+1))/2];
		ArrayList<String> permlist=new ArrayList<String>();
		subs=generateAllSubString(s);
		permlist=permutation("",s);
		System.out.println("\n\nDispalying substring\n\n");
		display(subs);
		System.out.println("\n\nDisplaying permutations\n\n");
		for(String p:permlist)
			System.out.println(p);
		sc.close();
	}

	private static ArrayList<String> permutation(String prefix,String str) 
	{
	    ArrayList<String> permutations = new ArrayList<>();
	    int n = str.length();
	    if (n == 0) {
	        permutations.add(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutations.addAll(permutation(prefix+ str.charAt(i), str.substring(0, i) + str.substring(i + 1, n)));
	    }
	    return permutations;
	}

	private static void display(String[] subs)
	{
		for(int i=0;i<subs.length;i++)
		{
			System.out.println(subs[i]);
		}
	}

	private static String[] generateAllSubString(String s) 
	{
		int n=s.length();
		int c=0;
		String subs[]=new String[(n*(n+1))/2];//n(n+1)/2 substring possible
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				subs[c++]=s.substring(i,j+1);	
			}
		}
		return subs;
	}
}