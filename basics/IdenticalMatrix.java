import java.util.*;
public class IdenticalMatrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st matrix row and column");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int arr1[][]=new int [r1][c1];
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				arr1[i][j]=sc.nextInt();
		System.out.println("Enter 2nd matrix row and column");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int arr2[][]=new int [r2][c2];
		for(int i=0;i<r2;i++)
			for(int j=0;j<c2;j++)
				arr2[i][j]=sc.nextInt();
		System.out.println("Identical Check");
		if(r1==r2 && c1==c2)
		{
			boolean flag=true;
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					if(arr1[i][j]!=arr2[i][j])
						{
							flag=false;
							break;
						}
				}
				if(flag==false)
					break;
			}
			if(flag==true)
				System.out.println("Identical");
			else
				System.out.println("Not Identical");
		}
		else
			System.out.println("Not Identical");
		sc.close();
		
	}
}