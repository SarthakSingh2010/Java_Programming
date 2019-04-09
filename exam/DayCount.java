import java.io.*;
class DayCount
{
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    int year;int b=0,m,n,i;
    int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int flag=0,mon;
    public void takeData() throws Exception
    {
        System.out.println("Enter the Date:");
        b=Integer.parseInt(r.readLine());
        System.out.println("Enter the Month Number:");
        i=Integer.parseInt(r.readLine());
        System.out.println("Enter the year:");
        year=Integer.parseInt(r.readLine());

        System.out.println("Enter the number of days after which you want the date:");
        n=Integer.parseInt(r.readLine());
        if((year%100==0 && year%400==0) || (year%100!=0 && year %4==0))
            flag=1;

        for(;;)
        {
            b=b+a[i];
            if(i==2)
            {
                b=b+flag;
                flag=0;
            }
            if(b>n)
                break;
            i=i+1;
            if(i>11)
            {
                year++;
                if((year%100==0 && year%400==0) || (year%100!=0 && year %4==0))
                    flag=1;
                i=0;
            }
        }
        System.out.println("b = "+b+", a["+i+"] = "+a[i]);
        b=b-a[i];
        System.out.println("b = "+b+", n = "+n);
        n=n-b+1;
        //i=i+1;
        System.out.print(n+",");
        switch(i)
        {
            case 1:
            System.out.print("January");
            break;
            case 2:
            System.out.print("February");
            break;
            case 3:
            System.out.print("March");
            break;
            case 4:
            System.out.print("April");
            break;
            case 5:
            System.out.print("May");
            break;
            case 6:
            System.out.print("June");
            break;
            case 7:
            System.out.print("July");
            break;
            case 8:
            System.out.print("August");
            break;
            case 9:
            System.out.print("September");
            break;
            case 10:
            System.out.print("October");
            break;
            case 11:
            System.out.print("November");
            break;
            case 12:
            System.out.print("December");
            break;
        }
        System.out.println(" "+year);
    }
    public static void main(String args[]) throws Exception
    {
        DayCount ob=new DayCount();
        ob.takeData();
    }
 }