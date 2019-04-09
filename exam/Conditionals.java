public class Conditionals
{

	public static void main(String[] args) 
	{
		if(true | true)
			System.out.println("yes t | t"); //print
		if(true | false)
			System.out.println("yes t | f"); //print
		if(false | false)
			System.out.println("yes f | f"); //not print
		if(true & true)
			System.out.println("yes t & t"); //print 
		if(true & false)
			System.out.println("yes t & f"); // not print
		if(false & false)
			System.out.println("yes f & f"); // not print
		if(true ^ true)
			System.out.println("yes t xor t"); //not print
		if(false ^ true)
			System.out.println("yes f xor t"); //print
		if(false ^ false)
			System.out.println("yes f xor f"); //not print
		
		
		char ch='B';
		switch(ch)
		{
		case 'a':
		    System.out.println("this is a");
		    break;
		case 'b':
		case 'B':  // allows u to check for 'b' and 'B' as well
			System.out.println("this is b");
			break;
		case 'c':
			System.out.println("this is c");
			break;
		default:
			System.out.println("input error");
			break;
			
		}

	}

}