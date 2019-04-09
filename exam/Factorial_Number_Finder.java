import java.util.*;
class Factorial_Number_Finder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean b=chkfact(n);
        if(b==true)
        System.out.println("FACTORIAL NO. "+findFactNum(n));
        else
        System.out.println("NOT FACTORIAL NO.");
    }
    public static boolean chkfact(int f)
    {
        boolean b=false;
        if(f==0||f==1||f==2)
        b=true;
        else
        {
            for(int i=1;i<=f/2;i++)
            {
                if(fact(i)==f)
                {
                    b=true;
                    break;
                }
            }
        }
        return b;
    }
    public static int fact(int n)
    {
        int f=1;
        for(int y=1;y<=n;y++)
        f*=y;
        return f;
    }
    public static int findFactNum(int num)
    {
        int i=1,f=1;
        while(f <= num)
        {
            if(f == num)
            return i-1;   
            f *= i;      
            i++;
        }    
        return 0;  
    }
}