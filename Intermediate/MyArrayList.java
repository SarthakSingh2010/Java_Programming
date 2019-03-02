import java.util.*;
import java.io.*;
public class MyArrayList {
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length::");
		int n=sc.nextInt();
		List<Integer> lis=new ArrayList<Integer>(n);
		System.out.println("Enter elements::");
		for(int i=0;i<n;i++)
			lis.add(sc.nextInt());
		Collections.sort(lis);
		System.out.println("Sorted ArrayList::");
		for(int a:lis)
			System.out.println(a);
		System.out.println("Enter an element to search::");
		int k=sc.nextInt();
		int p=Collections.binarySearch(lis,k);
		if(p>=0)
		System.out.println("Found at :: "+p);
		else
		System.out.println("Not found");
		System.out.println("Make all elements zero Y or N");
		char ch=sc.next().charAt(0);
		if(ch=='Y'||ch=='y')
		Collections.fill(lis,0);
		System.out.println("Displaying List::");
		for(int i:lis)
			System.out.println(i);
		lis.removeAll(lis);
		System.out.println("Displaying List after removing all elements ::");
		for(int i:lis)
			System.out.println(i);
		System.out.println("Add 1 to "+n+" ::");
		for(int i=1;i<=n;i++)
			lis.add(i);
		System.out.println("Displaying List after adding elements ::");
		for(int i:lis)
			System.out.println(i);
		Collections.reverse(lis);
		System.out.println("Displaying Reverse List after adding elements ::");
		for(int i:lis)
			System.out.println(i);
		int max=Collections.max(lis);
		int min=Collections.min(lis);
		System.out.println("Maximum value in list :: "+max);
		System.out.println("Minimum vaue in list:: "+min);
		lis.add(0);
		lis.add(0);
		System.out.println("Displaying List after adding elements 0 0 :: ");
		for(int i:lis)
			System.out.println(i);
		Collections.replaceAll(lis,0,10);
		System.out.println("Displaying List after replacing elements 0 with 10 :: ");
		for(int i:lis)
			System.out.println(i);
		Collections.sort(lis);
		Collections.reverse(lis);
		System.out.println("Sorted display::");
		for(int i=0;i<lis.size();i++)
			System.out.println(lis.get(i));
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<lis.size();i++)
			hs.add(lis.get(i));
		System.out.println("Displaying Set\nWithout Duplicates");
		for(int i:hs)
			System.out.println(i);
		System.out.println("Occurrances of Number");
		List<Integer> unique =new ArrayList<Integer>();
		for(int i:hs)
			unique.add(i);
		System.out.println("Displaying Unique list::");
		for(int i:unique)
			System.out.println(i);
		int count=0;
		for(int i=0;i<unique.size();i++) {
			count=0;
			for(int j=0;j<lis.size();j++) {
				if(unique.get(i)==lis.get(j))
					count++;
			}
			System.out.println(unique.get(i)+" found "+count+" times");
		}
		sc.close();
	} 
}