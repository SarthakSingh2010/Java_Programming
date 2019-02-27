public class BreakAndContinue {
	public static void main(String[] args) {
		//break
		for(int i=1;i<=10;i++) {
			if (i==5)
				break;
			else
				System.out.println(i);
		}
		System.out.println("-----------------------");
		//continue
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				continue;
			else
				System.out.println(i);
		}
	}
}
