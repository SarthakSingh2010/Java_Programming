import java.util.Scanner;
public class SpellNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Spell(n);
		System.out.println(s);
		sc.close();
	}
	public static String Spell(int n)
	{
		String ty[]= {"","","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
		String o[]= {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
		String ten[]= {"","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
		String s="";
		if(n<1||n>9999)
			return s;
		int th=n/1000;
		int hr=(n/100)%10;
		int tens=(n/10)%10;
		int ones=n%10;
		if(th!=0)
			s+=o[th]+"Thousand ";
		if(hr!=0)
			s+=o[hr]+"Hundred ";
		if(tens==1)
			s+=ten[ones+1];
		else
			s+=ty[tens]+o[ones];
		return s;
	}
}
