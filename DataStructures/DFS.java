package DataStructures;
import java.util.*;
public class DFS {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Matrix");
		int n=sc.nextInt();
		System.out.println("Enter name of vertices");
		char ch[]=new char[n];
		for(int i=0;i<n;i++)
			ch[i]=sc.next().charAt(0);
		System.out.println("Enter adjacency matrix::");
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		
		boolean visited[]=new boolean[n];
		Stack<Character> stack=new Stack<Character>();
		stack.push(ch[0]);
		visited[0]=true;
		int p=0;
		System.out.println("DFS::");
		while(stack.isEmpty()==false)
		{
			System.out.println("Stack "+stack);
			System.out.println(stack.pop());
			for(int i=0;i<n;i++)
			{
				if(arr[p][i]==1)
				{
					if(visited[i]==false)
					{
						stack.push(ch[i]);
						visited[i]=true;
					}
				}
			}
			if(stack.isEmpty()==false)
			p=(int)(stack.peek()-'a');
		}
		sc.close();
	}

}
