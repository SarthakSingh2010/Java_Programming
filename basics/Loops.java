public class Loops {
	public static void main(String[] args) {
		//for loop
		for (int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//while loop sum of digit
		int k=123,s=0;
		while(k!=0) {
			s+=(k%10);
			k/=10;
		}
		System.out.println(s);
		int arr[]=new int[10];
		for (int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		//for each loop
		for (int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//do while first execute then check
		int p=11;
		do {
			System.out.println(p);
			p++;
		}while(p<=10);
	}

}
