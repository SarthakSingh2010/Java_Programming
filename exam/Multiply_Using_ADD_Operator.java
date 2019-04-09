import java.util.*;
class Multiply_Using_ADD_Operator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 nos.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("("+a+") x ("+b+") = "+mulusingadd(a,b));
    }
    public static int mulusingadd(int a,int b)
    {
        int m=0;
        if(a==0||b==0)
        m=0;
        else if((a<0&&b<0)||(a>0&&b>0))
        {
            a=Math.abs(a);
            b=Math.abs(b);
            for(int i=1;i<=Math.min(a,b);i++)
            m=m+Math.max(a,b);
        }
        else if((a<0&&b>0)||(a>0&&b<0))
        {
            a=Math.abs(a);
            b=Math.abs(b);
            for(int i=1;i<=Math.min(a,b);i++)
            m=m+Math.max(a,b);
            m=-m;
        }
        return m;
    }
}