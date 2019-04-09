class PrimeFactors
{
    public static void main(int n)
    {
        int k1=n;
        for(int i=2;i<=k1;i++)
        {
            if(k1%i==0)
            {
                System.out.println(i);
                k1=k1/i;
                i--;
            }
        }
    }
}