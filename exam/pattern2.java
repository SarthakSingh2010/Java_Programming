class pattern2
{
    public static void main(String args[])
    {
        int i,k;
        int j,x=5,n=0;
        for(i=5;i>=1;i--)
        {
                for(j=0;j<i;j++)
                {
                    System.out.print(x);
                }
                for(k=1;k<=n;k++)
                {
                    System.out.print(k);
                }
           System.out.println( );
           n++;
       }
       for(i=1;i<=5;i++)
       {
           for(j=1;j<=5;j++)
           {
               System.out.print(j);
            }
            break;
        }
    }
}