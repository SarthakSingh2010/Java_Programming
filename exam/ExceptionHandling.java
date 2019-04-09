 

import java.util.*;

/*
 * exception is just an object created when ever an error occur and it tells u what specific error occurred
 */
public class ExceptionHandling 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		divideByZero(2);
		System.out.println("enter ur age");
		int age=getAge();
		if(age!=0)
		System.out.println(age);
		sc.close();
	}
	public static void divideByZero(int a)
	{
		// try to catch an error or exception
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)  // that e is ArithmeticException class's object name
		{
			System.out.println("you divided it by zero"); 
		}
		catch(Exception e)   // use this only when u dont know what error it might have
		{
			System.out.println("some error occured");
		}
		finally  // weather there is exception or not it is going to execute
		{
			System.out.println("over");
		}
	}
	public static int getAge()
	{
		try
		{
			return sc.nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println("invalid age");
			return 0;
		}
		
	}
	
}
