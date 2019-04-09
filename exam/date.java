import java.io.*;
class date
 {public static void main()throws IOException
   {BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    System.out.println("date");
    String str=br.readLine();
    int d=Integer.parseInt(str.substring(0,str.indexOf('/')));
    int m=Integer.parseInt(str.substring(str.indexOf('/')+1,str.lastIndexOf('/')));
    int y=Integer.parseInt(str.substring(str.lastIndexOf('/')+1));
    boolean flag=false;
    if(y>0&&m>0&&m<13)
     {if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
       {if(d>=0&&d<=31)
        flag=true;
       } 
      else if(m==4||m==6||m==9||m==11)
       {if(d>=0&&d<=30)
        flag=true;
       }
      else if(m==2)
       {if(y%100==0)
         {
             if(y%400==0)
             if(d>=0&&d<=29)
           flag=true;
         }
        else if(y%4==0)
         {if(d>=0&&d<=29)
           flag=true;
         }
        else
         {if(d>=0&&d<=28)
          flag=true;
         }
       }
     }
    if(flag==true)
     System.out.println("valid");
    else
     System.out.println("invalid");
    }
}