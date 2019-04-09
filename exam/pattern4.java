class pattern4
{
    public static void main(String args[])
    {
        int i,j,n=5,m=4,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println( );
        for(k=m;k>=1;k--)
        {
            System.out.print(k);
        }
        System.out.println( );
        m--;
        n--;
       }
    }
}