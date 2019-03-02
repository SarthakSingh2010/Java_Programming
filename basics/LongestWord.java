import java.util.Scanner;
public class LongestWord {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.trim();
		s+=' ';
		System.out.println("Longest Word:: "+longest(s));
		System.out.println("Lenght :: "+longest(s).length());
		sc.close();
	}
	public static String longest(String s) 
	{
		String k="",maxk="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				k+=s.charAt(i);
			}
			else
			{
				if(k.length()>maxk.length())
					maxk=k;
				k="";
			}
		}
		return maxk;
	}
}