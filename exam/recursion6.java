class recursion6
{
    public static void main(int a,int b)
    {
        System.out.println(pow(a,b));
    }
    public static int pow(int m,int n) 
    {
        if(n==0)
        return 1;
        else
        if(n==1)
        return m;
        else
        return (m*pow(m,n-1));
    }
}