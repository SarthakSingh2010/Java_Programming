class Recursion1
{
    public static void main(int n)
    {
        System.out.println(sum(n));
    }
    public static int sum(int k)
    {
        if(k==0)
        return 0;
        else
        {
            return (k+sum(k-1));
        }
    }
}
    