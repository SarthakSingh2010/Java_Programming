class recursion4 
{
    public static void main(int a,int b)
    {   
        int k=gcd(a,b);
        System.out.println(k);
    }
    public static int gcd(int n1, int n2) 
    {
        if(n2 == 0)
        {
            return n1;
        }
        else
        {
            return gcd(n2,n1%n2);
        }
    }
}