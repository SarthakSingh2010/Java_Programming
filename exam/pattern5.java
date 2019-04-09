class pattern5
{
    public static void main(String args[])
    {
        int k=1,n=1,m=0;
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
                for(int l=1;l<=n;l++)
                {
                    System.out.print(l);
                }
                for(k=m;k>=1;k--)
                {
                   System.out.print(k);
                }
                System.out.println();
                n++;
                m++;
        }
    }
}


