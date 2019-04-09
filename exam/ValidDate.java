import java.io.*;
import java.lang.System;
class ValidDate
{
    public void show() throws IOException
    {
        int flag,leap,i,num,mon1=0,day1=0,year1=0;
        int dpm[]={31,28,31,30,31,30,31,31,30,31,30,31};
        leap=0;
        flag=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //clrscr();
        while (flag==1)
        {
            try
            {
                if (flag==1)
                    System.out.print('\u000C'); // This statement is for clear output screen
                System.out.println("\nInput[ddmmyy]:");
                num=Integer.parseInt(br.readLine());
                year1=num%100;
                num=num/100;
                mon1=num%100;
                num=num/100;
                day1=num;
                flag=0;
                if(year1%100==0 && year1%400==0)
                    leap=1;
                else if(year1%100!=0 && year1%4==0)
                    leap=1;
                if(mon1==2 && leap==1 && dpm[mon1-1]>28)
                    flag=1;
                else if(mon1==2 && leap==0 && dpm[mon1-1]>28)
                    flag=1;
                else if(day1>dpm[mon1-1])
                    flag=1;
            }
            catch(Exception e)
            {
                System.out.println("Wrong input");
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("\nInvalid Date...");
            return;
        }
        leap=day1%10;
        System.out.println("\nOUTPUT: "+ day1);
        switch(leap)
        {
            case 0:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print(" th");
                break;
            case 1:
                System.out.print(" st");
                break;
            case 2:
                System.out.print(" nd");
                break;
            case 3:
                System.out.print(" rd");
                break;
        }

        switch(mon1)
        {
            case 1:
                System.out.print(" January,");
                break;
            case 2:
                System.out.print(" February,");
                break;
            case 3:
                System.out.print(" March,");
                break;
            case 4:
                System.out.print(" April,");
                break;
            case 5:
                System.out.print(" May,");
                break;
            case 6:
                System.out.print(" June,");
                break;
            case 7:
                System.out.print(" July,");
                break;
            case 8:
                System.out.print(" August,");
                break;
            case 9:
                System.out.print(" September,");
                break;
            case 10:
                System.out.print(" October,");
                break;
            case 11:
                System.out.print(" November,");
                break;
            case 12:
                System.out.print(" December,");
                break;
        }
        System.out.print(year1);
   }
 }