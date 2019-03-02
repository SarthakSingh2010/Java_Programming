import java.util.Scanner;
public class CalculateVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int vowel=0,consonant=0;
		for(int i=0;i<s.length();++i)
		{
			char ch=s.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
			default:
				consonant++;
			}
		}
	System.out.println("vowel     : "+vowel);
	System.out.println("consonant : "+consonant);
	sc.close();
	}
}