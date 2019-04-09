class thousandthPRIMEnumber
{
    public boolean prime(long a)
    {
        boolean m=true;
        for(int k=2;k<a;k++)
        {
            if(a%k==0)
            {
                m=false;
                break;
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        thousandthPRIMEnumber obj =new thousandthPRIMEnumber();
        int c=0;
        long m=2;
        for(long i=2;i<=10000;i++)
        {
            if(obj.prime(i)==true)
            {
                m=i;
                c++;
            }
            if(c==1000)
            {
                System.out.println(m);
                break;
            }
        }
    }
}
        