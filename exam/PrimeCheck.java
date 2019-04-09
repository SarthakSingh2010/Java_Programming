import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a limit:");
        int lim=sc.nextInt();
        int c=1;
        for(int num=2;num<=lim;num++)
        {
            boolean isPrime=true;
            for(int i=2;i*i<=num;i++)
            {
                int temp=num%i;   
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true)
            {
                System.out.printf("%4d    ",num);
                c++;
            }
            if(c==18)
            {
                System.out.println();
                c=1;
            }
        }
   }
}