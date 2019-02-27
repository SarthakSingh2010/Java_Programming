import java.util.Scanner;
public class ClassAndMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-");
		int n=sc.nextInt();
		System.out.println(square(n));
		sayHello();
		sayHelloTo("Sarthak");
		sc.close();
	}
	static void sayHello() {
		System.out.println("Hello World");
	}
	static void sayHelloTo(String s) {
		System.out.println("Hello "+s);
	}
	static int square(int n) {
		return n*n;
	}
}
