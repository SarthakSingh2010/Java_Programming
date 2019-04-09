import java.io.*;
class DaysAdd
{
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    int year,year1;int d=0,d1,m,m1,n,n1,i;
    int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int flag=0,mon;
    public void takeData() throws Exception
    {
        System.out.println("Enter the Date:");
        d=Integer.parseInt(r.readLine());
        d1=d;
        System.out.println("Enter the Month Number:");
        m=Integer.parseInt(r.readLine());
        m1=m-1;
        System.out.println("Enter the year:");
        year=Integer.parseInt(r.readLine());
        year1=year;
        if (year1 % 4 == 0)
            flag = 1;
        else
            flag = 0;

        System.out.println("Enter the number of days after which you want the date:");
        n=Integer.parseInt(r.readLine());
        n1=n;
        while(n1>0)
        {
            i = a[m1] + ((m1==1) ? flag : 0);
            if ((i - d1) >= n1)
            {   
                d1+=n1;
                n1=0;
            }
            else
            {
                n1 -= (i - d1);
                d1=0;
                m1++;
                if (m1>11)
                {
                    m1=0;
                    year1++;
                    if (year1 % 4 == 0)
                        flag = 1;
                    else
                        flag = 0;
                }
            }    
        }
        System.out.print(d1+",");
        switch(m1)
        {
            case 0:
                System.out.print("January");
                break;
            case 1:
                System.out.print("February");
                break;
            case 2:
                System.out.print("March");
                break;
            case 3:
                System.out.print("April");
                break;
            case 4:
                System.out.print("May");
                break;
            case 5:
                System.out.print("June");
                break;
            case 6:
                System.out.print("July");
                break;
            case 7:
                System.out.print("August");
                break;
            case 8:
                System.out.print("September");
                break;
            case 9:
                System.out.print("October");
                break;
            case 10:
                System.out.print("November");
                break;
            case 11:
                System.out.print("December");
                break;
        }
        System.out.println(" "+year1);
    }
    public static void main(String args[]) throws Exception
    {
        DaysAdd da1 = new DaysAdd();
        da1.takeData();
    }
}