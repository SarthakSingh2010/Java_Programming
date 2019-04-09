import java.io.*;
class passwordfilter
{
    public static void main(String str)
    {
        str=str+" ";
        String s1="",s2="";
        int k=0,l=0;
        l=str.length();
        int q=1 ;
        for(int i=0;i<str.length();i++)
        {
            s1="";
            for(int j=i;j<str.length()-1;j++)
            {
                s1=s1+str.charAt(j);
                k=s1.length();s2="";
                if(((l-(k+i)))>k )
                {
                    s2=s2+str.substring(j+1,j+1+k);
                    if(s1.compareTo(s2)==0)
                    
                       { i=str.length();
                           q=0;
                        break;
                       }
                }
            }
        }
        if(q==0)
        
            System.out.println(str+" passowrd is incorrect because of the repition of '"+s1+"'");
            else
            System.out.println(str+" password is correct");
    }
}