import java.io.*;
class oddeven_digit
{   
     public static void main(String args[ ])throws IOException
        {
            int r=0,n;
            int ce=0,se=0,co=0,so=0;
            InputStreamReader a=new InputStreamReader(System.in);
            BufferedReader b=new BufferedReader(a);
            System.out.println("enter a no");
            String c=b.readLine();
            n=Integer.parseInt(c);
            while(n>0)
            {
                r=n%10;
                if(r%2==0)
                {
                    ce=ce+1;
                    se=se+r;
                }
                else
                 {
                    co=co+1;
                    so=so+r;
                }
               n=n/10;
            }
                System.out.println("Counter even="+ce);
                System.out.println("Sum even="+se);
                System.out.println("Counter odd="+co);
                System.out.println("Sum odd="+so);
            }
        }