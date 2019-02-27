public class Scope {
	static int x;//class variable
	public static void main(String[] args) {
		x=5;
		System.out.println(x);
		doSomething();
		System.out.println(x);
		doSomethingLocally();
	}
	static void doSomething() {
		x=10;
	}
	static void doSomethingLocally() {
		int y=20;//local variable
		System.out.println(y);
	}

}
