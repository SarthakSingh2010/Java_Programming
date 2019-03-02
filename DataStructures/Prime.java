import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n)==true?"YES":"NO");
    }
    public static boolean solve(int n)
    {
        if(n<2)
        return false;
        if(n==2)
        return true;
        if(n%2==0)
        return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}