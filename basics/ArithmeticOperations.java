public class ArithmeticOperations {
	public static void main(String[] args) {
		int a=25,b=10;
		System.out.println(a+b); //addition
		System.out.println(a-b); //subtraction
		System.out.println(a*b); //multiplication
		System.out.println(a/b); //division (integer division)
		System.out.println(a%b); //remainder
		
		//casting
		System.out.println((double)a/b); //(floating point division)
		
		//concatenation
		String fname="Sarthak";
		String lname="Singh";
		System.out.println(fname+" "+lname);
		
		//increment and decrement operator
		int k=4;
		k+=5;
		System.out.println(k);
		k++;
		System.out.println(k);
		k--;
		System.out.println(k);
	}
}
