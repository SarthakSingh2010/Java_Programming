import java.util.*;
class recursion7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input");
        long num=sc.nextInt();
        String s;
        if(prime(num,(long)Math.sqrt(num))==0)
        s="no";
        else 
        s="yes";
        System.out.println(s);
    }
    public static int prime(long n,long k)
    {
        if(k==1)
        return 1;
        else
        {
            if(n%k==0)
            return 0;
            else
            return prime(n,k-1);
        } 
    }
}