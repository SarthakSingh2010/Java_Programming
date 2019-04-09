import java.util.*;
public class test
{
    public static void main(String args[])
    {
        test obj=new test();
        //System.out.println("input");
        Scanner sc=new Scanner(System.in);
        int simon=sc.nextInt();
        int antisimon=sc.nextInt();
        int totalheap=sc.nextInt();
        int heaptake=0;
        int heapleft=0;
        int flag=0;
        while(heaptake<=heapleft)
        {
            if(flag==0)
            {
                heaptake=obj.gcd(simon,totalheap);
                heapleft=totalheap-heaptake;
                totalheap=heapleft;
                flag=1;
            }
            else
            {
                heaptake=obj.gcd(antisimon,totalheap);
                heapleft=totalheap-heaptake;
                totalheap=heapleft;
                flag=0;
            }
        }
        if(flag==1)
        System.out.println("0");
        else
        System.out.println("1");
    }
    public  int gcd(int m,int n)
    {
        int r=0;
        for(int i=1;i<=Math.min(m,n);i++)
        {
            if(m%i==0&&n%i==0)
            r=i;
        }
        return r;
    }
}