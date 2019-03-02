import java.util.*;
public class MergeArrayUsingCollections {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght of 1st array::");
		int n1=sc.nextInt();
		System.out.println("Enter lenght of 2nd array::");
		int n2=sc.nextInt();
		List<Integer> lis1=new ArrayList<Integer>(n1);
		List<Integer> lis2=new ArrayList<Integer>(n2);
		System.out.println("Enter "+n1+" elements in 1st array::");
		for(int i=0;i<n1;i++)
			lis1.add(sc.nextInt());
		System.out.println("Enter "+n2+" elements in 2nd array::");
		for(int i=0;i<n2;i++)
			lis2.add(sc.nextInt());
		List<Integer> lis3=new ArrayList<Integer>(n1+n2);
		for(int i:lis1)
			lis3.add(i);
		for(int i:lis2)
			lis3.add(i);
		Collections.sort(lis3);
		System.out.println("Displaying sorted merge Output::");
		for(int i:lis3)
			System.out.println(i);
		sc.close();
	}
}