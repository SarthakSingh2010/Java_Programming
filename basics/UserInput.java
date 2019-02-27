import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 number-");
		int a1=sc.nextInt();
		byte a2=sc.nextByte();
		short a3=sc.nextShort();
		long a4=sc.nextLong();
		System.out.println("Enter 2 decimal number-");
		double b=sc.nextDouble();
		float c=sc.nextFloat();
		System.out.println("Enter a character-");
		char d=sc.next().charAt(0);
		System.out.println("Enter a string without spaces- ");
		String f=sc.next();
		System.out.println("Enter a boolean value-");
		boolean g=sc.nextBoolean();
		System.out.println(a1+" "+a2+" "+a3+" "+a4);
		System.out.println(b+" "+c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		sc.close();
	}
}
