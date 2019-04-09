import java.util.Scanner;

public class UserInput 
{
	 static Scanner sc = new Scanner(System.in);
	 
	public static void main(String args[])
	{
		System.out.println("enter a number: ");
		if(sc.hasNextInt()== true)
		{
			int num=sc.nextInt();
			System.out.println(num);
		}
		else
		{
			System.out.println("input is not a integer");
		}
		sc.close();
	}

}
