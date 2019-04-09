class Spiral
{
    public static void main(int n)
    {
        int arr[][]=new int[n][n];
        int k=1,c1=0,r1=0,r2=n-1,c2=n-1;
        while(k<=(n*n))
        {
            for(int i=c1;i<=c2;i++)
            arr[r1][i]=k++;
            for(int i=r1+1;i<=r2;i++)
            arr[i][c2]=k++;
            for(int i=c2-1;i>=c1;i--)
            arr[r2][i]=k++;
            for(int i=r2-1;i>=r1+1;i--)
            arr[i][c1]=k++;
            c1++;
            c2--;
            r1++;
            r2--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}