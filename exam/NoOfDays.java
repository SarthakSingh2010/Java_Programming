import java.io.*;
class NoOfDays
{
    int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int d1=-1,m1=-1,y1,d2=-1,m2=-1,y2,days=0,mon1,mon2;
    int i,j;
    String str,start,end;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void take() throws IOException
    {
        System.out.print("Enter the start date in dd/mm/yyyy format:");
        start=br.readLine();
        if (start.indexOf("/") > 0)
        {
            System.out.print("Enter the end date in dd/mm/yyyy format:");
            end=br.readLine();
            if (start.indexOf("/") > 0)
            {
                while(true)
                {
                    i=start.indexOf("/");
                    if(i< 0)
                        break;
                    str=start.substring(0,i);
                    if(d1==-1)
                        d1=Integer.parseInt(str);
                    else if(m1==-1)
                        m1=Integer.parseInt(str);
                    start=start.substring(i+1);
                }
                y1=Integer.parseInt(start);

                while(true)
                {
                    i=end.indexOf("/");
                    if(i< 0)
                        break;
                    str=end.substring(0,i);
                    if(d2==-1)
                        d2=Integer.parseInt(str);
                    else if(m2==-1)
                        m2=Integer.parseInt(str);
                    end=end.substring(i+1);
                }
                y2=Integer.parseInt(end);

                if ((y1 == y2) && (m1 == m2))
                    days=d2-d1;
                else
                {
                    if ((y1%4==0) && (m1==2))
                        days=(arr[m1-1]+1)-d1;
                    else
                        days=arr[m1-1]-d1;
                    days=days+d2;
                
                    m2=m2-1;
                    mon2=m2;
                    for(i=y1;i<=y2;i++)
                    {
                        if(i!=y1)
                            m1=0;
                        if(i!=y2)
                            m2=12;
                        else if(i==y2)
                            m2=mon2;
                        for(j=m1;j< m2;j++)
                        {
                            days=days+arr[j];
                        }
                        if((i%4 == 0) && m2>2)
                        days++;
                    }
                }
                System.out.println("Total number of days="+days);
            }
            else
                System.out.println("Wrong input...");
        }
        else
            System.out.println("Wrong input...");
    }
    public static void main(String args[]) throws Exception
    {
        System.out.print('\u000C'); // This statement is for clear output screen
        NoOfDays ob=new NoOfDays();
        ob.take();
    }
}