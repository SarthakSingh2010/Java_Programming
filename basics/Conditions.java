import java.util.Random;
import java.util.Scanner;
public class Conditions {
	public static void main(String[] args) {
		//relational operator <,>,<=,>=,==,!=
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//If Else
		if(a>b)
			System.out.println(a+" is greater");
		else if(b>a)
			System.out.println(b+" is greater");
		else
			System.out.println(a+" is equal to "+b);
		//Nested If Else 
		if(a>10) {
			if (a%2==0) {
				System.out.println(a+" is even and greater than 10");
			}
			else {
				System.out.println(a+" is odd and greater than 10");
			}
		}
		else {
			System.out.println(a+" is not greater than 10");
		}
		//Switch Case
		switch(b) {
			case 0:
				System.out.println("Zero");
			    break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("In between 1 and 5");
			    break;
			default:
				System.out.println("Greater than 5");
		}
		//Random class
		Random rd=new Random();
		int k=rd.nextInt(20-11+1)+11; //a random integer 11-20
		System.out.println(k);
		
		//leap year program to demonstrate logical operator
		System.out.println("Enter a year-");
		int y=sc.nextInt();
		if(y%4==0 && y%100!=0 || y%400==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		
		//Ternary Operator
		int p=2;
		int q=(p>3)?1:-1;
		System.out.println(q);
		sc.close();
		
	}
}
