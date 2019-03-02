import java.util.*;
public class BFS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Matrix");
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
		List<Character> queue=new LinkedList<Character>();
		queue.add(ch[0]);
		visited[0]=true;
		int p=0;
		System.out.println("BFS::");
		while(queue.isEmpty()==false)
		{
			System.out.println("Queue:: "+queue);
			System.out.println(queue.remove(0));
			for(int i=0;i<n;i++)
			{
				if(arr[p][i]==1)
				{
					if(visited[i]==false&&queue.contains(ch[i])==false)
					{
						queue.add(ch[i]);
						visited[i]=true;
					}
				}
			}
			if(queue.isEmpty()==false)
			p=(int)(queue.get(0)-'a');
		}
		sc.close();
	}
}