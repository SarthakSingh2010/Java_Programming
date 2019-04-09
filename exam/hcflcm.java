class hcflcm
{
    int a,b;
    hcflcm(int x,int y)
    {
        a=x;
        b=y;
    }
    public void calculate()
    {
        int min=0,hcf=0,prod=1,lcm=0;
        if(a<b)
            min=a;
        else
            min=b;
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            hcf=i;
        }
        System.out.println("HCF+"+hcf);
        prod=a*b;
        lcm=prod/hcf;
        System.out.println("LCM="+lcm);
    }
}
