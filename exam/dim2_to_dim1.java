import java.util.*;
class dim2_to_dim1
{
    public static void main(String sart[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of matrix row and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int [r][c];
        int cout=0,cout1=0;
        int b[]=new int[r*c];
        int a1[][]=new int [r][c];
        System.out.println("enter the elements:");
        for(int w=0;w<r;w++)
        {
            for(int r1=0;r1<c;r1++)
            {
                a[w][r1]=sc.nextInt();
            }
        }
        for(int w=0;w<r;w++)
        {
            for(int r1=0;r1<c;r1++)
            {
                b[cout++]=a[w][r1];
            }
        }
        System.out.println("1d array:");
        for(int q=0;q<b.length;q++)
        {
        System.out.print(b[q]+"  ");
        }
        System.out.println("\n1d sorted array:");
        Arrays.sort(b);
        for(int q=0;q<b.length;q++)
        {
        System.out.print(b[q]+"  ");
        }
        System.out.println("\n2d sorted array:");
        for(int w=0;w<r;w++)
        {
            for(int r1=0;r1<c;r1++)
            {
                a1[w][r1]=b[cout1++];
            }
        }
        for(int w=0;w<r;w++)
        {
            for(int r1=0;r1<c;r1++)
            {
                System.out.print(a1[w][r1]+"  ");
            }
            System.out.println();
        }
    }
}